package com.example.CursoLogicaJavaCapitulo02.iteracao;

public class IteracaoWhile {

    public static void main (String[] args){
        // O laço for se usa mais quando você conhece o número de iterações
        // ou quer usar uma variável
//        for(int i = 0; i < 10; i++){
//        System.out.println("Um texto qualquer.");
//        }

        //O laço While se usa mais quando a condição é booleana.
        //Verdadeiro continua e falso para.
//        int i = 0;
//        while(i < 10){
//           i++;
//            System.out.println("Um texto qualquer.");
//        }

        int i = 0;
        while(i < 10){
            if( i == 5){
                System.out.println("Vai parar!");
                break;
            }
            System.out.println("Um texto qualquer.");
            i++;
        }
    }
}
