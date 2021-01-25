package com.example.CursoLogicaJavaCapitulo02.vetores;

import javax.print.Doc;

public class SemanaMaiorFaturamento {


    //Repare nos vetores abaixo:
    //Os quatro primeiros vetores estão guardando o faturamento diário de cada semana
    // e o último vetor, que é de 2 dimensões,
    // guarda o faturamento mensal separado por semanas.
    //Crie um algoritmo que encontre qual a semana teve o maior faturamento.
    // No final mostre qual foi essa semana e de quanto foi esse faturamento.

    public static void main (String [] args){

        Double[] semanaUm = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
        Double[] semanaDois = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
        Double[] semanaTres = new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
        Double[] semanaQuatro = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

        Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };

        Double totalSemanalFaturamento = semanaUm[0] + semanaUm[1] + semanaUm[2] + semanaUm[3] + semanaUm[4] + semanaUm[5] + semanaUm[6];
        System.out.println("O total da semana Um é: " + totalSemanalFaturamento);

        Double totalSemanalFaturamentoDois = semanaDois[0] + semanaDois[1] + semanaDois[2] + semanaDois[3] + semanaDois[4] + semanaDois[5] + semanaDois[6];
        System.out.println("O total da semana Dois é: " + totalSemanalFaturamentoDois);

        Double totalSemanalFaturamentoTres = semanaTres[0] + semanaTres[1] + semanaTres[2] + semanaTres[3] + semanaTres[4] + semanaTres[5] + semanaTres[6];
        System.out.println("O total da semana Tres é: " + totalSemanalFaturamentoTres);

        Double totalSemanalFaturamentoQuatro = semanaQuatro[0] + semanaQuatro[1] + semanaQuatro[2] + semanaQuatro[3] + semanaQuatro[4] + semanaQuatro[5] + semanaQuatro[6];
        System.out.println("O total da semana Quatro é: " + totalSemanalFaturamentoQuatro);

         if(totalSemanalFaturamento >= totalSemanalFaturamentoDois || totalSemanalFaturamento >= totalSemanalFaturamentoTres || totalSemanalFaturamento >= totalSemanalFaturamentoQuatro ){
             System.out.println("A semana um é a de maior venta um com um total de:" + totalSemanalFaturamento );

        }else if(totalSemanalFaturamentoDois >= totalSemanalFaturamento || totalSemanalFaturamentoDois >= totalSemanalFaturamentoTres || totalSemanalFaturamentoTres >= totalSemanalFaturamentoQuatro) {
             System.out.println("A semana Dois é a de maior venta com um total de:" + totalSemanalFaturamentoDois);

         }else if(totalSemanalFaturamentoTres >= totalSemanalFaturamento || totalSemanalFaturamentoTres >= totalSemanalFaturamentoDois || totalSemanalFaturamentoTres >= totalSemanalFaturamentoQuatro){
             System.out.println("A semana tres é a de maior venda com um total de: " + totalSemanalFaturamentoTres);
         }else if(totalSemanalFaturamentoQuatro >= totalSemanalFaturamento || totalSemanalFaturamentoQuatro>= totalSemanalFaturamentoDois || totalSemanalFaturamentoQuatro>= totalSemanalFaturamentoTres){
             System.out.println("A semana quatro é a de maior venda com um total de " + totalSemanalFaturamentoTres);
         }
    }

}
