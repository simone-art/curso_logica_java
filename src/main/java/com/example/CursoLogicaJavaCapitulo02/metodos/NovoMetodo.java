package com.example.CursoLogicaJavaCapitulo02.metodos;

import java.util.Scanner;

public class NovoMetodo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        imprimirTraco();

        String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};

        imprimirTexto("Escolha dentre os cursos abaixo: ");
//        System.out.println("Escolha dentre os cursos abaixo: ");

        iterarEexibirPosicoesDoVetorString(cursos);

//        for(int i = 0; i < cursos.length; i++) {
//            System.out.println("[" + i + "] " + cursos[i]);
//        }

        System.out.print("O curso que você deseja é o: ");
        Integer posicaoCursoEscolhido = scanner.nextInt();

        Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;

        if (!posicaoValida) {
            mensagemPosicaoValida();
        }

        imprimirTraco();

        String[] formasPagamento = new String[] {"Cartão", "Boleto"};

        System.out.println("Escolha dentre as formas de pagamento abaixo: ");

        iterarEexibirPosicoesDoVetorString(formasPagamento);

//        for(int i = 0; i < formasPagamento.length; i++) {
//            System.out.println("[" + i + "] " + formasPagamento[i]);
//        }

        imprimirTexto("Sua forma de pagamento escolhida é: ");
//        System.out.print("Sua forma de pagamento escolhida é: ");
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

    // Estes são vários métodos. Como o código se repetia
    // é melhor fazer o método e depois chamá-lo onde precisa

    //Neste método tem que ser passado um parámetro porque
    // o vetor Cursos, ele está no método main, e por isso não pode ser usado aqui
    //Depois no main, você incluirá -ao invocar o método- o parámetro curso

    static void iterarEexibirPosicoesDoVetorString(String[] vetor){
        for(int i = 0; i < vetor.length; i++) {
            System.out.println("[" + i + "] " + vetor[i]);
        }
    }

    static void imprimirTraco() {
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");
    }

    static void mensagemPosicaoValida(){
        System.err.println("Posição inválida!");
        System.exit(1);
    }

    static void imprimirTexto(String texto){
        System.out.println(texto);
    }
}
