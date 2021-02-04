package com.example.CursoLogicaJavaCapitulo02.algoritmoavanzado;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraListaAlunos {

    // Código para criar um programa que faça a leitura do arquivo lista-nomes-alunos.txt

    public static void main(String [] args) throws IOException {
        Path arquivo = Paths.get("C:/Users/s.santos.pimenta/Documents/txt/lista-nomes-alunos.txt");
        List<String> linhas = Files.readAllLines(arquivo);

        for(int i = 0; i< linhas.size(); i++){
            String nomes = linhas.get(i);
            System.out.println("Nome do Aluno " + i + ": " + nomes);

        }
    }

}
