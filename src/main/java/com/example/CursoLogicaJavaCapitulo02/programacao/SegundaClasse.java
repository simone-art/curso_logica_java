package com.example.CursoLogicaJavaCapitulo02.programacao;

public class SegundaClasse {

    public static void main(String[] args){
     ProdutoDois produtoDois = new ProdutoDois();
     produtoDois.nome = "Barras de Chocolate";
     produtoDois.precoUnitario = 5.0;
     produtoDois.quantidadeEstoque = 9;

     validarReposicaoEstoque(produtoDois);
    }

    static void validarReposicaoEstoque(ProdutoDois produtoDois){
        if(produtoDois.quantidadeEstoque < 10){
            System.out.println("Tem que repor o estoque deste produto");
        }else if(produtoDois.quantidadeEstoque >= 10){
            System.out.println("Ainda tem estoque suficiente deste produto");
        }
    }
}
