package com.example.CursoLogicaJavaCapitulo02.encapsulamento;

public class Encapsulamento {

    public static void main(String[] args){
       // Cliente cliente = new Cliente();
        //cliente.nome = "Simone Santos";
        //cliente.telefone = "11 9999 3322";
        //System.out.println("Nome cliente: " + cliente.nome + " " +  cliente.telefone);

        Cliente cliente = new Cliente();
        cliente.setNome("Simone Santos");
        cliente.setTelefone("11 8888 4567");

        //System.out.println("Nome cliente: " + cliente.getNome() + " " + cliente.getTelefone());
        System.out.println("Nome cliente: "  + cliente.getNome());
        System.out.println("Nome cliente: "  +cliente.getPrimeiroNome());
        System.out.println("Nome cliente: " + cliente.getUltimoNome());

    }

}
