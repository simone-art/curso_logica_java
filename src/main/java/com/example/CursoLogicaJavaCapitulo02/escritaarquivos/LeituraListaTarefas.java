package com.example.CursoLogicaJavaCapitulo02.escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraListaTarefas {

    //Crie um programa que imprima, no console,
    // a lista de tarefas que você criou com o algoritmo da aula passada

    public static void main(String [] args) throws IOException {
        Path arquivo = Paths.get("C:/Users/s.santos.pimenta/Documents/txt/lista-tarefas.txt");
        List<String> linhas = Files.readAllLines(arquivo);

        for(int i = 0; i< linhas.size(); i++){
            String tarefas = linhas.get(i);
            System.out.println("Lista de Tarefas " + i + ": " + tarefas);

        }
    }
}
