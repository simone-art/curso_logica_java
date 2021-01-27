package com.example.CursoLogicaJavaCapitulo02.programacao;

public class PrimeiraClasse {

    public static void main (String [] args){
       Produto produto = new Produto();
       produto.nome = "Smartphone";
        produto.precoUnitario = 500.0;
        produto.quantidade = 1000;

        //Tem que passar ao invocar o método a variável criada, neste caso produto
        ExibirQuantidadeEmEstoque(produto);
    }

    static void ExibirQuantidadeEmEstoque(Produto produto){
        System.out.println("Quantidade em estoque é: " + produto.quantidade);

    }
}
