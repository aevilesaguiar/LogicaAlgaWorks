package capitulo2;

import java.util.Scanner;

public class CalcularValorTroco {
    public static void main(String[] args) {



        Scanner scanner= new Scanner(System.in);
        System.out.println("Informe o Valor Produto:");
        Double valorProduto=scanner.nextDouble();

        System.out.println("Qual o valor Recebido: ");
        Double pagamento= scanner.nextDouble();


        Double troco=pagamento-valorProduto;

        System.out.println("O troco será: R$ "+ troco);


        scanner.close();

    }
}
