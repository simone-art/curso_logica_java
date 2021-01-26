package com.example.CursoLogicaJavaCapitulo02.metodos;

import java.util.Scanner;

public class RetornandoValores {

    public static void main(String[] args) {
//       Integer numeroQualquer = numeroAleatorio();
//       System.out.println("Número: " + numeroQualquer);
//    }
//
//    //Para usar o return não se pode usar a palavra reservada void
//    //O void não permite retornar valores
//    static Integer numeroAleatorio(){
//        Integer numero = 1;
//        return numero;

        // 50 -------- 100%
        //  --------   20%

//    Double [ ] premissaInicial = new Double[]{725.5, 100.0};
//    Double proporcao = 20.0;
//
//    Double resultadoFinal = regraDeTres(premissaInicial, proporcao);
//
//    System.out.println("O resultado é: " + resultadoFinal);
//
//    }
//
//    static Double regraDeTres(Double[] premissaInicial, Double proporcao){
//        Double resultadoFinal = (premissaInicial[0] * proporcao)/ premissaInicial[1];
//        return resultadoFinal;
//    }

            Scanner scanner = new Scanner(System.in);

            imprimirTraco();

            String[] cursos = new String[]{"Java EE", "Spring", "Java OO Avançado"};

            imprimir("Escolha dentre os cursos abaixo: ");

            iterarEExibirPosicoesDoVetorString(cursos);

            Integer posicaoCursoEscolhido = receberNumeroInteiroDoUsuario("O curso que você deseja é o: ", scanner);

            Boolean posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoCursoEscolhido, cursos);

            if (!posicaoValida) {
                encerrarProgramaPorCausaDaPosicaoInvalida();
            }

            imprimirTraco();

            String[] formasPagamento = new String[]{"Cartão", "Boleto"};

            imprimir("Escolha dentre as formas de pagamento abaixo: ");

            iterarEExibirPosicoesDoVetorString(formasPagamento);

            Integer posicaoFormaPagamentoEscolhida = receberNumeroInteiroDoUsuario("Sua forma de pagamento escolhida é: ", scanner);

            posicaoValida = verificarPosicaoEscolhidaPeloUsuario(posicaoFormaPagamentoEscolhida, formasPagamento);

            if (!posicaoValida) {
                encerrarProgramaPorCausaDaPosicaoInvalida();
            }

            String cursoEscolhido = cursos[posicaoCursoEscolhido];
            String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];

            imprimirTraco();

            imprimir("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento é " + formaPagamentoEscolhida);

            scanner.close();
        }

        static Integer receberNumeroInteiroDoUsuario (String texto, Scanner scanner){
            imprimirEContinuarNaMesmaLinha(texto);
            Integer numero = scanner.nextInt();

            return numero;
        }

        static Boolean verificarPosicaoEscolhidaPeloUsuario (Integer posicao, String[]vetor){
            Boolean valida = posicao >= 0 && posicao < vetor.length;
            return valida;
        }

        static void imprimir (String texto){
            System.out.println(texto);
        }

        static void imprimirEContinuarNaMesmaLinha (String texto){
            System.out.print(texto);
        }

        static void iterarEExibirPosicoesDoVetorString (String[]vetor){
            for (int i = 0; i < vetor.length; i++) {
                imprimir("[" + i + "] " + vetor[i]);
            }
        }

        static void imprimirTraco () {
            imprimir("----------------------------------------------");
        }

        static void encerrarProgramaPorCausaDaPosicaoInvalida () {
            System.err.println("Posição inválida!");
            System.exit(1);
        }
    }
