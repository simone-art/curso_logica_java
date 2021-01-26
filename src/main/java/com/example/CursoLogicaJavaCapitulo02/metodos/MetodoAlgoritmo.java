package com.example.CursoLogicaJavaCapitulo02.metodos;

import java.util.Scanner;

public class MetodoAlgoritmo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        imprimirTraco();

        String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};

        System.out.println("Escolha dentre os cursos abaixo: ");

        for(int i = 0; i < cursos.length; i++) {
            System.out.println("[" + i + "] " + cursos[i]);
        }

        System.out.print("O curso que você deseja é o: ");
        Integer posicaoCursoEscolhido = scanner.nextInt();

        Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;


        if (!posicaoValida) {
            mensagemPosicaoValida();
        }

        imprimirTraco();

        String[] formasPagamento = new String[] {"Cartão", "Boleto"};

        System.out.println("Escolha dentre as formas de pagamento abaixo: ");

        for(int i = 0; i < formasPagamento.length; i++) {
            System.out.println("[" + i + "] " + formasPagamento[i]);
        }

        System.out.print("Sua forma de pagamento escolhida é: ");
        Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();

        posicaoValida = posicaoFormaPagamentoEscolhida >= 0
                && posicaoFormaPagamentoEscolhida < formasPagamento.length;


        if (!posicaoValida) {
            mensagemPosicaoValida();
        }

        String cursoEscolhido = cursos[posicaoCursoEscolhido];
        String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

        imprimirTraco();

        System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

        scanner.close();
    }

    // Este é um método. Como o código se repetia
    // é melhor fazer o método e depois chamá-lo onde precisa

    static void imprimirTraco() {
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");
    }

    static void mensagemPosicaoValida(){
            System.err.println("Posição inválida!");
            System.exit(1);
        }
    }

