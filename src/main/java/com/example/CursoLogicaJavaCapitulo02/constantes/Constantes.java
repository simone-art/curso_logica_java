package com.example.CursoLogicaJavaCapitulo02.constantes;

import java.util.Scanner;

public class Constantes {

    //Constantes são variáveis que seu valores não podem ser alterados

    public static void main (String [] args) {

        System.out.println("===========================================");
        System.out.println("Digite a sua idade: ");
        Scanner scanner = new Scanner(System.in);
        //IdadeMinima é uma variável constante porque seu valor não pode ser alterado.
        //Deve-se colocar a palavra final pra que o Java saiba que essa variável é uma constante

        final Integer idadeMinima = 18;
        Integer idade = scanner.nextInt();

        Boolean podeTirarCarteria = idade >= idadeMinima;
        if (idade >= 18) {
            System.out.println("Sim! Você está habilitado pra tirar a sua carteira");
        } else {
            System.out.println("Náo! Você não está habilitado pra tirar a sua carteira");
        }
    }
}
