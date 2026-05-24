package br.edu.`if`.robot

/*
 * RF001 - Versão básica do robô.
 *
 * Classe base do robô Marciano.
 */
open class Marciano {

    /*
     * RF001.1 - O robô deverá responder às mensagens recebidas
     * usando a função responda().
     *
     * Ordem das regras:
     * 1. mensagem vazia;
     * 2. pergunta gritada;
     * 3. grito;
     * 4. pergunta;
     * 5. palavra "eu";
     * 6. qualquer outra mensagem.
     */
    open fun responda(mensagem: String): String {
        val mensagemVazia = UtilTexto.estaVazia(mensagem)
        val pergunta = UtilTexto.ehPergunta(mensagem)
        val grito = UtilTexto.contemGrito(mensagem)
        val contemEu = UtilTexto.contemPalavraEu(mensagem)

        /*
         * RF001.6 - Se alguém se dirigir ao robô sem dizer
         * nenhuma palavra, ele deverá responder "Não me incomode".
         */
        if (mensagemVazia) {
            return "Não me incomode"
        }

        /*
         * RF001.4 - Se alguém gritar com ele em uma pergunta,
         * ele deverá responder "Relaxa, eu sei o que estou fazendo!".
         */
        if (pergunta && grito) {
            return "Relaxa, eu sei o que estou fazendo!"
        }

        /*
         * RF001.3 - Se alguém gritar com ele, ele deverá responder
         * "Opa! Calma aí!".
         */
        if (grito) {
            return "Opa! Calma aí!"
        }

        /*
         * RF001.2 - Se alguém fizer uma pergunta a ele,
         * ele deverá responder "Certamente".
         */
        if (pergunta) {
            return "Certamente"
        }

        /*
         * RF001.5 - Caso alguém fale alguma coisa que use a palavra "eu",
         * com ou sem maiúsculas, ele responde "A responsabilidade é sua".
         */
        if (contemEu) {
            return "A responsabilidade é sua"
        }

        /*
         * RF001.7 - Caso alguém fale qualquer outra coisa,
         * ele responde "Tudo bem, como quiser".
         */
        return "Tudo bem, como quiser"
    }
}