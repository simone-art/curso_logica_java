package com.example.CursoLogicaJavaCapitulo02.algoritmoavanzado;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class OrdenarListaAlunos {

    //Crie um arquivo de texto, no seu computador, com os seguintes nomes:
    //
    //Thiago
    //Maria
    //Alexandre
    //Normandes
    //João
    //Feito isso, crie um programa que faça a leitura do arquivo,
    // coloque os nomes em ordem alfabética e, por fim,
    // salve os nomes já ordenados em um arquivos diferente.

    //Código para criar uma lista de alunos e salvá-la em um arquivo txt

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> linhas = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Nome do Aluno:");
            String nomes = scanner.nextLine();
            linhas.add(nomes);
        }

        Path arquivo = Paths.get("C:/Users/s.santos.pimenta/Documents/txt/lista-nomes-alunos.txt");
        Files.write(arquivo, linhas);
        System.out.println("Fim");
    }
}
