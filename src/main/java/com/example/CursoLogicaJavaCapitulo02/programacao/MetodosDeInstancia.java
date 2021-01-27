package com.example.CursoLogicaJavaCapitulo02.programacao;

public class MetodosDeInstancia {

    public static void main(String [] args){

        Cliente cliente = new Cliente();
        cliente.primeiroNome = "Simone";
        cliente.ultimoNome = "Santos";
        cliente.telefone = "11 5555 2233";
        cliente.email = "simsantos@algamorks.com.br";

        System.out.println("Nome Completo: " + cliente.primeiroNome + " " + cliente.ultimoNome );


          //MÉTODOS DE INSTÂNCIA
//        static String obterNomeCompletoCliente
    }
}
