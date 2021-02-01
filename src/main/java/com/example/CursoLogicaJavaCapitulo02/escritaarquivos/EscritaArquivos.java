package com.example.CursoLogicaJavaCapitulo02.escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class EscritaArquivos {

    //Tem que ser lanzado o throws IOException I: Input 0:Output
    //Para que o Files deixe de estar em vermelho
    public static void main(String[] args) throws IOException {
        ArrayList<String> linhas = new ArrayList<String>();
        //add é um método que adiciona items a uma lista
        linhas.add("Linha Um");
        Path arquivo = Paths.get("C:/Users/s.santos.pimenta/Documents/txt/meu-arquivo.txt");
        Files.write(arquivo, linhas);
        System.out.println("Fim...");
    }

}
