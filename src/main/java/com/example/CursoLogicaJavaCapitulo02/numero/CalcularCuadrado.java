package com.example.CursoLogicaJavaCapitulo02.numero;

import java.util.Scanner;

public class CalcularCuadrado {

        public static void main (String [] args){

            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite um número: ");
            Integer numeroInteiro = scanner.nextInt();
            Integer resultado = numeroInteiro * numeroInteiro;

            System.out.print("O cuadrado deste número é: " + resultado);
        }
    }

