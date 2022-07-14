package capitulo4;

import java.util.Scanner;

public class Exercicio4REV1 {

    final static Integer IDADE_MINIMA_APOSENTAR=55;

    final static Integer QUANTIDADE_DE_TEMPO_CONTRIBUIDO_MINIMO=25;

    public static void main(String[] args) {


        /*
         * Crie um programa que receba a idade de uma pessoa e a quantidade de tempo que essa pessoa contribuiu
         * com a previdência, depois verifique se ela pode aposentar ou não.
         * Nas regras desse programa a pessoa vai precisar ter, pelo menos, 55 anos e ter contribuído com, pelo menos,
         * 25 anos. Se ela passar nessas duas condições, então mostre pra ela uma mensagem dizendo que ela pode aposentar.*/

        Scanner scanner=new Scanner(System.in);

        System.out.println("Informe a sua Idade: ");
        Integer idade = scanner.nextInt();

        System.out.println("Quantidade de meses anos que contribui: ");
        Integer tempoContribuicao = scanner.nextInt();

        Boolean temIdadeApposentar= idade >= IDADE_MINIMA_APOSENTAR;

        Boolean tempoDeContribuicao= tempoContribuicao>=QUANTIDADE_DE_TEMPO_CONTRIBUIDO_MINIMO;

        Boolean podeAposentar=temIdadeApposentar && tempoDeContribuicao;

        if(podeAposentar){
            System.out.println("Pode Aposentar");
        }else{
            System.out.println("Não Pode Aposentar");
        }

        scanner.close();

    }
}
