package com.example.CursoLogicaJavaCapitulo02.programacao;

public class SegundaClasse {

    public static void main(String[] args){
     ProdutoDois produtoDois = new ProdutoDois();
     produtoDois.nome = "Barras de Chocolate";
     produtoDois.precoUnitario = 5.0;
     produtoDois.quantidadeEstoque = 100;
     produtoDois.quantidadeProdutoComprado = 50;

     calculoProdutoEmEstoque(produtoDois.quantidadeEstoque, produtoDois.quantidadeProdutoComprado);
     validarReposicaoEstoque(produtoDois);
    }


    // Para que funcione um método que retorna valores é necessário
    //depois do static colocar o tipo do método (String, Integer)

    static void calculoProdutoEmEstoque(Integer quantidadeEstoque, Integer quantidadeProdutoComprado){
        Integer calculoProduto = (quantidadeEstoque - quantidadeProdutoComprado);
        System.out.println("O total do produto em estoque é: " + calculoProduto);
    }

    static void validarReposicaoEstoque(ProdutoDois produtoDois){
        if(produtoDois.quantidadeEstoque < 10){
            System.out.println("Tem que repor o estoque deste produto");
        }else if(produtoDois.quantidadeEstoque >= 10){
            System.out.println("Ainda tem estoque suficiente deste produto");
        }
    }
}
