package com.example.CursoLogicaJavaCapitulo02.biblioteca;

import java.util.Scanner;

public class InteracaoDois {

    //Sua tarefa agora é pegar a classe CalcularValorTroco do capítulo 2
    // e utilizar a nossa biblioteca AlgaWorksConsole ao invés da classe Scanner diretamente.

    Scanner scanner = new Scanner(System.in);

    //Método para lêr valor do produto
    public Double lerValorProduto(String texto){
        System.out.print(texto);
        return scanner.nextDouble();
    }

    //Método para lêr valor dado pelo cliente para comprar o produto
    public Double lerValorCliente(String texto){
        System.out.print(texto);
        return scanner.nextDouble();
    }

   public void imprimir(String texto){
        System.out.print(texto);
   }


}

