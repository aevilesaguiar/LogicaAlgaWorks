package capitulo3;

import java.util.Scanner;

public class TipoLogico {
    public static void main(String[] args) {

        Boolean varTrue = true;

        Boolean varFalse = false;

        System.out.println(varFalse);
        System.out.println(varTrue);

        System.out.println("------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a sua idade");
        Integer idade= scanner.nextInt();

        if(idade>=18){
            System.out.println("Pode tirar carta de motorista");
        }else {
            System.out.println("Não Pode tirar carta de motorista");
        }


    }
}
