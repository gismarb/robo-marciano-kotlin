# Requisitos resumidos do projeto

Este documento resume os requisitos usados como referência para a implementação do **Robô Marciano em Kotlin**.

Os identificadores **RF** e **RNF** foram criados para facilitar a rastreabilidade entre:

- enunciado da atividade;
- documentação do projeto;
- comentários no código-fonte;
- implementação das classes.

---

## Requisitos Funcionais

### RF001 - Versão básica do robô

O robô deverá ser capaz de responder a frases usando a função `responda()`.

#### RF001.1 - Função `responda()`

O robô deverá responder às mensagens recebidas por meio da função `responda()`.

#### RF001.2 - Pergunta

Se alguém fizer uma pergunta ao robô, ele deverá responder:

```text
Certamente
```

#### RF001.3 - Grito

Se alguém gritar com o robô, usando alguma palavra com todas as letras em maiúsculas, ele deverá responder:

```text
Opa! Calma aí!
```

#### RF001.4 - Pergunta gritada

Se alguém gritar com o robô em uma pergunta, ele deverá responder:

```text
Relaxa, eu sei o que estou fazendo!
```

#### RF001.5 - Palavra `eu`

Caso alguém fale alguma coisa que use a palavra `eu`, com ou sem letras maiúsculas, o robô deverá responder:

```text
A responsabilidade é sua
```

#### RF001.6 - Mensagem vazia

Se alguém se dirigir ao robô sem dizer nenhuma palavra, ele deverá responder:

```text
Não me incomode
```

#### RF001.7 - Qualquer outra mensagem

Caso alguém fale qualquer outra coisa com o robô, ele deverá responder:

```text
Tudo bem, como quiser
```

---

### RF002 - Versão avançada do robô

A versão avançada deverá possuir as mesmas funcionalidades da versão básica, mas também deverá realizar operações matemáticas básicas.

#### RF002.1 - Operações disponíveis

O robô poderá receber as seguintes operações:

- `some`;
- `subtraia`;
- `multiplique`;
- `divida`.

#### RF002.2 - Operandos

Os operandos das operações deverão ser passados como parâmetros extras da função `responda()`.

#### RF002.3 - Resposta da operação

Ao realizar uma operação matemática, o robô deverá responder:

```text
Essa eu sei
```

seguida do resultado.

---

### RF003 - Versão premium do robô

A versão premium deverá possuir todas as funcionalidades anteriores e permitir que o usuário defina uma ação personalizada.

#### RF003.1 - Palavra `agir`

Quando a palavra `agir` for usada, o robô deverá responder:

```text
É pra já!
```

e executar a ação personalizada.

#### RF003.2 - Interface de ação personalizada

A ação personalizada deverá ser passada como parâmetro da classe premium usando uma interface definida na instanciação do robô.

#### RF003.3 - Ação personalizada escolhida

A ação personalizada escolhida para este projeto será inspirada no **CowSay** do Linux.

Ela deverá:

- escolher uma frase aleatória;
- exibir a frase em um balão no terminal;
- renderizar um robô em ASCII;
- retornar ao fluxo normal de interação.

---

### RF004 - Encerramento do programa

O programa deverá permitir que o usuário interaja com o robô até digitar:

```text
FIM
```

---

## Requisitos Não Funcionais

### RNF001 - Linguagem

O programa deverá ser escrito em Kotlin.

### RNF002 - Tipo de aplicação

O programa deverá ser uma aplicação CLI, executada pelo terminal.

### RNF003 - Nomes e respostas

O programa deverá respeitar os nomes, funções, comandos e respostas definidos nos requisitos da atividade.

### RNF004 - Idioma

O programa deverá usar mensagens, funções, classes e diálogos em português.

### RNF005 - Simulação de chat

O programa deverá exibir a interação simulando um chat entre usuário e robô, usando ícones ou marcadores visuais no terminal.

---

## Observações de implementação

- Os IDs dos requisitos foram definidos para organizar o desenvolvimento e não aparecem originalmente no enunciado do professor.
- Os comentários no código-fonte poderão citar esses IDs para indicar qual requisito está sendo atendido.
- A ação premium será implementada de forma simples, mantendo as frases em memória por meio de uma estrutura de dados Kotlin.
- O uso de uma estrutura `data class` para representar frases permite demonstrar organização dos dados e deixa aberta a possibilidade, futura, de leitura por arquivos JSON (outros fontes de dados e/ou formatos).
