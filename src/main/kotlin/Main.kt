import br.edu.`if`.robot.MarcianoPremium
import br.edu.`if`.robot.RoboSay

fun main() {
    val robo = MarcianoPremium(RoboSay())

    mostrarAbertura()

    while (true) {
        print("👤 Você: ")
        val entrada = readlnOrNull() ?: ""

        if (entrada.equals("FIM", ignoreCase = true)) {
            println("🤖 Marciano: Encerrando interação. Até mais!")
            break
        }

        val resposta = processarEntrada(entrada, robo)
        println("🤖 Marciano: $resposta")

        if (robo.deveExecutarAcao(entrada)) {
            robo.executarAcaoPersonalizada()
        }

        println()
    }
}

fun mostrarAbertura() {
    println("======================================")
    println(" Robô Marciano em Kotlin - Versão CLI ")
    println("======================================")
    println()
    println("Digite frases para conversar com o robô.")
    println()
    println("Exemplos:")
    println("- Tudo bem?")
    println("- PARE")
    println("- PARE?")
    println("- eu quero testar")
    println("- some 10 5")
    println("- subtraia 10 5")
    println("- multiplique 10 5")
    println("- divida 10 5")
    println("- agir")
    println()
    println("Digite FIM para encerrar.")
    println()
}

fun processarEntrada(entrada: String, robo: MarcianoPremium): String {
    val partes = entrada.trim().split("\\s+".toRegex())

    if (ehComandoMatematico(partes)) {
        val operacao = partes[0]
        val primeiroNumero = partes[1].toDoubleOrNull()
        val segundoNumero = partes[2].toDoubleOrNull()

        if (primeiroNumero == null || segundoNumero == null) {
            return "Erro: os operandos devem ser números"
        }

        return robo.responda(operacao, primeiroNumero, segundoNumero)
    }

    return robo.responda(entrada)
}

fun ehComandoMatematico(partes: List<String>): Boolean {
    if (partes.size != 3) {
        return false
    }

    val operacoes = listOf("some", "subtraia", "multiplique", "divida")
    return partes[0].lowercase() in operacoes
}