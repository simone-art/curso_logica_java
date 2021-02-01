package com.example.CursoLogicaJavaCapitulo02.classeinstancia;

public class ClasseInstancia {

    public static void main (String [] args){
        Produto produto = new Produto();
        produto.nome = "Caneca";

        Produto produto1 = new Produto();
        produto1.nome = "Carteira";

        System.out.println("Nome do Produto : " + produto.nome);
        System.out.println("Nome do Produto : " + produto1.nome);
    }
}
