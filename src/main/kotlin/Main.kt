import br.edu.`if`.robot.MarcianoPremium
import br.edu.`if`.robot.RoboSay

fun main() {
    val robo = MarcianoPremium(RoboSay())

    println("Teste da versão premium do Robô Marciano")
    println("----------------------------------------")
    println()

    val mensagensDeTeste = listOf(
        "Tudo bem?",
        "PARE",
        "PARE?",
        "eu quero testar",
        "agir",
        "AGIR",
        "Agir",
        "eu quero agir agora",
        "Marciano, você pode agir?",
        "Olá Marciano"
    )

    for (mensagem in mensagensDeTeste) {
        println("👤 Usuário: $mensagem")

        val resposta = robo.responda(mensagem)
        println("🤖 Marciano: $resposta")

        if (robo.deveExecutarAcao(mensagem)) {
            robo.executarAcaoPersonalizada()
        }

        println()
    }
}