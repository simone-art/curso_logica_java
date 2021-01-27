package com.example.CursoLogicaJavaCapitulo02.programacao;

public class Cliente {
    String primeiroNome;
    String ultimoNome;
    String telefone;
    String email;

    //Este método não precisa de o cliente.primeiroNome porque ao desenvolvé-lo
    // e tirar os parámetros Cliente cliente, você pode accesar os atributos
    // do objeto diretamente.
    
     String obterNomeCompletoCliente(){
        String nomeCompleto = primeiroNome + " " + ultimoNome;
        return nomeCompleto;
    }

}
