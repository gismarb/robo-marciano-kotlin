package br.edu.`if`.robot

/*
 * Classe de dados usada pela ação personalizada do robô premium.
 *
 * A ideia é representar a estrutura de uma frase, contendo:
 * - texto;
 * - autor.
 *
 * Essa estrutura poderia futuramente ser carregada de um arquivo JSON,
 * mas nesta versão será mantida em memória para simplificar o projeto.
 */
data class Frase(
    val texto: String,
    val autor: String
)