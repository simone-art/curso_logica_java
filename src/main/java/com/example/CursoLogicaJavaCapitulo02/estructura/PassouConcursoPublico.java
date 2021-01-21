package com.example.CursoLogicaJavaCapitulo02.estructura;

import java.util.Scanner;

public class PassouConcursoPublico {

    //Crie um programa que vai receber as notas que uma pessoa tirou
    // nas duas materias de sua prova.
    // Serão dois parâmetros para receber:
    // um para receber a nota de português e outro para receber as de matemática.

    //A prova, no total, vale 200 pontos - 100 para cada matéria.
    // A nota mínima total para passar é igual ou maior que 150.
    // Entretanto, o candidato não pode tirar menos do que 60 pontos
    // em qualquer uma das duas matérias ou seja, se tirar 59 em português e 100 em matemática
    // (totalizando uma nota maior do que o total necessário que é 150)
    // ele não conseguirá a vaga.

    //No final mostre para o candidato se ele conseguiu ou não.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua nota da prova de português: ");
        Integer notaPortugues = scanner.nextInt();

        System.out.print("Digite a sua nota da prova de matemática: ");
        Integer notaMatematica = scanner.nextInt();


        Integer notaTotalObtida= notaPortugues + notaMatematica;
        System.out.println("O valor total das provas são: " + notaTotalObtida);

        if (notaPortugues <= 59 && notaMatematica <= 100 || notaMatematica <= 59 && notaPortugues <= 100) {
            System.out.println("Você não passou no concurso! ");
        } else if (notaPortugues >= 60 && notaMatematica <= 100 || notaMatematica >= 60 && notaPortugues <= 100) {
            {
                System.out.println("Você passou no concurso! ");
            }
        }
        scanner.close();
    }
}