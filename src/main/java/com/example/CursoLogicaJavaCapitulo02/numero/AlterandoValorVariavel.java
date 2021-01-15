package com.example.CursoLogicaJavaCapitulo02.numero;

import java.util.Scanner;

public class AlterandoValorVariavel {

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        // Com o print, o valor digitado pelo usuário vai ficar ao lado da frase
        // Com o println, o valor digitado pelo usuário fica embaixo da frase

        System.out.print("Digite o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.print("Escolha a forma de pagamento [ 1 = á vista / 2 = á prazo] : ");
        Integer formaPagamento = scanner.nextInt();

        //Esta parte do código funciona como uma pergunta
        //O número 1 vai ser almacenado na variável forma de pagamento.
        Boolean pagamentoVista = formaPagamento.equals(1);

        // Juros serão zero quando o pagamento for a vista
        Double juros = 0.0;

        if(pagamentoVista){

        }else{
            juros = 10.0;
        }

        Double acrescimo = (valorProduto * juros) / 100;
        Double valorTotal = valorProduto + acrescimo;

        System.out.println("O valor do pagamento é: " + valorTotal);



        scanner.close();
    }
}
