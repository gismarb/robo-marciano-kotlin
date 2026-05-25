# Roteiro de Testes - Robô Marciano em Kotlin

Este documento apresenta um roteiro de testes manuais para validar o funcionamento do projeto **Robô Marciano em Kotlin**.

O objetivo é verificar, pelo terminal, se as versões básica, avançada e premium do robô atendem aos requisitos definidos para a atividade.

---

## 1. Preparação do ambiente de teste

### Procedimento

Executar o programa pela IDE IntelliJ IDEA ou pelo terminal, conforme a configuração do projeto.

### Resultado esperado

O sistema deve iniciar e exibir o menu principal com as opções de uso do robô.

---

## 2. Testes do menu principal

### Teste 01 - Exibição do menu

#### Procedimento

Executar o programa.

#### Resultado esperado

O programa deve exibir um menu com opções semelhantes a:

```text
1 - Usar versão básica
2 - Usar versão avançada
3 - Usar versão premium
4 - Sobre
0 - Sair
```

---

### Teste 02 - Opção Sobre

#### Entrada

```text
4
```

#### Resultado esperado

O programa deve exibir uma tela textual de informações sobre o sistema, com descrição das versões do robô, regras de resposta, comandos disponíveis e explicação da ação personalizada da versão premium.

Após pressionar ENTER, o sistema deve retornar ao menu principal.

---

### Teste 03 - Opção inválida

#### Entrada

```text
9
```

#### Resultado esperado

O sistema deve informar que a opção é inválida e exibir novamente o menu principal.

---

### Teste 04 - Sair pelo menu

#### Entrada

```text
0
```

#### Resultado esperado

O sistema deve encerrar o programa.

---

## 3. Testes da versão básica

Para os testes desta seção, selecionar no menu principal:

```text
1
```

---

### Teste 05 - Pergunta simples

#### Entrada

```text
Tudo bem?
```

#### Resultado esperado

```text
Certamente
```

---

### Teste 06 - Grito

#### Entrada

```text
PARE
```

#### Resultado esperado

```text
Opa! Calma aí!
```

---

### Teste 07 - Pergunta gritada

#### Entrada

```text
PARE?
```

#### Resultado esperado

```text
Relaxa, eu sei o que estou fazendo!
```

---

### Teste 08 - Frase com a palavra "eu"

#### Entrada

```text
eu quero testar
```

#### Resultado esperado

```text
A responsabilidade é sua
```

---

### Teste 09 - Frase com a palavra "eu" em maiúscula

#### Entrada

```text
EU quero testar
```

#### Resultado esperado

Como a palavra `EU` está em maiúsculas, a regra de grito deve ser aplicada antes da regra da palavra `eu`.

```text
Opa! Calma aí!
```

---

### Teste 10 - Mensagem vazia

#### Entrada

Pressionar ENTER sem digitar nenhum texto.

#### Resultado esperado

```text
Não me incomode
```

---

### Teste 11 - Mensagem contendo apenas espaços

#### Entrada

Digitar alguns espaços e pressionar ENTER.

#### Resultado esperado

```text
Não me incomode
```

---

### Teste 12 - Mensagem comum

#### Entrada

```text
Olá Marciano
```

#### Resultado esperado

```text
Tudo bem, como quiser
```

---

### Teste 13 - Operação matemática na versão básica

#### Entrada

```text
some 10 5
```

#### Resultado esperado

Como a versão básica não executa operações matemáticas, a entrada deve ser tratada como mensagem comum.

```text
Tudo bem, como quiser
```

---

### Teste 14 - Encerramento da interação

#### Entrada

```text
FIM
```

#### Resultado esperado

O sistema deve encerrar a interação com o robô.

---

## 4. Testes da versão avançada

Para os testes desta seção, executar novamente o programa e selecionar no menu principal:

```text
2
```

---

### Teste 15 - Herança da regra de pergunta

#### Entrada

```text
Tudo bem?
```

#### Resultado esperado

```text
Certamente
```

---

### Teste 16 - Herança da regra de grito

#### Entrada

```text
PARE
```

#### Resultado esperado

```text
Opa! Calma aí!
```

---

### Teste 17 - Soma

#### Entrada

```text
some 10 5
```

#### Resultado esperado

```text
Essa eu sei: 15.0
```

---

### Teste 18 - Subtração

#### Entrada

```text
subtraia 10 5
```

#### Resultado esperado

```text
Essa eu sei: 5.0
```

---

### Teste 19 - Multiplicação

#### Entrada

```text
multiplique 10 5
```

#### Resultado esperado

```text
Essa eu sei: 50.0
```

---

### Teste 20 - Divisão

#### Entrada

```text
divida 10 5
```

#### Resultado esperado

```text
Essa eu sei: 2.0
```

---

### Teste 21 - Divisão por zero

#### Entrada

```text
divida 10 0
```

#### Resultado esperado

```text
Erro: não é possível dividir por zero
```

---

### Teste 22 - Operandos inválidos

#### Entrada

```text
some dez cinco
```

#### Resultado esperado

```text
Erro: os operandos devem ser números
```

---

### Teste 23 - Comando premium na versão avançada

#### Entrada

```text
agir
```

#### Resultado esperado

Como a versão avançada não possui ação personalizada, a entrada deve ser tratada como mensagem comum.

```text
Tudo bem, como quiser
```

---

### Teste 24 - Encerramento da interação

#### Entrada

```text
FIM
```

#### Resultado esperado

O sistema deve encerrar a interação com o robô.

---

## 5. Testes da versão premium

Para os testes desta seção, executar novamente o programa e selecionar no menu principal:

```text
3
```

---

### Teste 25 - Herança da regra de pergunta

#### Entrada

```text
Tudo bem?
```

#### Resultado esperado

```text
Certamente
```

---

### Teste 26 - Herança da regra de grito

#### Entrada

```text
PARE
```

#### Resultado esperado

```text
Opa! Calma aí!
```

---

### Teste 27 - Herança da regra de pergunta gritada

#### Entrada

```text
PARE?
```

#### Resultado esperado

```text
Relaxa, eu sei o que estou fazendo!
```

---

### Teste 28 - Herança da operação matemática

#### Entrada

```text
some 10 5
```

#### Resultado esperado

```text
Essa eu sei: 15.0
```

---

### Teste 29 - Comando premium em minúsculo

#### Entrada

```text
agir
```

#### Resultado esperado

O robô deve responder:

```text
É pra já!
```

Em seguida, o sistema deve executar a ação personalizada `RoboSay`, exibindo:

- uma frase aleatória sobre tecnologia;
- um balão de fala no terminal;
- um robô em arte ASCII.

---

### Teste 30 - Comando premium em maiúsculo

#### Entrada

```text
AGIR
```

#### Resultado esperado

Como `AGIR` está em maiúsculas, deve ser tratado como grito, e não como comando premium.

```text
Opa! Calma aí!
```

---

### Teste 31 - Comando premium com inicial maiúscula

#### Entrada

```text
Agir
```

#### Resultado esperado

Como o comando premium foi definido como `agir` exatamente em minúsculo, a entrada deve ser tratada como mensagem comum.

```text
Tudo bem, como quiser
```

---

### Teste 32 - Palavra agir dentro de uma frase com eu

#### Entrada

```text
eu quero agir agora
```

#### Resultado esperado

Como a palavra `agir` não foi usada isoladamente como comando premium e a frase contém a palavra `eu`, deve ser aplicada a regra da responsabilidade.

```text
A responsabilidade é sua
```

---

### Teste 33 - Palavra agir dentro de uma pergunta

#### Entrada

```text
Marciano, você pode agir?
```

#### Resultado esperado

Como a palavra `agir` não foi usada isoladamente como comando premium e a entrada é uma pergunta, deve ser aplicada a regra de pergunta.

```text
Certamente
```

---

### Teste 34 - Encerramento da interação

#### Entrada

```text
FIM
```

#### Resultado esperado

O sistema deve encerrar a interação com o robô.

