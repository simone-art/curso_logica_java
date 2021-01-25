package com.example.CursoLogicaJavaCapitulo02.vetores;

import java.util.Scanner;

public class CadastrarTarefasDoDia {

    //Crie um sistema onde o usuário vai cadastrar, utilizando o console,
    // as 5 tarefas mais importantes do dia dele.
    // Armazene cada uma dessas tarefas em um vetor e,
    // no final, imprima as tarefas novamente.

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        String [] tarefasDoDia = new String[5];

        for(int i = 0; i < tarefasDoDia.length; i++){
            System.out.print("Digite a Tarefa" + i + " : ");
            tarefasDoDia[i] = scanner.nextLine();
        }

        System.out.println("As tarefas de hoje são: " );
        for(int i = 0; i < tarefasDoDia.length; i++){
            System.out.print( i + ": "  + tarefasDoDia[i] + ", ");
        }

        scanner.close();
        

    }
}
