package com.example.CursoLogicaJavaCapitulo02.iteracao;

public class IteracaoFor {

    //Iterando com o laço for
    // A estrutura i<5 retorna um valor booleano!


    public static void main (String [] args){
//        for(int i = 0; i<5; i++){
//            System.out.println(i + " Imprima qualquer frase");
//        }

        Double [] carrinhoDeCompras = new Double[] {50.0, 50.0, 50.0};
        Double total = 0.0;
        for (int i = 0; i < carrinhoDeCompras.length; i++) {
            total = total + carrinhoDeCompras[i];
            System.out.println("Iteracao" + i + "," + "Total: " + total);
        }
        System.out.println("O total da compra é: " + total);
    }
}
