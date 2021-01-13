package com.example.CursoLogicaJavaCapitulo02.imc;

import java.util.Scanner;

public class CalcularImc {

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu peso : ");
        Double valorPeso = scanner.nextDouble();

        System.out.print("Digite a sua altura: ");
        Double valorAltura = scanner.nextDouble();

        Double calcularImc = valorPeso / (valorAltura *valorAltura);

        System.out.print("Seu IMC está em : " + calcularImc);

//        if (calcularImc <= 18 && calcularImc >= 24.9);
//        System.out.print("Seu peso está por debaixo do nivel normal");
//        if (calcularImc >= 25 && calcularImc <= 29.4);
//        System.out.print("Seu peso está normal");
//        if (calcularImc >= 30);
//        System.out.print("Seu peso está muito acima do normal");


    }
}
