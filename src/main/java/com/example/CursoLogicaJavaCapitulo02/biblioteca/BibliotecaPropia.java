package com.example.CursoLogicaJavaCapitulo02.biblioteca;

import static com.example.CursoLogicaJavaCapitulo02.biblioteca.Interacao.*;

public class BibliotecaPropia {

    public static void main(String[] args){

        Interacao interacao = new Interacao();

        Integer numero = interacao.lerNumero("Digite um número: ");

        //Para que funcione a interacao.imprimir tem que se chamar a variável
        //E não a classe. Interacao.Imprimir NÃO FUNCIONA!
        interacao.imprimir("Número: " + numero);

        Double decimal = interacao.lerDecimal("Digite um número decimal: ");
        interacao.imprimir("Decimal: " + decimal);

        interacao.erro("Essa é uma mensagem de erro");

       interacao.fechar();


    }
}

