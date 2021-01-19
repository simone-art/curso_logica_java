package com.example.CursoLogicaJavaCapitulo02.operadores;

public class OperadoresAritmeticos {

    public static void main (String [] args){
        Integer adicao = 1 + 1;
        System.out.println("O resultado da adição é : " + adicao);

        Integer subtracao = 1 - 1;
        System.out.println("O resultado da subtração é : " + subtracao);

        Integer multiplicacao = 2 * 2;
        System.out.println("O resultado da multiplicação é : " + multiplicacao);

        Integer divisao = 2 / 2;
        System.out.println("O resultado da divisao é : " + divisao);

        //Modulo é uma especie de divisão.Neste caso deve printar o resultado 1
        Integer modulo = 5 % 4;
        System.out.println("O resultado do módulo é : " + modulo);

        Integer precedencia01 = 1 + 1 * 5;
        System.out.println("O resultado é : " + precedencia01);

        //Com paréntesis, a soma agora se  calcula primeiro e depois a multiplicação
        Integer precedencia02 = (1 + 1) * 5;
        System.out.println("O resultado é : " + precedencia02);

        Integer cinco = 5;
        Integer uno = 1;
        Integer precedenciaComVariaveis = cinco * (uno + uno);
        System.out.println("O resultado é : " + precedenciaComVariaveis);



    }
}
