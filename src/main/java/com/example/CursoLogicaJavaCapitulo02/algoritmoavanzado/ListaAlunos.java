package com.example.CursoLogicaJavaCapitulo02.algoritmoavanzado;

public class ListaAlunos {

    //int é um primitivo
    static final int QUANTIDADE_LISTA = 2;

    Aluno [] lista = new Aluno[QUANTIDADE_LISTA];

    //Controla o tamanho da lista
    int tamanhoLista = 0;

    Aluno obter(int indice){
        return lista[indice];
    }

    int tamanho(){
        return tamanhoLista;
    }

    //Método para adicionar aluno novo
    void adicionar (Aluno aluno){
        lista[tamanhoLista] = aluno;
        tamanhoLista++;
    }

}
