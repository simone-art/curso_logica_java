package com.example.CursoLogicaJavaCapitulo02.algoritmoavanzado;

public class ListaAlunos {

    static final int QUANTIDADE_LISTA = 5;

    Aluno[] lista = new Aluno[QUANTIDADE_LISTA];

    int tamanhoLista = 0;

    Aluno obter(int indice) {
        return lista[indice];
    }

    int tamanho() {
        return tamanhoLista;
    }

    void adicionar(Aluno aluno) {
        if (tamanhoLista == lista.length) {
            Aluno[] novaLista = new Aluno[QUANTIDADE_LISTA + lista.length];

            for (int i = 0; i < lista.length; i++) {
                novaLista[i] = lista[i];
            }

            lista = novaLista;
        }

        lista[tamanhoLista] = aluno;
        tamanhoLista++;
    }

    void remover(Aluno aluno){
        for (int i = 0; i <tamanhoLista; i++){
            Aluno a = lista[i];

            if(a.equals(aluno)){
                remover(i);
                break;
            }
        }
    }
    void remover(int indice){
        // Se a lista for {"A", "B", "C"}
        //// Agora ao remover o item B ficará  {"A", "C"}
        //Você remove o valor e a posição deixada por esse valor e tomada por o item seguinte a lista
        int indiceInicial = indice + 1;
        for(int i = indiceInicial; i<tamanhoLista; i++){
            lista[i - 1] = lista[i];
        }
        //Tamanho da lista fica mais pequeno
        tamanhoLista--;
        //Limpa o espaço deixado pelo item removido
        lista[tamanhoLista] = null;

    }
    //Ordenar nomes de alunos na lista de forma alfabética
    void ordenar() {
        for (int i = 1; i < tamanhoLista; i++) {
            Aluno alunoPosicaoBase = lista[i];

            int indicePosicaoBase = i;

            while (indicePosicaoBase > 0) {
                int indicePosicaoAnterior = indicePosicaoBase - 1;
                Aluno alunoPosicaoAnterior = lista[indicePosicaoAnterior];

                Boolean alunoPosicaoAnteriorVemDepoisDe = alunoPosicaoAnterior == null
                        || alunoPosicaoAnterior.vemDepoisDe(alunoPosicaoBase);

                if (alunoPosicaoAnteriorVemDepoisDe) {
                    lista[indicePosicaoBase] = lista[indicePosicaoAnterior];

                    indicePosicaoBase--;
                } else {
                    break;
                }
            }

            lista[indicePosicaoBase] = alunoPosicaoBase;
        }
    }
 }

