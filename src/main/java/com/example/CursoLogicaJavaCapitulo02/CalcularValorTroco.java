package com.example.CursoLogicaJavaCapitulo02;

import java.util.Scanner;

public class CalcularValorTroco {

    public static void main (String[] args){

        //Funcionalidade que facilita a leitura de um número que o usuário digitar
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor do produto: ");
        //Definicão de variável pra salvar o número digitado/ double tipo numérico
        Double valorProduto = scanner.nextDouble();

        System.out.print("Digite a quantidade dada pelo cliente: ");
        Double valorCliente = scanner.nextDouble();

        // Exhibir texto com variável só é possível através do signo + (concatenação)
        // É boa prática testar antes, linha por linha pra ver se tudo está certo
        Double valorTroco = valorCliente - valorProduto;
        System.out.print("O valor do troco é :" + valorTroco);

        // Funcionalidade que indica que o recurso está fechado
         scanner.close();
    }
}
