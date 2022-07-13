package capitulo2;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("***********Calculo IMC****************");

        System.out.println("Informe o peso:");
        Double peso= scanner.nextDouble();
        System.out.println("Informe o altura:");
        Double altura= scanner.nextDouble();

        Double imc=peso/(altura*altura);

        System.out.println("IMC: "+ imc);

        scanner.close();


    }
}
