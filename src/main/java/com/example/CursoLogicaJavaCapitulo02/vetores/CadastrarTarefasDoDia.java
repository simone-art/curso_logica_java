package com.example.CursoLogicaJavaCapitulo02.vetores;

import java.util.Scanner;

public class CadastrarTarefasDoDia {

    //Crie um sistema onde o usuário vai cadastrar, utilizando o console,
    // as 5 tarefas mais importantes do dia dele.
    // Armazene cada uma dessas tarefas em um vetor e,
    // no final, imprima as tarefas novamente.

    public static void main (String [] args){


        //String [] tarefasDoDia = new String[5];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a tarefa do día:");
        String tarefasDoDia01 = scanner.nextLine();
        System.out.print("Digite a tarefa do día:");
        String tarefasDoDia02 = scanner.nextLine();
        System.out.print("Digite a tarefa do día:");
        String tarefasDoDia03 = scanner.nextLine();
        System.out.print("Digite a tarefa do día:");
        String tarefasDoDia04 = scanner.nextLine();
        System.out.print("Digite a tarefa do día:");
        String tarefasDoDia05 = scanner.nextLine();

//        for (int i = 0; i < tarefasDoDia.length; i++) {
//          System.out.println(tarefasDoDia[i]);
//        }
//
//        tarefasDoDia[0] = "";
//        tarefasDoDia[1] = "";
//        tarefasDoDia[2] = "";
//        tarefasDoDia[3] = "";
//        tarefasDoDia[4] = "";
//
//        Scanner scanner = new Scanner(System.in);
////        for (int i = 0; i < 5; i++) {
////            System.out.println(tarefasDoDia[i]);
////        }
//
        System.out.println("A tarefa do día é: " + tarefasDoDia01 + "," + tarefasDoDia02 + "," + tarefasDoDia03  + "," + tarefasDoDia04  + ", e" + tarefasDoDia05);


    }
}
