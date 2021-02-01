package com.example.CursoLogicaJavaCapitulo02.encapsulamento;

public class ProgramaPedido {

    public static void main (String[] args){

        Pedido pedido = new Pedido();
        pedido.codigo = 1;
        pedido.subtotal = 10.0;
        pedido.desconto = (pedido.subtotal * 10) / 100;
//        pedido.total = pedido.subtotal - pedido.desconto;

//        System.out.println("O código do produto é: " + pedido.codigo);
//        System.out.println("O subtotal do produto é: " + pedido.subtotal);
//        System.out.println("O desconto do produto é: " + pedido.desconto);
//        System.out.println("O total a pagar do pedido é: " + pedido.total);

//        System.out.println("O código do produto é: " + pedido.getCodigo());
//        System.out.println("O subtotal do produto é: " + pedido.getSubtotal());
//        System.out.println("O desconto do produto é: " + pedido.getDesconto());
//        System.out.println("O total a pagar do pedido é: " + pedido.getTotal());

        //EXERCICIO 2
        System.out.println("O código do produto é: " + pedido.getCodigo());
        System.out.println("O subtotal do produto é: " + pedido.getSubtotal());
        System.out.println("O desconto do produto é: " + pedido.getDesconto());
        System.out.println("O total a pagar do pedido é: " + pedido.getTotal());
    }
}
