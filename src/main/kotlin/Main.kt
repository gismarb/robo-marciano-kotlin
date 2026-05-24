import br.edu.`if`.robot.Marciano

fun main() {
    val robo = Marciano()

    println("Teste da versão básica do Robô Marciano")
    println("---------------------------------------")

    val mensagensDeTeste = listOf(
        "",
        "Tudo bem?",
        "PARE",
        "PARE?",
        "eu quero testar",
        "Olá Marciano"
    )

    for (mensagem in mensagensDeTeste) {
        println("👤 Usuário: $mensagem")
        println("🤖 Marciano: ${robo.responda(mensagem)}")
        println()
    }
}