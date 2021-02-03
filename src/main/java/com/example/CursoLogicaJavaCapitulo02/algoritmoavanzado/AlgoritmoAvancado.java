package com.example.CursoLogicaJavaCapitulo02.algoritmoavanzado;

public class AlgoritmoAvancado {

  public static void main(String[] args) {
    ListaAlunos lista = new ListaAlunos();

    Aluno aluno = new Aluno();
    aluno.nome = "Pedro";
    lista.adicionar(aluno);

    aluno = new Aluno();
    aluno.nome = "Alexandre";
    lista.adicionar(aluno);

    aluno = new Aluno();
    aluno.nome = "Solange";
    lista.adicionar(aluno);

    aluno = new Aluno();
    aluno.nome = "Jhon";
    lista.adicionar(aluno);

    aluno = new Aluno();
    aluno.nome = "Thiago";
    lista.adicionar(aluno);

    //Agora é neccesário iterar na lista

    for (int i = 0; i < lista.tamanho(); i++) {
      Aluno a = lista.obter(i);
      System.out.println("Aluno: " + a.nome);
    }
  }
}