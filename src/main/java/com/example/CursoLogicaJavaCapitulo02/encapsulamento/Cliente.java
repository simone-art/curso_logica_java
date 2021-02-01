package com.example.CursoLogicaJavaCapitulo02.encapsulamento;

public class Cliente {

    //String nome;

    String primeiroNome;
    String ultimoNome;

    String telefone;
     //Encapsulamento permite alterar um valor para não mexer no resto do sistema
    //get é um padrão do JAVA para recuperar a variável através de um método
    //Com isso você tem acceso ao método ao invés de usar a propiedade diretamente
    //Os getter and seter fazem o encapsulamento
    public String getNome() {
        //return nome;
        return primeiroNome + "" + ultimoNome;
    }

    //This da a entender que está usando uma variável de instância
    // e dentro do mesmo método eu tenho uma variável local
    //Com o mesmo nome;
    //String nome é um parámetro
    //Nome em roxo é a variável de instáncia que está na linha 5
    //Void não retorna nada e só coloca valor na variável de instância
    public void setNome(String nome) {
        //this.nome = nome;
        //Split, propiedade do Java que permite pegar valores separados po espaço
        //Para que o split funcione, deve-se SEPARAR as aspas
        String[] nomeCompleto = nome.split(" ");
        primeiroNome = nomeCompleto[0];
        ultimoNome = nomeCompleto[1];
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }
}




