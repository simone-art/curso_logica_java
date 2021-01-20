package com.example.CursoLogicaJavaCapitulo02.operadores;

public class ConcatenacaoTextos {

    public static void main (String [] args){
        String inicio = "Esse ";
        String meio = "é um exemplo ";
        String fim = "de concatenação de textos. ";

        System.out.println(inicio + meio + fim);

        //"Esse" é considerado um texto estático.Texto que se usa sem ter uma variável
        System.out.println("Esse " + meio + "de concatenação de textos. ");
    }
}
