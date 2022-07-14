package capitulo5;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class UtilizandoIfEncadeado {

    final static Double PESO_LEVE_LIMITE_MAX= 60.00;
    final static Double PESO_MEDIO_LIMITE_MAX= 90.00;
    final static Double PESO_PESADO_LIMITE_MAX= 91.00;



    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Digite o peso: ");
        Double peso=scanner.nextDouble();

        Boolean pesoLeve= peso<=PESO_LEVE_LIMITE_MAX;
        Boolean pesoMedio=peso<=PESO_MEDIO_LIMITE_MAX;
        Boolean pesopesado=peso>=PESO_PESADO_LIMITE_MAX;

        if (pesoLeve) {
            System.out.println("O lutador é peso Leve");
        } else if (pesoMedio) {
            System.out.println("O lutador é peso Medio");
        }else{
            System.out.println("O lutador é peso Pesado");
        }


        scanner.close();
    }
}
