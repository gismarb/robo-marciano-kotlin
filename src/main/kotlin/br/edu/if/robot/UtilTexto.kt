package br.edu.`if`.robot

/*
 * Objeto utilitário para concentrar funções auxiliares
 * relacionadas à análise de texto.
 */
object UtilTexto {

    /*
     * RF001.6 - Mensagem vazia.
     *
     * Considera mensagem vazia quando o usuário pressiona ENTER
     * sem digitar nada ou digita apenas espaços em branco.
     */
    fun estaVazia(mensagem: String): Boolean {
        return mensagem.trim().isEmpty()
    }

    /*
     * RF001.2 - Pergunta.
     *
     * Considera pergunta quando a mensagem termina com o caractere "?".
     */
    fun ehPergunta(mensagem: String): Boolean {
        return mensagem.trim().endsWith("?")
    }

    /*
     * RF001.3 - Grito.
     *
     * Considera grito quando existe pelo menos uma palavra formada
     * por letras e essa palavra está completamente em maiúsculas.
     *
     * Exemplos:
     * "OI"            -> grito
     * "Você está BEM" -> grito
     * "123"           -> não é grito
     * "Oi"            -> não é grito
     */
    fun contemGrito(mensagem: String): Boolean {
        val palavras = mensagem.split("\\s+".toRegex())

        return palavras.any { palavra ->
            val somenteLetras = palavra.filter { it.isLetter() }

            somenteLetras.isNotEmpty() &&
                    somenteLetras == somenteLetras.uppercase() &&
                    somenteLetras.length > 1
        }
    }

    /*
     * RF001.5 - Palavra "eu".
     *
     * Verifica se a mensagem contém a palavra "eu",
     * ignorando letras maiúsculas e minúsculas.
     *
     * A expressão regular evita capturar "eu" dentro de outra palavra.
     */
    fun contemPalavraEu(mensagem: String): Boolean {
        val regex = Regex("\\beu\\b", RegexOption.IGNORE_CASE)
        return regex.containsMatchIn(mensagem)
    }
}