package com.example.CursoLogicaJavaCapitulo02.biblioteca;

import java.util.Scanner;

//Clase para interatuar com o console
public class Interacao {

    Scanner scanner = new Scanner(System.in);

    //Método para lêr número
    public Integer lerNumero(String texto){
        System.out.print(texto);
        return scanner.nextInt();
    }

    //Método para lêr Decimal
    public Double lerDecimal(String texto){
        System.out.print(texto);
        return scanner.nextDouble();
    }

    //Método para lêr texto
    public String lerTexto(String texto){
        System.out.print(texto);
        return scanner.nextLine();
    }

    //Método para fechar o programa
    public void fechar(){
        scanner.close();
    }

    //Método para imprimir texto
    public void imprimir(String texto){
        System.out.println(texto);

    }

    //Método para imprimir erro
    public void erro(String texto){
        System.err.println(texto);

    }


}
