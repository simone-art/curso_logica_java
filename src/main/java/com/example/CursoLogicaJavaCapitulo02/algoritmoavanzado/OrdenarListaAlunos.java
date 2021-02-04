package com.example.CursoLogicaJavaCapitulo02.algoritmoavanzado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenarListaAlunos {

    public static void main (String [] args){
        List listaNomes = new ArrayList();

        listaNomes.add("Thiago");
        listaNomes.add("Maria");
        listaNomes.add("Alexandre");
        listaNomes.add("Normandes");
        listaNomes.add("Joao");

        System.out.println("Lista sem ordem alfabética: " + listaNomes);

        Collections.sort(listaNomes);

        System.out.println("Lista em ordem alfabética: " + listaNomes);

    }
}
