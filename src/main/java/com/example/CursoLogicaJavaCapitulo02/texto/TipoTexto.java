package com.example.CursoLogicaJavaCapitulo02.texto;

import java.util.Scanner;

public class TipoTexto {

    //Código pra concatenar variáveis// Isso serve no return
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");

        //nextLine é pra ler texto
        String nome = scanner.nextLine();
        String mensagemSaudacao = "Olá, ";
        System.out.print(mensagemSaudacao + nome);

        scanner.close();
    }
}
