package com.example.CursoLogicaJavaCapitulo02.programacao;

public class ProdutoDois {

    String nome;
    Double precoUnitario;
    Integer quantidadeProdutoComprado;
    Integer quantidadeEstoque;

    Integer validarReposicaoEstoque() {
        Integer validarEstoque = quantidadeEstoque;
        if(quantidadeEstoque >= 10){
            System.out.println("Tem estoque suficiente do produto");
        }else if(quantidadeEstoque< 10){
            System.out.println("Não tem estoque suficiente do produt0");
        }
        return validarEstoque;
    }
}