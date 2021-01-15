package com.example.CursoLogicaJavaCapitulo02.numero;

import java.util.Scanner;

public class CalculoDescontoProduto {

    //Crie um programa que vai receber do usuário o valor do produto e a quantidade do produto que se deseja.
    // Com essas informações encontre o subtotal que será o valor do produto multiplicado pela quantidade.
    //
    //Depois você vai precisar usar uma estrutura de decisão.
    // Se a quantidade desejada do produto for maior que 10 unidades,
    // vai ser preciso dar um desconto de 10% em cima do subtotal,
    // mas se for menor que 10, você NÃO aplica desconto algum.
    //
    //Para encontrar o valor referente ao percentual de desconto
    // (que vai ser 0% ou 10%, dependendo da quantidade),
    // você multiplica o subtotal pelo próprio percentual e divide tudo por 100.
    //
    //Tendo o valor referente ao percentual de desconto, você vai retirar esse valor do subtotal.
    // O que sobrar será o valor total final e deverá ser apresentado no console.

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.print("Digite a quantidade de produto adquiridos: ");
        Integer quantidadeProduto = scanner.nextInt();

        Double valorDesconto = 0.0;

        Double valorSubtotal = valorProduto * quantidadeProduto;
        System.out.println("O valor subtotal é:" + valorSubtotal);


        if(quantidadeProduto <= 10){

        }else{
            valorDesconto = 10.0;
            Double valorTotalDesconto = (valorSubtotal * valorDesconto) /100;
            System.out.println("O valor total do desconto é: " + valorTotalDesconto);
            Double valorTotalProduto = (valorSubtotal-valorTotalDesconto);
            System.out.println("O valor total do produto com o desconto é: " + valorTotalProduto);
        }


    }
}
