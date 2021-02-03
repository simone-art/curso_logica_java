package com.example.CursoLogicaJavaCapitulo02.algoritmoavanzado;

public class AlgoritmoAvancado {

  public static void main(String[] args) {
    ListaAlunos lista = new ListaAlunos();

    Aluno aluno = new Aluno();
    aluno.nome = "Pedro";
    lista.adicionar(aluno);

    //aluno = new Aluno();
    Aluno aluno1 = new Aluno();
    aluno1.nome = "Alexandre";
    lista.adicionar(aluno1);


    //aluno = new Aluno();
    Aluno aluno2 = new Aluno();
    aluno2.nome = "Solange";
    lista.adicionar(aluno2);

    //aluno = new Aluno();
    Aluno aluno3 = new Aluno();
    aluno3.nome = "Jhon";
    lista.adicionar(aluno3);

    //aluno = new Aluno();
    Aluno aluno4 = new Aluno();
    aluno4.nome = "Thiago";
    lista.adicionar(aluno4);

    //Agora é neccesário iterar na lista

    for (int i = 0; i < lista.tamanho(); i++) {
      Aluno a = lista.obter(i);
      System.out.println("Aluno: " + a.nome);
    }

    System.out.println("===========================");

    lista.remover(aluno2);

    for (int i = 0; i < lista.tamanho(); i++) {
      Aluno a = lista.obter(i);
      System.out.println("Aluno: " + a.nome);
    }
  }

}