package com.example.CursoLogicaJavaCapitulo02.estructura;

public class EstruturaIf {

    public static void main (String [] args){
        Boolean movimentaPeloMenosMetadeDoValor = true;
        Boolean aContaTemTempoSuficienteDeAbertura = true;
        Boolean temNomeLimpo = true;

        // variável LiberarEmprestimo que almacena as tres condicionais
        Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor
                && aContaTemTempoSuficienteDeAbertura && temNomeLimpo;
        if(liberarEmprestimo){
            System.out.println("Sim! Pode liberar empréstimo. ");
        }
    }
}
