package com.example.CursoLogicaJavaCapitulo02.operadores;

import java.util.Scanner;

public class CalculadoraSimples {

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        Double num1 = scanner.nextDouble();

        System.out.print("Escolha a operação a fazer: (1) Soma, (2)Substraçao, (3) Multiplicação e (4) divisão : ");
        Integer escolhaOperacao = scanner.nextInt();


        System.out.print("Digite o segundo número: ");
        Double num2 = scanner.nextDouble();


        if(escolhaOperacao == 1){
          Double soma = num1 + num2;
          System.out.println("O resultado da soma é: " + soma);
        }else if(escolhaOperacao == 2){
         Double subtracao = num1 - num2;
         System.out.println("O resultado da subtração é: " + subtracao);
        }else if(escolhaOperacao == 3){
            Double multiplicacao = num1 * num2;
            System.out.println("O resultado da multiplicacao é: " + multiplicacao);
        }else if(escolhaOperacao == 4){
            Double divisao = num1 / num2;
            System.out.println("O resultado da subtração é: " + divisao);
        }
        scanner.close();
    }
}
