package br.edu.`if`.robot

/*
 * Classe base do robô Marciano.
 *
 * Requisito relacionado:
 * RF001 - Versão básica do robô.
 */
open class Marciano {

    /*
     * RF001.1 - O robô deverá ser capaz de responder a frases
     * ao ser dirigido usando a função responda().
     */
    open fun responda(mensagem: String): String {
        return "Tudo bem, como quiser"
    }
}