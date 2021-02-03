package com.example.CursoLogicaJavaCapitulo02.algoritmoavanzado;

public class AlgoritmoAvancado {

  public static void main(String[] args) {
    ListaAlunos listaAlunos = new ListaAlunos();

    Aluno aluno = new Aluno();
    aluno.nome = "Pedro";
    listaAlunos.adicionar(aluno);

    //aluno = new Aluno();
    Aluno aluno1 = new Aluno();
    aluno1.nome = "Alexandre";
    listaAlunos.adicionar(aluno1);


    //aluno = new Aluno();
    Aluno aluno2 = new Aluno();
    aluno2.nome = "Solange";
    listaAlunos.adicionar(aluno2);

    //aluno = new Aluno();
    Aluno aluno3 = new Aluno();
    aluno3.nome = "Jhon";
    listaAlunos.adicionar(aluno3);

    //aluno = new Aluno();
    Aluno aluno4 = new Aluno();
    aluno4.nome = "Thiago";
    listaAlunos.adicionar(aluno4);

    iterar(listaAlunos);

    listaAlunos.ordenar();

    iterar(listaAlunos);

    listaAlunos.remover(aluno3);

    iterar(listaAlunos);
  }

  static void iterar(ListaAlunos listaAlunos) {
    for (int i = 0; i < listaAlunos.tamanho(); i++) {
      Aluno a = listaAlunos.obter(i);
      if (a != null) {
        System.out.println("Aluno: " + a.nome);
      } else {
        System.out.println("Aluno sem nome");
      }
    }

    System.out.println("--------------------------");
  }
}

