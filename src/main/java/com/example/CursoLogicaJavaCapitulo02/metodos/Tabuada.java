package com.example.CursoLogicaJavaCapitulo02.metodos;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer[] numeros = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Digite um número: ");
        Integer numeroDigitado = scanner.nextInt();
        imprimirTabuada(numeroDigitado, numeros);

    }

    static void imprimirTabuada(Integer numeroDigitado, Integer[] numeros) {
        for(int i = 0; i < numeros.length; i++){
            Integer tabuada = numeroDigitado * numeros[i];
            System.out.println(numeroDigitado + " X " + numeros[i] + " = " + tabuada);
        }
    }
}
