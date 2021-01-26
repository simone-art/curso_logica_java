package com.example.CursoLogicaJavaCapitulo02.metodos;

import java.util.Scanner;

public class CalculadoraRestaSoma {


    //Crie um programa que peça dois números do usuário
    // e também qual a operação ele deseja fazer - adição ou subtração.
    // Para cada operação, você deve construir um método que realize a mesma,
    // ou seja, teremos um método para adição,
    // que vai receber dois números como parâmetros
    // e retornar o resultado da soma entre eles, e outro método para subtração.

    //Fique a vontade para implementar multiplicação e divisão também.

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        Double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        Double num2 = scanner.nextDouble();

        String [] operacao = new String[]{"Soma", "Resta"};
        System.out.println("Escolhe a operação que você quer fazer: ");

        for(int i = 0; i < operacao.length; i++) {
            System.out.println("[" + i + "] " + operacao[i]);
        }

        Integer escolherOperacao = scanner.nextInt();

            if (escolherOperacao == 0){
             Double soma = num1 + num2;
             System.out.println("O resultado da soma é:" + soma);
            }else if (escolherOperacao == 1){
                Double resta = num1 - num2;
                System.out.println("O resultado da resta é:" + resta);
            }

       }
}

