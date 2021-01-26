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

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        Double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        Double num2 = scanner.nextDouble();

        String[] operacao = new String[]{"Soma", "Resta"};
        System.out.println("Escolhe a operação que você quer fazer: ");

        for (int i = 0; i < operacao.length; i++) {
            System.out.println("[" + i + "] " + operacao[i]);
        }

        Integer escolherOperacao = scanner.nextInt();
        if (escolherOperacao == 0) {
            metodoAdicao(num1, num2);
        }else if(escolherOperacao == 1){
            metodoSubstracao(num1, num2);
        }
    }


        static Double metodoAdicao (Double num1, Double num2){
            Double soma = num1 + num2;
            System.out.println("O resultado da soma é:" + soma);
            return soma;
        }

        static Double metodoSubstracao (Double num1, Double num2){
            Double subtracao = num1 - num2;
            System.out.println("O resultado da subtração é:" + subtracao);
            return subtracao;
        }
}

