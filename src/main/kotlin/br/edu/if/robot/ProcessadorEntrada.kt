package br.edu.`if`.robot

/*
 * Classe responsável por processar a entrada digitada pelo usuário.
 *
 * Ela separa a leitura do terminal das regras internas do robô.
 * O Main.kt apenas lê a entrada e delega o processamento para esta classe.
 */
object ProcessadorEntrada {

    fun processar(entrada: String, robo: Marciano): String {
        val partes = entrada.trim().split("\\s+".toRegex())

        /*
         * RF002 - Operações matemáticas.
         *
         * As operações só são tratadas como operações matemáticas
         * quando o robô escolhido for uma versão avançada ou premium.
         */
        if (robo is MarcianoAvancado && ehComandoMatematico(partes)) {
            val operacao = partes[0]
            val primeiroNumero = partes[1].toDoubleOrNull()
            val segundoNumero = partes[2].toDoubleOrNull()

            if (primeiroNumero == null || segundoNumero == null) {
                return "Erro: os operandos devem ser números"
            }

            return robo.responda(operacao, primeiroNumero, segundoNumero)
        }

        return robo.responda(entrada)
    }

    fun deveExecutarAcaoPremium(entrada: String, robo: Marciano): Boolean {
        return robo is MarcianoPremium && robo.deveExecutarAcao(entrada)
    }

    fun executarAcaoPremium(robo: Marciano) {
        if (robo is MarcianoPremium) {
            robo.executarAcaoPersonalizada()
        }
    }

    private fun ehComandoMatematico(partes: List<String>): Boolean {
        if (partes.size != 3) {
            return false
        }

        val operacoes = listOf("some", "subtraia", "multiplique", "divida")
        return partes[0].lowercase() in operacoes
    }
}