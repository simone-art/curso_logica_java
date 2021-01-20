package com.example.CursoLogicaJavaCapitulo02.operadores;

public class OperadoresLogicos {

    //Operador Lógico E &&
    public static void main(String[] args) {
        Boolean carrinhoMaiorQue100 = true;
        Boolean periodoDePromocao = true;

        Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao;
        if(aplicarDesconto){
            System.out.print("Sim! Aplique o desconto");
        } else{
            System.out.print("Não aplique o desconto!");
        }
        //Operador Lógico 0u ||

//        Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao;
//        if(aplicarDesconto){
//            System.out.print("Sim! Aplique o desconto");
//        } else{
//            System.out.print("Não aplique o desconto!");
//            }
    }
}