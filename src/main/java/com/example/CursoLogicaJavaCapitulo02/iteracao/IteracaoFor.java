package com.example.CursoLogicaJavaCapitulo02.iteracao;

public class IteracaoFor {

    //Iterando com o laço for
    // A estrutura i<5 retorna um valor booleano!


    public static void main(String[] args) {
//        for(int i = 0; i<5; i++){
//            System.out.println(i + " Imprima qualquer frase");
//        }

//        Double [] carrinhoDeCompras = new Double[] {50.0, 50.0, 50.0};
//        Double total = 0.0;
//        for (int i = 0; i < carrinhoDeCompras.length; i++) {
//            total = total + carrinhoDeCompras[i];
//            System.out.println("Iteracao" + i + "," + "Total: " + total);
//        }
//        System.out.println("O total da compra é: " + total);

        //Com o uso do break, você para o código
//        for (int i = 0; i < 10; i++) {
//            if(i== 5){
//                System.out.println("Vai parar!");
//                break;
//            }
//            System.out.println("Iteracao" + i);
//        }

        //Com o continue, o código não printa a iteração 5 e continua no 6
//        for (int i = 0; i < 10; i++) {
//            if(i== 5){
//                System.out.println("Vai continuar!");
//                continue;
//            }
//            System.out.println("Iteracao" + i);
//        }

        Integer [] produtos = new Integer[]{100, 225, 300};
        for (int i = 0; i < produtos.length; i++) {
            Integer produto = produtos[i];
            if (produto.equals(225)){
                System.out.println("Produto encontrado!");
                break;
            }
        }

    }
}