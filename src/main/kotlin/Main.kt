import br.edu.`if`.robot.MenuPrincipal
import br.edu.`if`.robot.ProcessadorEntrada

fun main() {
    val robo = MenuPrincipal.escolherRobo() ?: return

    println("Digite suas mensagens para conversar com o Marciano.")
    println("Digite FIM para encerrar.")
    println()
4
    while (true) {
        print("👤 Você: ")
        val entrada = readlnOrNull() ?: ""

        if (entrada.equals("FIM", ignoreCase = true)) {
            println("🤖 Marciano: Encerrando interação. Até mais!")
            break
        }

        val resposta = ProcessadorEntrada.processar(entrada, robo)
        println("🤖 Marciano: $resposta")

        if (ProcessadorEntrada.deveExecutarAcaoPremium(entrada, robo)) {
            ProcessadorEntrada.executarAcaoPremium(robo)
        }

        println()
    }
}