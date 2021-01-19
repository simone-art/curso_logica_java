package com.example.CursoLogicaJavaCapitulo02.operadores;

import java.util.Scanner;

public class DescontoEmFrete {

    //Crie um programa que receba o valor de um produto e exiba o valor final da compra.
    // Esse valor final será o valor do produto mais o valor do frete -
    // use o valor do frete como R$15,00.
    // Uma compra de, por exemplo, R$80,00, teria um valor final de R$95,00.
    //Agora, caso a compra seja maior ou igual a R$100,00, então não cobre o frete.

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();
        Double valorFrete = 0.0;

        if (valorProduto >= 100){
            Double valorFinalCompraSemFrete = valorProduto - valorFrete;
            System.out.println("O valor final da compra é de Rs: " +valorFinalCompraSemFrete  + " com o frete gratis!");
        }else if(valorProduto < 100){
            valorFrete = 15.0;
            Double valorFinalCompraComFrete= valorProduto + valorFrete;
            System.out.println("O valor final da compra mas o frete é de: " +valorFinalCompraComFrete);
        }
        scanner.close();
    }
}

//System.out.println("Comprou mais produtos? 1)Sim 2)Nao ");
//        Integer comprouMaisProdutos = scanner.nextInt();
//        if (comprouMaisProdutos == 1) {
//        Double soma = valorProduto + valorProduto;
//        }else if(comprouMaisProdutos ==2) {
//        Double soma = valorProduto + frete;
//        }