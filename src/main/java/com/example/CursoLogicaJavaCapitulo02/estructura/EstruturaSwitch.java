package com.example.CursoLogicaJavaCapitulo02.estructura;

import java.util.Scanner;

public class EstruturaSwitch {

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o mes: ");
        Integer mes = scanner.nextInt();

        Double desconto = 0.0;

        // Dentro do parêntesis do Switch vai a variável
        // No parêntesis do switch não se pode colocar uma varável tipo Double/String pode
        switch (mes){
            case 1: desconto = 0.0;
              break;
            case 2: desconto = 0.0;
              break;
            case 3: desconto = 15.0;
              break;
            case 4: desconto = 30.0;
              break;
            case 5: desconto = 30.0;
              break;
            case 6: desconto = 10.0;
              break;
            case 7: desconto = 10.0;
              break;
            case 8: desconto = 10.0;
              break;
            case 9: desconto = 10.0;
              break;
            case 10: desconto = 20.0;
               break;
            case 11: desconto = 10.0;
                break;
            case 12: desconto = 10.0;
                break;
            default:
                System.err.println("Digite um mês válido");
                System.exit(1);
        }
        System.out.print("Seu descontó será de: " + desconto + "%");
        scanner.close();
    }
}
