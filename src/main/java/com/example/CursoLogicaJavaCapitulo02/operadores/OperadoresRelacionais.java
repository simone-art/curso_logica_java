package com.example.CursoLogicaJavaCapitulo02.operadores;

public class OperadoresRelacionais {

    public static void main (String [] args){
        Boolean tresMaiorQueDois = 3 > 2;
        System.out.println("3 > 2? " + tresMaiorQueDois);

        Boolean tresMenorQueDois = 3 < 2;
        System.out.println("3 < 2? " + tresMenorQueDois);

        Boolean tresMaiorQueTres = 3 > 3;
        System.out.println("3 > 3? " + tresMaiorQueTres);

        Boolean tresMaiorOuIgualaTres = 3 >= 3;
        System.out.println("3 >= 3? " + tresMaiorOuIgualaTres);

        //Igual
        Boolean doisIgualaDois = 2 == 2;
        System.out.println("2 == 2? " + doisIgualaDois);

        //Diferente
        Boolean doisDiferenteDeDois = 2 != 2;
        System.out.println("2 != 2? " + doisDiferenteDeDois);

        Boolean doisDiferenteDeSete = 2 != 7;
        System.out.println("2 != 7? " + doisDiferenteDeSete);

        //Declarar com variáveis

        Integer cinco = 5;
        Boolean cincoMaiorQueCinco = cinco > cinco;
        System.out.println("cinco > cinco " + cincoMaiorQueCinco);

    }
}