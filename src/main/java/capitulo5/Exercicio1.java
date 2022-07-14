package capitulo5;

import java.util.Scanner;

public class Exercicio1 {

    final static Double NOTA_MINIMA=150.00;
    final static Double NOTA_MINIMA_POR_MATERIA=60.00;

    public static void main(String[] args) {

        /**
         * Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova.
         * Serão dois parâmetros para receber um para receber a nota de português e outro para receber as de matemática.
         *
         * A prova, no total, vale 200 pontos - 100 para cada matéria.
         * A nota mínima total para passar é igual ou maior que 150.
         * Entretanto, o candidato não pode tirar menos do que 60 pontos em qualquer uma das duas matérias, ou seja,
         * se tirar 59 em português e 100 em matemática (totalizando uma nota maior do que o total necessário que é 150)
         * ele não conseguirá a vaga.
         *
         * No final mostre para o candidato se ele conseguiu ou não.*/

        Scanner scanner=new Scanner(System.in);

        System.out.println("Informe as duas notas da prova: ");
        Double nota1=scanner.nextDouble();
        Double nota2=scanner.nextDouble();

        Double notaFinal=(nota1+nota2);

        if(nota1>NOTA_MINIMA_POR_MATERIA && nota2>NOTA_MINIMA_POR_MATERIA && notaFinal>NOTA_MINIMA){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }



        scanner.close();



    }
}
