package capitulo3;

import jdk.swing.interop.SwingInterOpUtils;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Constantes {

    /*contante statica*/;
    static final Integer IDADE_MINIMA_TIRAR_CARTEIRA=18;

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        /*constante inclui a palavra final no inicio*/
        //final Integer IDADE_MINIMA=18;

        System.out.println("Informe a idade:  ");

        Integer idade=scanner.nextInt();

        Boolean pcarteira=idade>=IDADE_MINIMA_TIRAR_CARTEIRA;

        if(pcarteira){
            System.out.println("Pode tirar carteira");
        }else {
            System.out.println("Não pode tirar carteira");
        }

        scanner.close();

    }
}
