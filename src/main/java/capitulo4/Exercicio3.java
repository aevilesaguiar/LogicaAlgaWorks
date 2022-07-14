package capitulo4;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        /*Faça um programa que receba:
        *O valor da conta de luz
        * Conta de água
        * Conta de telefone
        * Escola do filho
        * Fatura do cartão
        * Gastos com supermercado
        * ... e mostre o gasto total que a família teve no mês. Não esqueça de usar muito o operador "+=".*/

        Scanner scanner= new Scanner(System.in);

        Double conta=0.00;

        System.out.print("O valor da conta de luz: R$");
        conta+=scanner.nextDouble();
        System.out.print("O valor da Conta de água: R$");
        conta+=scanner.nextDouble();
        System.out.print("O valor da Conta de telefone: R$");
        conta+=scanner.nextDouble();
        System.out.print("O valor da Escola do filho: R$");
        conta+=scanner.nextDouble();
        System.out.print("O valor da Fatura do cartão: R$");
        conta+=scanner.nextDouble();
        System.out.print("O valor dos Gastos com supermercado: R$");
        conta+=scanner.nextDouble();

        System.out.print("Total de contas do mês: R$ "+conta);

        scanner.close();

    }
}
