package br.edu.`if`.robot

/*
 * RF002 - Versão avançada do robô.
 *
 * Esta classe herda as funcionalidades da versão básica
 * e adiciona suporte a operações matemáticas.
 */
open class MarcianoAvancado : Marciano() {

    /*
     * RF002.1, RF002.2 e RF002.3 - Operações matemáticas.
     *
     * O robô poderá receber uma operação e dois operandos,
     * retornando "Essa eu sei", seguida do resultado.
     *
     * Operações disponíveis:
     * - some;
     * - subtraia;
     * - multiplique;
     * - divida.
     */
    open fun responda(
        operacao: String,
        primeiroNumero: Double,
        segundoNumero: Double
    ): String {
        val resultado = when (operacao.lowercase()) {
            "some" -> primeiroNumero + segundoNumero
            "subtraia" -> primeiroNumero - segundoNumero
            "multiplique" -> primeiroNumero * segundoNumero
            "divida" -> {
                if (segundoNumero == 0.0) {
                    return "Erro: não é possível dividir por zero"
                }

                primeiroNumero / segundoNumero
            }
            else -> {
                return "Erro: operação não reconhecida"
            }
        }

        return "Essa eu sei: $resultado"
    }
}