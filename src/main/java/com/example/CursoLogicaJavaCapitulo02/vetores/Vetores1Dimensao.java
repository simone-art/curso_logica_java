package com.example.CursoLogicaJavaCapitulo02.vetores;

import java.util.Scanner;

public class Vetores1Dimensao {
    public static void main (String [] args){
        String [] cardapio = new String[]{"Calabresa", "Atum", "Queijo", "Presunto"};

        System.out.println("Escolha o sabor: ");
        for(int i = 0; i <cardapio.length; i++){
            System.out.println("[" + i+ "]" +cardapio[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número referente ao sabor: ");
        Integer saborEscolhido = scanner.nextInt();

        System.out.println("Você escolheo o sabor: " + cardapio[saborEscolhido]);
        scanner.close();

        }

}

