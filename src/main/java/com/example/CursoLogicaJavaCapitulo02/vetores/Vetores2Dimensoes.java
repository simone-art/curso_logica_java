package com.example.CursoLogicaJavaCapitulo02.vetores;

public class Vetores2Dimensoes {

    //Vetores de duas dimensões para que funcionen, deve existir um vector de uma dimensão
    // O valor do vector de duas dimensões precisa ser um vector de uma dimensão

    public static void main (String [] args){

        //Vector de uma dimensão
        Double faturamento = 1000.0;

        //Vectores de uma dimensão                  1500=[0]==
        Double [] faturamentoJaneiro = new Double[] {1500.0, 2000.0, 7000.0, };
        Double [] faturamentoFevereiro = new Double[] {700.0, 1200.0, 4000.0 };

        //Vector de duas dimensões                      ====== [0]========
        Double [] [] faturamentoAnual = new Double[] [] {faturamentoJaneiro, faturamentoFevereiro};


        // Para que o vector funcione, devemos accesá-lo da seguinte usando a posicão:
        System.out.println("Faturamento do día 1 de janeiro: " + faturamentoAnual [0][0]);
        System.out.println("Faturamento do día 3 de fevereiro: " + faturamentoAnual [1][2]);
    }
}
