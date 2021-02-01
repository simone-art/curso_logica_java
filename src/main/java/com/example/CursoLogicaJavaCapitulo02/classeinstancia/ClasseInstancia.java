package com.example.CursoLogicaJavaCapitulo02.classeinstancia;

public class ClasseInstancia {

    public static void main (String [] args){

        System.out.println("Quantidade mínima em estoque: " + Produto.quantidadeMinimaEstoque);
        Produto produto = new Produto();
        //Variável estática aquí foi alterada
        produto.quantidadeMinimaEstoque = 10;
        produto.nome = "Caneca";


        Produto produto1 = new Produto();
        produto1.nome = "Carteira";


        System.out.println("Nome do Produto : " + produto.nome);
        System.out.println("Nome do Produto : " + produto1.nome);
        //Para printar no console a quantidade mínima, tem que chamar a classe e não a variável
        //Já que temos ua variável estática que ao mesmo tempo não é constante
        System.out.println("Quantidade mínima do produto em estoque: " + Produto.quantidadeMinimaEstoque);

        //Métodos estáticos
        Impressao.informacao("Produto: " + produto.nome);
        Impressao.informacao("Produto1: " + produto1.nome);

    }
}
