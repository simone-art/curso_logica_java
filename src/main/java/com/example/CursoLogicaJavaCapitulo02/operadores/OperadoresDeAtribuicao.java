package com.example.CursoLogicaJavaCapitulo02.operadores;

public class OperadoresDeAtribuicao {

    public static void main (String [] args){
        Double numero = 7.0;

//        numero = numero + 4;
//        System.out.println("numero + 4 " + numero);

        // += é o mesmo que está na linha 8
//        numero += 4;
//        System.out.println("numero += 4 " + numero);
//
//        numero -= 4;
//        System.out.println("numero -= 4 " + numero);
//
//        numero *= 4;
//        System.out.println("numero *= 4 " + numero);
//
//       numero /= 4;
//        System.out.println("numero /= 4 " + numero);

        //Módulo trata do resto de uma divisão
        numero %= 4;
        System.out.println("numero /= 4 " + numero);
    }
}

//Se você executar todo o codigo, a subtracão printará o valor 7 e a divisão também,
// porque a linguagem está entendendo que o número tem que guardar o valor da operacão inicial
// Quer dizer, que o número da soma da 11 y ese será o valor do número da subtracão e assim por diante
// Se você comentar, os resultados dão certos.