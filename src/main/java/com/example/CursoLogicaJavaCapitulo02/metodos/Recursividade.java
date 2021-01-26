package com.example.CursoLogicaJavaCapitulo02.metodos;

public class Recursividade {
    //Recursividade é chamar o mesmo método
    
    public static void main (String [] args){

        imprimirNumero(0);
    }

    static void imprimirNumero(Integer numero){
        System.out.println("Número: " + numero);

        if(numero < 10){
            imprimirNumero(++numero);
        }
    }
}
