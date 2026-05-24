# Requisitos resumidos do projeto

## Versão básica

A classe básica do robô Marciano deverá responder usando a função `responda()`.

Regras principais:

- responder `"Certamente"` quando receber uma pergunta;
- responder `"Opa! Calma aí!"` quando detectar um grito;
- responder `"Relaxa, eu sei o que estou fazendo!"` quando detectar uma pergunta gritada;
- responder `"A responsabilidade é sua"` quando a mensagem usar a palavra `"eu"`;
- responder `"Não me incomode"` quando receber mensagem vazia;
- responder `"Tudo bem, como quiser"` nos demais casos.

## Versão avançada

A versão avançada deverá herdar as funcionalidades da versão básica e também responder operações matemáticas:

- `some`;
- `subtraia`;
- `multiplique`;
- `divida`.

A resposta deverá iniciar com:

```text
Essa eu sei
```
seguida do resultado.

## Versão premium

A versão premium deverá herdar as funcionalidades anteriores e executar uma ação personalizada quando a palavra `agir` for usada.

A ação personalizada será implementada por meio de uma interface.

## Programa principal

O programa deverá permitir interação contínua pelo terminal até que o usuário digite:

```text
FIM
```


