package br.edu.`if`.robot

/*
 * Classe avançada do robô Marciano.
 *
 * Requisito relacionado:
 * RF002 - Versão avançada com operações matemáticas.
 */
open class MarcianoAvancado : Marciano() {

    /*
     * RF002.1, RF002.2 e RF002.3
     * O robô poderá receber operações matemáticas básicas
     * e responder com "Essa eu sei", seguida do resultado.
     */
    open fun responda(operacao: String, primeiroNumero: Double, segundoNumero: Double): String {
        return "Essa eu sei: operação ainda não implementada"
    }
}