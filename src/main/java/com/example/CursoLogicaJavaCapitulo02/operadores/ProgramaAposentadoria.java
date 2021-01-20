package com.example.CursoLogicaJavaCapitulo02.operadores;

import java.util.Scanner;

public class ProgramaAposentadoria {

    //Crie um programa que receba a idade de uma pessoa
    // e a quantidade de tempo que essa pessoa contribuiu com a previdência.
    // Depois verifique se ela pode aposentar ou não.
    // Nas regras desse programa a pessoa vai precisar ter,
    // pelo menos, 55 anos e ter contribuído com, pelo menos, 25 anos.
    // Se ela passar nessas duas condições,
    // então mostre pra ela uma mensagem dizendo que ela pode aposentar.

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        Integer idade = scanner.nextInt();

        System.out.print("Digite a quantidade de tempo que você está contribuindo com a previdência: ");
        Integer anosPrevidencia = scanner.nextInt();

        if (idade >= 55 && anosPrevidencia >= 25){
            System.out.print("Felicidades! Você já pode-se aposentar");
        }else{
            System.out.print(" Você ainda não pode-se aposentar");
        }
        scanner.close();
    }
}
