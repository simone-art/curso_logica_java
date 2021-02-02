package com.example.CursoLogicaJavaCapitulo02.biblioteca;


public class BibliotecaPropiaDois {

    public static void main(String[] args) {

        InteracaoDois interacaoDois = new InteracaoDois();

        Double valorProduto = interacaoDois.lerValorProduto("Digite o valor do produto: ");;

        Double valorCliente = interacaoDois.lerValorCliente("Digite o valor dado pelo cliente: ");;

        Double valorTroco = valorCliente - valorProduto;

        interacaoDois.imprimir("O valor do troco é: " + valorTroco);

    }
}
