package capitulo5;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        /**
         *Crie um programa que vai receber um número que será referente ao dia da semana (de 1 até 7).
         * Dependendo do número informado você deve imprimir o nome desse dia.
         *
         * Se o número 1 for informado, então deverá ser impresso "domingo", se 2, então "segunda-feira" e por ai vai. */

        Scanner scanner=new Scanner(System.in);

        System.out.println("Informe o número referente ao dia da semana: ");
        Integer numeroDiaSemana=scanner.nextInt();
        String dia;

        switch (numeroDiaSemana){

            case 1: dia="Domingo";
            break;
            case 2: dia="Segunda";
            break;
            case 3:dia="Terça";
            break;
            case 4:dia="Quarta";
            break;
            case 5: dia="Quinta";
            break;
            case 6: dia="Sexta";
            break;
            case 7: dia="Sábado";
            break;
            default:dia="INVÁLIDO!";
        }

        System.out.println("O dia escolhido foi: "+dia);


        scanner.close();

    }
}
