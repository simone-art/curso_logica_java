package com.example.CursoLogicaJavaCapitulo02.vetores;

public class VetoresDeMaisDeDuasDimensoes {

    //Vetores de duas dimensões para que funcionen, deve existir um vector de uma dimensão
    // O valor do vector de duas dimensões precisa ser um vector de uma dimensão

    public static void main (String [] args){

        //Vectores de uma dimensão                  1500=[0]==
        Double [] faturamentoJaneiro = new Double[] {1500.0, 2000.0, 7000.0, };
        Double [] faturamentoFevereiro = new Double[] {700.0, 1200.0, 4000.0 };

        //Vector de duas dimensões                      ====== [0]========
        Double [] [] faturamentoAnual = new Double[] [] {faturamentoJaneiro, faturamentoFevereiro};

       //Vector de tres dimensões
        //No vector de 3 só cabe um vector de duas dimensões e assim sucessivamente
        Double [] [] [] faturamentoQuinquenal = new Double[][][]{faturamentoAnual};

        //Vector de quatro dimensões
        //No vector de 4 só cabe um vector de tres dimensões e assim sucessivamente
        Double [] [] [] [] faturamentoDaDecada = new Double[][][] []{faturamentoQuinquenal};


        }
    }

