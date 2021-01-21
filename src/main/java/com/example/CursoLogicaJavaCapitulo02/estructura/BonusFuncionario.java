package com.example.CursoLogicaJavaCapitulo02.estructura;

import java.util.Scanner;

public class BonusFuncionario {

    //Pense em uma empresa fictícia que todo o mês de Janeiro
    // premia seus funcionários com um bônus, caso a meta seja alcançada.
    //Crie um programa que receba 3 parâmetros.
    // O primeiro será a meta de faturamento anual da empresa para o ano que passou.
    // Depois, receba o parâmetro referente ao faturamento real da empresa no ultimo ano.
    // Por último, receba a média salarial do funcionário(a)
    // para o ano anterior (não precisa fazer cálculo de média salarial,
    // já que estamos trabalhando com um algoritmo fictício -
    // na hora de informar esse parâmetro,
    // invente um valor qualquer para representar essa média salarial).
    //Nessa empresa fictícia,
    // se o faturamento real for igual ou maior que a meta de faturamento anual,
    // então os funcionários ganharam um bônus que será igual a média salarial deles
    // no último ano.
    // Caso o faturamento seja menor que a meta,
    // mas, seja maior ou igual a 80% do valor da meta,
    // então eles receberão também 80% de sua média salarial.

    //No final, mostre de quanto será o prêmio desse funcionário(a).

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Double metaFaturamentoAnual = 1000000.0;

        Double faturamentoReal = 200000.0;
        faturamentoReal = faturamentoReal * 100 / metaFaturamentoAnual;

        Double mediaSalarialFuncionario = 4000.0;

        if (faturamentoReal >= 100) {
            System.out.println("Você receberá um bonus de 100% equivalente a Rs " + mediaSalarialFuncionario);

        } else if (faturamentoReal <= metaFaturamentoAnual && faturamentoReal > 80 && faturamentoReal <= 90) {
            mediaSalarialFuncionario = (mediaSalarialFuncionario * 80) / 100;
            System.out.println("Você receberá um bonus de 80% equivalente a Rs " + mediaSalarialFuncionario);
        } else if (faturamentoReal <= metaFaturamentoAnual && faturamentoReal < 80) {
            System.out.println("Você não receberá este ano nenhum bonus");
            scanner.close();
        }
    }
}