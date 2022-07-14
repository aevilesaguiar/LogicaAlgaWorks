package capitulo5;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        /**
         * Pense em uma empresa fictícia que todo o mês de Janeiro premia seus funcionários com um bônus, caso a meta
         * seja alcançada.
         *
         * Crie um programa que receba 3 parâmetros. O primeiro será a meta de faturamento anual da empresa para o ano
         * que passou.
         * Depois, receba o parâmetro referente ao faturamento real da empresa no ultimo ano.
         * Por último, receba a média salarial do funcionário(a) para o ano anterior (não precisa fazer cálculo de média salarial,
         * já que estamos trabalhando com um algoritmo fictício - na hora de informar esse parâmetro, invente um valor
         * qualquer para representar essa média salarial).
         *
         * Nessa empresa fictícia, se o faturamento real for igual ou maior que a meta de faturamento anual, então os
         * funcionários ganharam um bônus que será igual a média salarial deles no último ano.
         * Caso o faturamento seja menor que a meta, mas, seja maior ou igual a 80% do valor da meta, então eles receberão
         * também 80% de sua média salarial.
         *
         * No final, mostre de quanto será o prêmio desse funcionário(a).*/

        Scanner scanner=new Scanner(System.in);

        System.out.println("Informe a meta de faturamento anual da empresa do ano passado: ");
        Double metaFaturametoAnualEmpresaAnoPassado= scanner.nextDouble();

        System.out.println("Informe O faturamento real anual da empresa: ");
        Double faturametoRealAnualEmpresa= scanner.nextDouble();

        System.out.println("Media Salarial do Funcionário: ");
        Double mediaSalarial= scanner.nextDouble();

        Double bonus=0.00;

        if (faturametoRealAnualEmpresa >=metaFaturametoAnualEmpresaAnoPassado) {

            bonus= mediaSalarial;
            System.out.println("Bonus de 100% ");

        }else if(faturametoRealAnualEmpresa<metaFaturametoAnualEmpresaAnoPassado &&
                (faturametoRealAnualEmpresa>=((80/100)*metaFaturametoAnualEmpresaAnoPassado))){
            bonus= mediaSalarial*0.80;
            System.out.println("Bonus de 80% ");
        }


        System.out.println("O premio do funcionário será R$ "+bonus);





        scanner.close();



    }
}
