package capitulo3;

import java.util.Scanner;

public class Exercicio5 {

     static final Integer NOTA_MINIMA=80;

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Digite a sua nota: ");

        Integer nota=scanner.nextInt();

        if(nota >=NOTA_MINIMA){
            System.out.println("Aluno Aprovado!");
        }else{
            System.out.println("Aluno Reprovado! ");
        }




        scanner.close();

    }
}
