package com.example.CursoLogicaJavaCapitulo02.booleano;

public class TipoLogico {
    public static void main (String [] args) {

        Boolean variavelVerdadeira = true;
        System.out.println("Váriavel verdadeira: " + variavelVerdadeira);

        Boolean variavelFalsa = false;

        // O println separa as frases de uma string/ Printa uma embaixo da outra
        // O print junta as duas
        System.out.println("Váriavel falsa: " + variavelFalsa);

        System.out.println("===========================================");

        Integer idade = 19;

        Boolean podeTirarCarteria = idade >= 18;
        if (idade >= 18) {
            System.out.println("Sim! Você está habilitado pra tirar a sua carteira");
        } else {
            System.out.println("Náo! Você não está habilitado pra tirar a sua carteira");
        }
       }
    }