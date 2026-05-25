# Robô Marciano em Kotlin

Projeto desenvolvido para a atividade avaliativa de **Linguagens de Programação Móvel**, utilizando a linguagem **Kotlin** em uma aplicação de linha de comando (**CLI**).

O objetivo do projeto é implementar um robô chamado **Marciano**, capaz de responder mensagens digitadas pelo usuário, executar operações matemáticas básicas e, em sua versão premium, realizar uma ação personalizada.

## Visão geral

O programa é executado pelo terminal e apresenta um menu inicial para escolha da versão do robô:

- **Versão básica**: responde frases conforme regras definidas no enunciado da atividade;
- **Versão avançada**: mantém as respostas da versão básica e adiciona operações matemáticas;
- **Versão premium**: mantém as funcionalidades anteriores e executa uma ação personalizada com o comando `agir`;
- **Sobre**: apresenta informações gerais sobre o funcionamento do programa;
- **Sair**: encerra o programa.

Durante a interação com o robô, o usuário pode digitar mensagens livremente. A conversa é encerrada quando o comando `FIM` é informado.

## Funcionalidades implementadas

### Robô básico

A versão básica do robô responde de acordo com as seguintes regras:

| Situação | Resposta |
|---|---|
| Pergunta | `Certamente` |
| Grito | `Opa! Calma aí!` |
| Pergunta gritada | `Relaxa, eu sei o que estou fazendo!` |
| Frase com a palavra `eu` | `A responsabilidade é sua` |
| Mensagem vazia | `Não me incomode` |
| Qualquer outra mensagem | `Tudo bem, como quiser` |

### Robô avançado

A versão avançada herda as funcionalidades da versão básica e adiciona operações matemáticas simples:

```text
some 10 5
subtraia 10 5
multiplique 10 5
divida 10 5
```

A resposta das operações inicia com:

```text
Essa eu sei
```

### Robô premium

A versão premium herda as funcionalidades anteriores e adiciona uma ação personalizada acionada pelo comando:

```text
agir
```

O comando deve ser digitado exatamente em letras minúsculas. Caso o usuário digite `AGIR`, o robô interpreta como grito e responde conforme a regra da versão básica.

Quando o comando `agir` é executado, o robô responde:

```text
É pra já!
```

Em seguida, o programa exibe uma frase aleatória sobre tecnologia em um balão de fala e renderiza um pequeno robô em arte ASCII no terminal, em uma funcionalidade inspirada no utilitário **CowSay** do Linux.

## Estrutura do projeto

```text
robo-marciano-kotlin/
├── build.gradle.kts
├── settings.gradle.kts
├── README.md
├── docs/
│   ├── manual_execucao.md
│   ├── requisitos_resumidos.md
│   └── roteiro_testes.md
└── src/
    └── main/
        └── kotlin/
            ├── Main.kt
            └── br/
                └── edu/
                    └── if/
                        └── robot/
                            ├── AcaoPersonalizada.kt
                            ├── Frase.kt
                            ├── Marciano.kt
                            ├── MarcianoAvancado.kt
                            ├── MarcianoPremium.kt
                            ├── MenuPrincipal.kt
                            ├── ProcessadorEntrada.kt
                            ├── RoboSay.kt
                            └── UtilTexto.kt
```

## Principais classes

| Arquivo | Responsabilidade |
|---|---|
| `Main.kt` | Inicia o programa e controla o loop principal de interação. |
| `MenuPrincipal.kt` | Exibe o menu inicial, opção Sobre e seleção da versão do robô. |
| `ProcessadorEntrada.kt` | Processa a entrada digitada pelo usuário e direciona para a resposta adequada. |
| `Marciano.kt` | Implementa a versão básica do robô. |
| `MarcianoAvancado.kt` | Implementa operações matemáticas básicas. |
| `MarcianoPremium.kt` | Implementa a versão premium com ação personalizada. |
| `AcaoPersonalizada.kt` | Interface usada pela versão premium. |
| `RoboSay.kt` | Ação personalizada que exibe frase e robô ASCII no terminal. |
| `Frase.kt` | Estrutura de dados para armazenar texto e autor das frases. |
| `UtilTexto.kt` | Funções auxiliares para análise de texto. |

## Documentação

A documentação complementar do projeto está disponível na pasta [`docs`](docs/):

- [Requisitos resumidos](docs/requisitos_resumidos.md)
- [Roteiro de testes manuais](docs/roteiro_testes.md)
- [Manual de execução via terminal](docs/manual_execucao.md)

## Requisitos de ambiente

Para executar o projeto, recomenda-se utilizar:

- Java 17 ou superior;
- Kotlin/JVM;
- Gradle Wrapper incluído no projeto;
- IntelliJ IDEA ou terminal Linux.

O projeto foi configurado para usar toolchain Java 17 no Gradle.

## Execução pela IDE

No IntelliJ IDEA:

1. Abra o projeto pela pasta raiz;
2. Aguarde a sincronização do Gradle;
3. Abra o arquivo `Main.kt`;
4. Execute a função `main()` pelo botão de execução da IDE.

## Execução pelo terminal com Gradle

Na raiz do projeto, execute:

```bash
./gradlew run
```

Caso o arquivo `gradlew` não tenha permissão de execução:

```bash
chmod +x gradlew
./gradlew run
```

## Execução como distribuição local

Para gerar uma distribuição local mais limpa para teste:

```bash
./gradlew clean installDist
```

Depois execute:

```bash
./build/install/robo-marciano-kotlin/bin/robo-marciano-kotlin
```

Essa forma evita a exibição das mensagens padrão do Gradle durante a interação com o programa.

## Exemplos de uso

### Conversa básica

```text
👤 Você: Tudo bem?
🤖 Marciano: Certamente

👤 Você: PARE
🤖 Marciano: Opa! Calma aí!

👤 Você: PARE?
🤖 Marciano: Relaxa, eu sei o que estou fazendo!
```

### Operações matemáticas

```text
👤 Você: some 10 5
🤖 Marciano: Essa eu sei: 15.0

👤 Você: divida 10 0
🤖 Marciano: Erro: não é possível dividir por zero
```

### Ação premium

```text
👤 Você: agir
🤖 Marciano: É pra já!
```

Em seguida, o sistema exibe um balão de fala com uma frase aleatória e um robô em ASCII.

## Conceitos aplicados

O projeto utiliza conceitos básicos de programação orientada a objetos e recursos da linguagem Kotlin, incluindo:

- classes;
- herança;
- sobrescrita de métodos;
- interfaces;
- `data class`;
- objetos utilitários com `object`;
- listas;
- funções auxiliares;
- leitura de dados via terminal;
- controle de fluxo;
- modularização de responsabilidades.

## Referências e links de apoio

### Frases utilizadas na ação RoboSay

As frases exibidas pela funcionalidade `RoboSay` foram inspiradas em citações e frases sobre tecnologia consultadas em portais de frases e citações. A estrutura foi adaptada para uso acadêmico e demonstrativo no terminal.

- Pensador - Frases sobre tecnologia: https://www.pensador.com/frases_sobre_tecnologia/
- Pensador - Tecnologia: https://www.pensador.com/tecnologia/

### Kotlin e recursos utilizados no projeto

Os recursos utilizados no projeto incluem classes, herança, sobrescrita de métodos, interfaces, `data class`, listas, funções, tratamento de texto, leitura de entrada pelo terminal e execução de aplicação Kotlin/JVM.

- Documentação oficial do Kotlin: https://kotlinlang.org/docs/home.html
- Kotlin Basic Syntax: https://kotlinlang.org/docs/basic-syntax.html
- Kotlin Classes: https://kotlinlang.org/docs/classes.html
- Kotlin Inheritance: https://kotlinlang.org/docs/inheritance.html
- Kotlin Interfaces: https://kotlinlang.org/docs/interfaces.html
- Kotlin Data Classes: https://kotlinlang.org/docs/data-classes.html
- Kotlin Collections Overview: https://kotlinlang.org/docs/collections-overview.html
- Gradle Application Plugin: https://docs.gradle.org/current/userguide/application_plugin.html

### Ícones utilizados no terminal

Os ícones utilizados na simulação de chat são caracteres Unicode/Emoji, usados apenas como elementos visuais no terminal.

- Lista oficial de emojis Unicode: https://unicode.org/emoji/charts/full-emoji-list.html

Ícones usados no projeto:

- 👤 usuário;
- 🤖 robô.

### Inspiração da funcionalidade RoboSay

A funcionalidade `RoboSay` foi inspirada no utilitário `cowsay`, tradicional programa de terminal que exibe mensagens dentro de um balão de fala acompanhado por arte ASCII.

- Site do Cowsay: https://cowsay.diamonds/
- Repositório cowsay-org/cowsay: https://github.com/cowsay-org/cowsay

## Observações

Este projeto foi desenvolvido com foco didático, priorizando clareza, organização e aderência aos requisitos da atividade. A estrutura do código foi organizada para separar responsabilidades entre menu, processamento da entrada, regras dos robôs e ação personalizada.
