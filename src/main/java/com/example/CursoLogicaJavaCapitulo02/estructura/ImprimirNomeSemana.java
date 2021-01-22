package com.example.CursoLogicaJavaCapitulo02.estructura;

import java.util.Scanner;

public class ImprimirNomeSemana {

    //Crie um programa que vai receber um número que será referente ao dia da semana
    // (de 1 até 7). Dependendo do número informado você deve imprimir o nome desse dia.

    //Se o número 1 for informado, então deverá ser impresso "domingo",
    // se 2, então "segunda-feira" e por ai vai.

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        Integer dia = scanner.nextInt();

        String nome = "";

        switch (dia){
            case 1: nome = "Domingo";
            break;
            case 2: nome = "Segunda-Feira";
                break;
            case 3: nome = "Terça-Feira";
                break;
            case 4: nome = "Quarta-Feira";
                break;
            case 5: nome = "Quinta-Feira";
                break;
            case 6: nome = "Sexta-Feira";
                break;
            case 7: nome = "Sábado";
                break;
            default:
                System.err.println("Digite um número do dia da semana válido");
                System.exit(1);
        }
        System.out.println("O dia da semana é: " + nome);
        scanner.close();
    }
}
