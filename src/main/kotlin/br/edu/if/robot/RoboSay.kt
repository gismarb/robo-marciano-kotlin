package br.edu.`if`.robot

/*
 * RF003.3 - Ação personalizada escolhida.
 *
 * Ação inspirada no CowSay do Linux.
 * Esta classe exibe uma frase aleatória em um balão de fala
 * com um robô em ASCII no terminal.
 */
class RoboSay : AcaoPersonalizada {

    private val frases = listOf(
        Frase(
            "A tecnologia move o mundo, mas a criatividade ainda guia o caminho.",
            "Autor desconhecido"
        ),
        Frase(
            "Qualquer tecnologia suficientemente avançada é indistinguível da magia.",
            "Arthur C. Clarke"
        ),
        Frase(
            "Programar é ensinar o computador a resolver problemas.",
            "Autor desconhecido"
        ),
        Frase(
            "A simplicidade é o último grau de sofisticação.",
            "Leonardo da Vinci"
        ),
        Frase(
            "A tecnologia é melhor quando aproxima as pessoas.",
            "Matt Mullenweg"
        ),
        Frase(
            "O computador nasceu para resolver problemas que antes não existiam.",
            "Bill Gates"
        ),
        Frase(
            "Não basta funcionar, também precisa ser compreensível.",
            "Autor desconhecido"
        ),
        Frase(
            "Código limpo é aquele que outro programador consegue entender.",
            "Autor desconhecido"
        ),
        Frase(
            "A melhor forma de prever o futuro é criá-lo.",
            "Peter Drucker"
        ),
        Frase(
            "Toda grande solução começa com uma boa pergunta.",
            "Autor desconhecido"
        )
    )

    override fun executar() {
        val frase = frases.random()
        imprimirBalao(frase)
        imprimirRobo()
    }

    private fun imprimirBalao(frase: Frase) {
        val mensagem = "\"${frase.texto}\" - ${frase.autor}"
        val largura = mensagem.length + 2

        println(" " + "_".repeat(largura))
        println("< $mensagem >")
        println(" " + "-".repeat(largura))
    }

    private fun imprimirRobo() {
        println(
            """
                 \
                  \
                   [o_o]
                   /|_|\
                    / \
            """.trimIndent()
        )
    }
}