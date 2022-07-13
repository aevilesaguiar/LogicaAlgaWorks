package capitulo3;

import java.util.Scanner;

public class TipoString {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Informe seu sobrenome: ");
        String sobrenome= scanner.nextLine();

        System.out.println("Olá, "+nome+ " "+sobrenome+ " !");

        Character variavelChar = 'A';

        scanner.close();


    }
}
