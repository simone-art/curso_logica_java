package com.example.CursoLogicaJavaCapitulo02.operadores;

import java.util.Scanner;

public class CalculoGastosFamiliar {

    //Faça um programa que receba:
    //O valor da conta de luz
    //Conta de água
    //Conta de telefone
    //Escola do filho
    //Fatura do cartão
    //Gastos com supermercado
    //e mostre o gasto total que a família teve no mês. Não esqueça de usar muito o operador "+="

    public static void main (String [] arsg){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da conta de luz: ");
        Double valorContaDeLuz = scanner.nextDouble();

        System.out.print("Digite o valor da conta de agua: ");
        Double valorContaDeAgua = scanner.nextDouble();

        System.out.print("Digite o valor da conta de telefone: ");
        Double valorContaDeTelefone = scanner.nextDouble();

        System.out.print("Digite o valor da escola do seu filho (a): ");
        Double valorContaEscola = scanner.nextDouble();

        System.out.print("Digite o valor da sua fatura do cartão de crédito: ");
        Double valorContaCartaoCredito = scanner.nextDouble();

        System.out.print("Digite o valor da conta do supermercado: ");
        Double valorContaSupermercado = scanner.nextDouble();

        Double valorGastoFamiliar = valorContaDeLuz + valorContaDeAgua + valorContaDeTelefone + valorContaEscola + valorContaSupermercado + valorContaCartaoCredito;
        System.out.print("O valor total do gasto familiar é de: " + valorGastoFamiliar);
        
    }
}
