package com.example.CursoLogicaJavaCapitulo02.booleano;

import java.util.Scanner;

public class AlunoPassouOuNao {
    //O seu programa deve receber a nota do aluno pelo console
    // e depois você vai fazer uma operação lógica para saber se a nota do aluno é maior que 70.
    // O resultado dessa operação lógica deve ser atribuido a uma variável do tipo Boolean.
    //Por último, você deve utilizar a variável do tipo Boolean com a estrutura de decisão if
    // para imprimir, no console, uma mensagem que vai dizer se o aluno passou ou não passou.


    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        // Primeiro se escreve o system e depois a variável com o uso do Scanner
        // para executar o programa. Do contrário, ele não executa.

        System.out.println("Digite a primeira nota da materia matemática: ");
        Integer notaMatematicaUno = scanner.nextInt();

        System.out.println("Digite a segunda nota da materia matemática: ");
        Integer notaMatematicaDos = scanner.nextInt();


        System.out.println("Digite a terceira nota da materia matemática : ");
        Integer notaMatematicaTres = scanner.nextInt();

        Integer notaPromedio = (notaMatematicaUno + notaMatematicaDos + notaMatematicaTres) / 3;

        Boolean mensagemAlunoPassou = true;
        Boolean mensagemAlunoReprovou = false;

        if(notaPromedio >= 70){
            System.out.println("Você aprovou a materia! " + mensagemAlunoPassou);
        }else{
            System.out.println("Voce reprovou a materia! " + mensagemAlunoReprovou);
        }
        scanner.close();
    }
}
