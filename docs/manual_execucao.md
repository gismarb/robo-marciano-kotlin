# Manual de Execução - Robô Marciano em Kotlin

Este documento apresenta as formas recomendadas para executar o projeto **Robô Marciano em Kotlin** em ambiente local, usando a IDE IntelliJ IDEA ou o terminal Linux.

## 1. Pré-requisitos

Para executar o projeto, recomenda-se ter instalado:

- Java JDK 17 ou superior;
- IntelliJ IDEA;
- Gradle Wrapper incluído no projeto;
- Terminal Linux, quando a execução for feita fora da IDE.

O projeto foi configurado para utilizar a JVM por meio do Kotlin/JVM. Para evitar incompatibilidades entre a versão usada na compilação e a versão usada na execução, o projeto utiliza a toolchain Java 17 no arquivo `build.gradle.kts`.

Trecho de configuração utilizado:

```kotlin
kotlin {
    jvmToolchain(17)
}
```

## 2. Execução pela IntelliJ IDEA

Para executar pela IDE:

1. Abra o projeto na IntelliJ IDEA.
2. Aguarde o carregamento do Gradle.
3. Abra o arquivo `Main.kt`.
4. Clique no botão de execução ao lado da função `main()`.
5. Interaja com o programa pelo console da IDE.

A execução pela IDE é útil durante o desenvolvimento, pois permite testar rapidamente o menu, as versões do robô e as respostas implementadas.

## 3. Execução pelo Gradle no terminal

Na raiz do projeto, execute:

```bash
./gradlew run
```

Caso o arquivo `gradlew` não tenha permissão de execução, rode primeiro:

```bash
chmod +x gradlew
```

Depois execute novamente:

```bash
./gradlew run
```

Para que a leitura de dados pelo terminal funcione corretamente com `readlnOrNull()`, o projeto utiliza a seguinte configuração no `build.gradle.kts`:

```kotlin
tasks.named<JavaExec>("run") {
    standardInput = System.`in`
}
```

Essa configuração repassa a entrada padrão do terminal para a aplicação executada pelo Gradle.

## 4. Execução com saída mais limpa

A execução via `./gradlew run` pode exibir mensagens do próprio Gradle. Para uma saída mais limpa, é possível usar:

```bash
./gradlew -q run
```

Essa opção reduz a quantidade de mensagens exibidas pelo Gradle.

## 5. Geração de distribuição local

Para gerar uma distribuição local do programa, execute:

```bash
./gradlew clean installDist
```

Esse comando gera os arquivos executáveis dentro da pasta:

```text
build/install/robo-marciano-kotlin/
```

O executável para Linux ficará, normalmente, em:

```text
build/install/robo-marciano-kotlin/bin/robo-marciano-kotlin
```

Para executar:

```bash
./build/install/robo-marciano-kotlin/bin/robo-marciano-kotlin
```

Essa forma de execução é recomendada para testar o comportamento do programa como se ele fosse uma aplicação de terminal entregue ao usuário final.

## 6. Comandos principais do programa

Ao iniciar o programa, será exibido um menu principal com opções para escolher a versão do robô:

```text
1 - Usar versão básica
2 - Usar versão avançada
3 - Usar versão premium
4 - Sobre
0 - Sair
```

Durante a conversa com o robô, o comando de encerramento é:

```text
FIM
```

## 7. Exemplos de uso

### Versão básica

Entradas possíveis:

```text
Tudo bem?
PARE
PARE?
eu quero testar
```

Respostas esperadas:

```text
Certamente
Opa! Calma aí!
Relaxa, eu sei o que estou fazendo!
A responsabilidade é sua
```

### Versão avançada

Entradas possíveis:

```text
some 10 5
subtraia 10 5
multiplique 10 5
divida 10 5
```

Resposta esperada para a soma:

```text
Essa eu sei: 15.0
```

### Versão premium

Entrada para acionar a ação personalizada:

```text
agir
```

Resultado esperado:

1. O robô responde:

```text
É pra já!
```

2. Em seguida, o programa exibe uma frase aleatória em um balão de fala e renderiza um robô em arte ASCII no terminal.

Observação: se o usuário digitar `AGIR` em maiúsculas, a entrada será tratada como grito, e não como comando premium.

> Mais formatos de uso podem ser encontrados no documento [roteiro_testes.md](./docs/roteiro_testes.md).
