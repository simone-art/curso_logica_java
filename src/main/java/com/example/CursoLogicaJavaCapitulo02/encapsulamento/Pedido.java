package com.example.CursoLogicaJavaCapitulo02.encapsulamento;

public class Pedido {

    Integer codigo;
    Double subtotal;
    Double desconto;
    //Double total;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    //Encapsulamento usando os get das variáveis Subtotal e Desconto como
    //solicitado no exercicio
    public Double getTotal() {
        return getSubtotal() - getDesconto();
    }

//    public void setTotal(Double total) {
//        this.total = total;
//    }
}


