package br.edu.`if`.robot

/*
 * RF003 - Versão premium do robô.
 *
 * Esta classe herda as funcionalidades anteriores e recebe
 * uma ação personalizada por interface.
 */
class MarcianoPremium(
    private val acaoPersonalizada: AcaoPersonalizada
) : MarcianoAvancado() {

    /*
     * RF003.1 - Quando o comando "agir" for usado exatamente,
     * em letras minúsculas, o robô deverá responder "É pra já!".
     *
     * Caso a palavra seja digitada em maiúsculas, como "AGIR",
     * será tratada como grito pela regra básica do robô.
     */
    override fun responda(mensagem: String): String {
        if (deveExecutarAcao(mensagem)) {
            return "É pra já!"
        }

        return super.responda(mensagem)
    }

    /*
     * RF003.2 - Executa a ação personalizada recebida por interface
     * na instanciação da versão premium.
     */
    fun executarAcaoPersonalizada() {
        acaoPersonalizada.executar()
    }

    /*
     * Verifica se o comando premium foi usado exatamente como "agir".
     */
    fun deveExecutarAcao(mensagem: String): Boolean {
        return mensagem.trim() == "agir"
    }
}