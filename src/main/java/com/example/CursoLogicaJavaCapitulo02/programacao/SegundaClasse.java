package com.example.CursoLogicaJavaCapitulo02.programacao;

public class SegundaClasse {

    //Exercicio 2:
    //Faça exatamente como no exercício 1,só que agora torne o método,
    // que verifica a necessidade de repor estoque, como um método de instância.
    //Lembre-se de que ele não precisará mais receber parâmetros,
    // pois, usará as próprias variáveis de instância da classe Produto


    public static void main(String[] args) {
        ProdutoDois produtoDois = new ProdutoDois();
        produtoDois.nome = "Barras de Chocolate";
        produtoDois.precoUnitario = 5.0;
        produtoDois.quantidadeEstoque = 100;

        System.out.println("" + produtoDois.validarReposicaoEstoque());

    }

//    static void validarReposicaoEstoque(ProdutoDois produtoDois){
//        if(produtoDois.quantidadeEstoque < 10){
//            System.out.println("Tem que repor o estoque deste produto");
//        }else if(produtoDois.quantidadeEstoque >= 10){
//            System.out.println("Ainda tem estoque suficiente deste produto");
//        }
    }



    //Exercicio 1
//    public static void main(String[] args) {
//        ProdutoDois produtoDois = new ProdutoDois();
//        produtoDois.nome = "Barras de Chocolate";
//        produtoDois.precoUnitario = 5.0;
//        produtoDois.quantidadeEstoque = 9;
//        validarReposicaoEstoque(produtoDois);
//
//    }
//
//    static void validarReposicaoEstoque(ProdutoDois produtoDois){
//        if(produtoDois.quantidadeEstoque < 10){
//            System.out.println("Tem que repor o estoque deste produto");
//        }else if(produtoDois.quantidadeEstoque >= 10){
//            System.out.println("Ainda tem estoque suficiente deste produto");
//        }
//    }



















     //produtoDois.quantidadeEstoque = 100;
     //produtoDois.quantidadeProdutoComprado = 91;

    //calculoProdutoEmEstoque(produtoDois.quantidadeEstoque, produtoDois.quantidadeProdutoComprado);
//    validarReposicaoEstoque(calculoProdutoEmEstoque(produtoDois.quantidadeEstoque, produtoDois.quantidadeProdutoComprado);



    // Para que funcione um método que retorna valores é necessário
    //depois do static colocar o tipo do método (String, Integer)

//    static void calculoProdutoEmEstoque(Integer quantidadeEstoque, Integer quantidadeProdutoComprado){
//        Integer calculoProduto = (quantidadeEstoque - quantidadeProdutoComprado);
//        System.out.println("O total do produto em estoque é: " + calculoProduto );
//    }
//
//    static void validarReposicaoEstoque(Integer calculoProduto){
//        if(calculoProduto > 10){
//            System.out.println("Tem que repor o estoque deste produto");
//        }else if(calculoProduto >= 10){
//            System.out.println("Ainda tem estoque suficiente deste produto");
//        }
//    }

