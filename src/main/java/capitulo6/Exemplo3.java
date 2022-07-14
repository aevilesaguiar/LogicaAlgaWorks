package capitulo6;

public class Exemplo3 {
    public static void main(String[] args) {

        Double [] notas= new Double[]{10.0,5.0,8.0,7.00};

        Double soma=0.00;

        for (int i = 0; i < notas.length ; i++) {

            soma+=notas[i];
            System.out.println(notas[i]);
            System.out.println("Média Notas: "+(soma/ notas.length));

        }

    }
}
