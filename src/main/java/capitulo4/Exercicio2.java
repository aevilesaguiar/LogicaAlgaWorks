package capitulo4;

import java.util.Scanner;

public class Exercicio2 {

    final static Double VALOR_FRETE=15.00;
    public static void main(String[] args) {

        /*Crie um programa que receba o valor de um produto e exiba o valor final da compra.
        * Esse valor final será o valor do produto mais o valor do frete - use o valor do frete como R$15,00.
        * Uma compra de, por exemplo, R$80,00, teria um valor final de R$95,00.
        * Agora, caso a compra seja maior ou igual a R$100,00, então não cobre o frete.*/

        Scanner scanner=new Scanner(System.in);

        System.out.print("Digite o valor do produto: R$ ");
        Double valorProduto=scanner.nextDouble();

        Double valorPagar=0.00;

        if(valorProduto>=100){
            valorPagar=valorProduto;

        }else{
            valorPagar=valorProduto+VALOR_FRETE;
        }

        System.out.print("Valor Total para pagamento: R$ "+ valorPagar);

        scanner.close();




    }
}
