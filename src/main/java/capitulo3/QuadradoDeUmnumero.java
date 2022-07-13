package capitulo3;

import java.util.Scanner;

public class QuadradoDeUmnumero {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Informe um numero: ");
        Double numero = scanner.nextDouble();

        Double quadrado=Math.pow(numero,2);
        System.out.println("O quadrado do numero é: "+quadrado);
        scanner.close();

    }
}
