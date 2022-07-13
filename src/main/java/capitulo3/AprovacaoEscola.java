package capitulo3;

import java.util.Scanner;

public class AprovacaoEscola {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Informe as nota do aluno:");

        Double nota=scanner.nextDouble();

        if (nota>7){
            System.out.println("Aluno Aprovado");
        }else{
            System.out.println("Aluno Reprovado");
        }



    }
}
