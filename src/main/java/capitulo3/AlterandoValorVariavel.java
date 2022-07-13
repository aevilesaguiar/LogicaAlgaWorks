package capitulo3;

import java.util.Scanner;

public class AlterandoValorVariavel {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        /*receber do usuario: valor produto e tipo de pagamento a vista ou a prazo. A vista sem juros, a prazo 10%*/

        System.out.print("Informe o valor do produto: R$ ");

        Double vProduto= scanner.nextDouble();

        System.out.print("Qual o tipo de Pagamento: 1 -a vista  ou 2 - prazo");

        Integer tpag = scanner.nextInt();

        if(tpag==1){
            System.out.println("Pagamento a vista sem juros! \nTotal a pagar: R$ "+vProduto);
        }else if (tpag==2) {

            Double total=(vProduto*0.10)+vProduto;
            System.out.println("Pagamento a Prazo juros de 10%! \nTotal a pagar: R$ "+total);

        }

        scanner.close();


    }
}
