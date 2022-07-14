package capitulo7;


import java.util.Scanner;

public class Vetores1Dimnsao {
    public static void main(String[] args) {
        /*Cardápio de Comidas*/
        /*Escolha 1 opção*/

       /* String [] cadapio = new String[]{"Calabreza", "Quatro Queijos", "Catupiri", "Atum", "Presunto", "coxinha"};

        System.out.println("Escolha o sabor: ");

        for (int i = 0; i < cadapio.length ; i++) {
            System.out.println("["+ i + " ] "+cadapio[i]);
        }
        Scanner scanner=new Scanner(System.in);

        System.out.println("Digite o numero referente ao sabor: ");

        Integer saborEscolhido = scanner.nextInt();

        System.out.println("Sabor escolhido: " +cadapio[saborEscolhido]);

        scanner.close();



        String [] cadapio2 = new String[]{"Calabreza", "Quatro Queijos", "Catupiri", "Atum", "Presunto", "coxinha"};
//substituir variavel
        cadapio2[5]="Frango";
        cadapio2[1]="Banana com leite condensado";

        for (int i = 0; i < cadapio2.length ; i++) {

            System.out.println("[ "+i+" ]"+ cadapio2[i]);
        }

 */

        String[] cardapio3=new String[4];

        cardapio3[0]="calabresa";
        cardapio3[1]="frango";
        cardapio3[2]="banana";
        cardapio3[3]="morango";

        for (int i = 0; i < cardapio3.length ; i++) {
            System.out.println(cardapio3[i]);
        }





    }
}
