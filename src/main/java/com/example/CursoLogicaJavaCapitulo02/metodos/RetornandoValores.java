package com.example.CursoLogicaJavaCapitulo02.metodos;

public class RetornandoValores {

    public static void main (String [] args){
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

    Double [ ] premissaInicial = new Double[]{725.5, 100.0};
    Double proporcao = 20.0;

    Double resultadoFinal = regraDeTres(premissaInicial, proporcao);

    System.out.println("O resultado é: " + resultadoFinal);

    }

    static Double regraDeTres(Double[] premissaInicial, Double proporcao){
        Double resultadoFinal = (premissaInicial[0] * proporcao)/ premissaInicial[1];
        return resultadoFinal;
    }
}
