package capitulo6;

import java.util.Scanner;

public class Exemplo4 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Informe a quantidade de notas: ");
        int quantidadeNotas= scanner.nextInt();

        double soma=0.00;


        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print("Informe a "+ (i+1) +" nota: ");
            double notas= scanner.nextDouble();
            soma+=notas;

        }

            System.out.println("Media Final: "+(soma/quantidadeNotas));

            scanner.close();

        }


}
