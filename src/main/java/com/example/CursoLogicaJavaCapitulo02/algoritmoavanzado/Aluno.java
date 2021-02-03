package com.example.CursoLogicaJavaCapitulo02.algoritmoavanzado;

public class Aluno {

    String nome;

    boolean vemDepoisDe(Aluno aluno){
        return nome.compareTo(aluno.nome) > 0;
    }
}
