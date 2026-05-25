package br.edu.`if`.robot

/*
 * RNF005 - Simulação de interação via terminal.
 *
 * Objeto responsável por exibir o menu principal e permitir
 * que o usuário escolha qual versão do robô deseja utilizar.
 */
object MenuPrincipal {

    fun escolherRobo(): Marciano? {
        while (true) {
            println("======================================")
            println(" Robô Marciano em Kotlin")
            println("======================================")
            println("1 - Usar versão básica")
            println("2 - Usar versão avançada")
            println("3 - Usar versão premium")
            println("4 - Sobre")
            println("0 - Sair")
            print("Escolha uma opção: ")

            when (readlnOrNull()?.trim()) {
                "1" -> {
                    println()
                    println("Versão básica selecionada.")
                    println()
                    return Marciano()
                }

                "2" -> {
                    println()
                    println("Versão avançada selecionada.")
                    println()
                    return MarcianoAvancado()
                }

                "3" -> {
                    println()
                    println("Versão premium selecionada.")
                    println()
                    return MarcianoPremium(RoboSay())
                }

                "4" -> {
                    mostrarSobre()
                }

                "0" -> {
                    println()
                    println("Programa encerrado.")
                    return null
                }

                else -> {
                    println()
                    println("Opção inválida. Tente novamente.")
                    println()
                }
            }
        }
    }

    /*
     * Exibe uma tela de informações em estilo CLI clássico.
     *
     * A tela explica o funcionamento geral do programa, as versões disponíveis,
     * os comandos aceitos e a ação personalizada da versão premium.
     */
    private fun mostrarSobre() {
        limparVisualmenteTela()

        println(
            """
            ========================================================================
                             ROBO MARCIANO - SISTEMA INTERATIVO
            ========================================================================

            IDENTIFICACAO DO PROGRAMA
            ------------------------------------------------------------------------
            Nome do sistema : Robo Marciano em Kotlin
            Tipo            : Aplicacao CLI
            Execucao        : Terminal / Linha de comando
            Linguagem       : Kotlin
            Finalidade      : Demonstrar conceitos de classes, heranca, interfaces,
                              funcoes, entrada de dados e controle de fluxo.

            DESCRICAO GERAL
            ------------------------------------------------------------------------
            Este programa implementa um robo chamado Marciano. O robo recebe mensagens
            digitadas pelo usuario no terminal e responde de acordo com regras
            previamente definidas.

            A interacao ocorre em modo texto. O usuario digita uma mensagem, pressiona
            ENTER, recebe a resposta do robo e pode continuar interagindo ate digitar
            o comando FIM.

            VERSOES DISPONIVEIS
            ------------------------------------------------------------------------
            [1] Versao Basica

                Responde mensagens comuns conforme as seguintes regras:

                - Perguntas:
                  Entrada terminada com ?
                  Resposta: Certamente

                - Gritos:
                  Mensagem contendo palavra em letras maiusculas
                  Resposta: Opa! Calma ai!

                - Pergunta gritada:
                  Pergunta contendo grito
                  Resposta: Relaxa, eu sei o que estou fazendo!

                - Frases com a palavra "eu":
                  Resposta: A responsabilidade e sua

                - Mensagem vazia:
                  ENTER sem texto ou apenas espacos em branco
                  Resposta: Nao me incomode

                - Qualquer outra mensagem:
                  Resposta: Tudo bem, como quiser

            [2] Versao Avancada

                Possui todas as funcionalidades da versao basica e tambem executa
                operacoes matematicas simples.

                Formato dos comandos:

                some 10 5
                subtraia 10 5
                multiplique 10 5
                divida 10 5

                A resposta das operacoes inicia com:

                Essa eu sei

            [3] Versao Premium

                Possui todas as funcionalidades anteriores e inclui uma acao
                personalizada definida por interface.

                O comando premium e:

                agir

                Observacao importante:
                O comando premium deve ser digitado exatamente em letras minusculas.
                Se o usuario digitar AGIR, o robo interpreta como grito e responde
                conforme a regra da versao basica.

            ACAO PERSONALIZADA ROBO SAY
            ------------------------------------------------------------------------
            Quando o comando agir for usado na versao premium, o sistema executa uma
            funcionalidade inspirada no utilitario CowSay do Linux.

            A acao personalizada realiza os seguintes passos:

            1. O robo responde:
               E pra ja!

            2. Em seguida, o programa escolhe uma frase aleatoria sobre tecnologia.

            3. A frase e exibida no terminal dentro de um balao de fala.

            4. Abaixo do balao, um pequeno robo em arte ASCII e renderizado.

            5. Ao final, o sistema retorna ao modo de interacao normal, aguardando
               uma nova mensagem do usuario.

            COMANDO DE ENCERRAMENTO
            ------------------------------------------------------------------------
            Durante a conversa com o robo, digite:

            FIM

            para encerrar a interacao.

            ========================================================================
            FIM DA TELA DE INFORMACOES
            ========================================================================
            """.trimIndent()
        )

        aguardarEnter()
    }

    /*
     * Pausa a tela de informações até que o usuário pressione ENTER.
     */
    private fun aguardarEnter() {
        println()
        print("Pressione ENTER para retornar ao menu principal...")
        readlnOrNull()
        println()
    }

    /*
     * Simula uma pequena limpeza visual de tela sem depender
     * de comandos específicos do sistema operacional.
     */
    private fun limparVisualmenteTela() {
        repeat(3) {
            println()
        }
    }
}