package com.example.CursoLogicaJavaCapitulo02.metodos;

public class Recursividade {
    //Recursividade é chamar o mesmo método

    public static void main (String [] args){

//        imprimirNumero(0);
        String [] alunos = new String[]{"Simone", "Diego", "Marcos"};
        iterarNomes(alunos);
    }

//    static void imprimirNumero(Integer numero){
//        System.out.println("Número: " + numero);
//
//        if(numero < 10){
//            imprimirNumero(++numero);
//        }
//    }

    static void iterarNomes(String []alunos){
        for(int i = 0; i < alunos.length; i++){
            System.out.println("Alunos: " + alunos[i]);
        }
    }
}
