package com.example.CursoLogicaJavaCapitulo02.operadores;

public class OperadoresLogicos {

    //Operador Lógico E &&
    public static void main(String[] args) {
//        Boolean carrinhoMaiorQue100 = false;
//        Boolean periodoDePromocao = false;

//        Boolean aplicarDesconto = carrinhoMaiorQue100 && periodoDePromocao;
//        if(aplicarDesconto){
//            System.out.print("Sim! Aplique o desconto");
//        } else{
//            System.out.print("Não aplique o desconto!");
//        }
        //Operador Lógico 0u ||
        // Se colocar os dois false, printará não tela que não vai aplicar desconto
        //Se colocar um false e outro true, printará na tela que vai aplicar o desconto
        Boolean carrinhoMaiorQue100 = false;
        Boolean periodoDePromocao = false;

        Boolean aplicarDesconto = carrinhoMaiorQue100 || periodoDePromocao;
        if(aplicarDesconto){
            System.out.print("Sim! Aplique o desconto");
        } else{
            System.out.print("Não aplique o desconto!");
            }
    }
}