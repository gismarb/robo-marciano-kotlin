import br.edu.`if`.robot.MarcianoAvancado

fun main() {
    val robo = MarcianoAvancado()

    println("Teste da versão avançada do Robô Marciano")
    println("-----------------------------------------")

    println("👤 Usuário: Tudo bem?")
    println("🤖 Marciano: ${robo.responda("Tudo bem?")}")
    println()

    println("👤 Usuário: PARE")
    println("🤖 Marciano: ${robo.responda("PARE")}")
    println()

    println("👤 Usuário: some 10 5")
    println("🤖 Marciano: ${robo.responda("some", 10.0, 5.0)}")
    println()

    println("👤 Usuário: subtraia 10 5")
    println("🤖 Marciano: ${robo.responda("subtraia", 10.0, 5.0)}")
    println()

    println("👤 Usuário: multiplique 10 5")
    println("🤖 Marciano: ${robo.responda("multiplique", 10.0, 5.0)}")
    println()

    println("👤 Usuário: divida 10 5")
    println("🤖 Marciano: ${robo.responda("divida", 10.0, 5.0)}")
    println()

    println("👤 Usuário: divida 10 0")
    println("🤖 Marciano: ${robo.responda("divida", 10.0, 0.0)}")
    println()

    println("👤 Usuário: raiz 10 5")
    println("🤖 Marciano: ${robo.responda("raiz", 10.0, 5.0)}")
}