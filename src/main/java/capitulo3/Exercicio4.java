package capitulo3;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Informe o valor do Produto: R$ ");

        Double vprod=scanner.nextDouble();

        System.out.print("Informe o quantidade do Produto:");

        Double qprod=scanner.nextDouble();

        Double valortotal=vprod*qprod;

        Double pdesconto=0.00;

        if(qprod>10){

           pdesconto=15.00;
        }

        Double desconto=valortotal*(pdesconto/100);

        Double vdesconto= valortotal-desconto;

        System.out.println(vdesconto);







        scanner.close();


    }
}
