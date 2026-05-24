import br.edu.`if`.robot.MarcianoPremium
import br.edu.`if`.robot.RoboSay

fun main() {
    val robo = MarcianoPremium(RoboSay())

    println("Projeto Robô Marciano em Kotlin iniciado.")
    println("Robô carregado: ${robo::class.simpleName}")
}