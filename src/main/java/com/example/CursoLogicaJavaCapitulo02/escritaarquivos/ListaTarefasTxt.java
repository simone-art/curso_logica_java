package com.example.CursoLogicaJavaCapitulo02.escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarefasTxt {

    //Crie uma lista de tarefas e salve a lista em um arquivo

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> linhas = new ArrayList<String>();

        for (int i = 0; i < 6; i++) {
            System.out.print("Tarefas do día " + i + " : ");
            String tarefas = scanner.nextLine();
            linhas.add(tarefas);
        }

        Path arquivo = Paths.get("C:/Users/s.santos.pimenta/Documents/txt/lista-tarefas.txt");
        Files.write(arquivo, linhas);
        System.out.println("Fim");
    }
}