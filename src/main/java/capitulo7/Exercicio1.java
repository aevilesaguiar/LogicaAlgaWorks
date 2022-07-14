package capitulo7;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        /**
         *Crie um sistema onde o usuário vai cadastrar, utilizando o console, as 5 tarefas mais importantes do dia dele.
         *  Armazene cada uma dessas tarefas em um vetor e, no final, imprima as tarefas novamente.
         *
         *  */

        Scanner scanner= new Scanner(System.in);

        String[] tarefa = new String[5];

        tarefa[0]="Acordar";
        tarefa[1]="Trabalhar";
        tarefa[2]="Estudar";
        tarefa[3]="Treinar";
        tarefa[4]="Tomar café";

        for (int i = 0; i < tarefa.length ; i++) {

            System.out.println((i+1)+"- Lista de Tarefas: " +tarefa[i]);
        }







        scanner.close();





    }
}
