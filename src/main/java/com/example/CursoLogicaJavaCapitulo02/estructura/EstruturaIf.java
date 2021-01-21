package com.example.CursoLogicaJavaCapitulo02.estructura;

public class EstruturaIf {

    public static void main (String [] args){

        Double emprestimo = 4000.0;
        Double movimentacaoMedia = 2000.0;

        Boolean movimentaPeloMenosMetadeDoValor = (movimentacaoMedia * 2) >= emprestimo;
        Boolean aContaTemTempoSuficienteDeAbertura = true;
        Boolean temNomeLimpo = false;

        // variável LiberarEmprestimo que almacena as tres condicionais
        Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor
                && aContaTemTempoSuficienteDeAbertura && temNomeLimpo;

        //Toda expresão que retorna um valor booleano pode ser usada na estrutura If
        if((movimentacaoMedia * 2) >= emprestimo && aContaTemTempoSuficienteDeAbertura
        && temNomeLimpo){
            System.out.println("Sim! Pode liberar empréstimo. ");
        }else{
            System.out.println("Não pode liberar o empréstimo. ");
        }
    }
}
