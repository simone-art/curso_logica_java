package com.example.CursoLogicaJavaCapitulo02.metodos;

public class RecebendoParametros {
    public static void main (String [] args){
        imprimirTraco();
        String nome= "Simone";
        imprimir(nome);
    }

    static void imprimirTraco(){
        System.out.println("=======================");
    }
    //O método tem que estar por fora do main
    static void imprimir(String texto){
        System.out.println(texto);
    }
}
