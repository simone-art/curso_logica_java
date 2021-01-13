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

//        System.out.print("Seu IMC está em : " + calcularImc);

        //De olho na estrutura do If
        if (calcularImc <= 18.5)
        {
            System.out.print("Seu peso está por debaixo do nivel normal");
        }
        else if (calcularImc >= 18.5 && calcularImc <= 29.4) {
            System.out.print("Seu peso está normal");
        }
        else if (calcularImc >= 30) {
            System.out.print("Seu peso está muito acima do normal");
        }
        scanner.close();
    }
}
