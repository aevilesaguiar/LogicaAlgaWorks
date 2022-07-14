package capitulo4;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        /*
        * Para criar uma calculadora simples você vai precisar receber três informações pelo console. São os dois
        * números que participarão da operação e também a operação que será realizada.
        * Você vai receber o primeiro número, depois vai receber qual é a operação e, por último, o segundo número.
        * Para os números que você vai receber pelo console, pode utilizar a mesma funcionalidade que já utilizamos aqui
        * no curso - o *Scanner*. Para receber a operação você pode receber também um número que vai indicar a mesma.
        * Por exemplo, o número 1 será adição, o 2 subtração, o 3 multiplicação e o 4 divisão.
        * Com esses três valores - os dois números e qual será a operação - você pode utilizar a estrutura de decisão if
        *  para só realizar a operação que o usuário escolheu. Se estiver com dúvidas, então volte a aula onde falamos
        * sobre alteração do valor de uma variável - aula 3.10.*/

        Double total;

        Scanner scanner= new Scanner(System.in);

        System.out.print("Digite um numero:");
        Double number01=scanner.nextDouble();


        System.out.print("Informe a operação: 1- Adicao  2-Subtracao 3-Divisao  4-multiplicação  5-Modulo ");
        Integer operacao=scanner.nextInt();


        System.out.print("Digite um numero:");
        Double number02=scanner.nextDouble();

        if(operacao==1){
           total= number01+number02;
            System.out.println(number01+" + "+number02+" = "+total);
        }else if (operacao==2){
            total= number01-number02;
            System.out.println(number01+" - "+number02+" = "+total);
        }else if (operacao==3){
            total= number01/number02;
            System.out.println(number01+" / "+number02+" = "+total);
        }else if (operacao==4){
            total= number01*number02;
            System.out.println(number01+" X "+number02+" = "+total);
        }else if (operacao==5){
            total= number01%number02;
            System.out.println(number01+" % "+number02+" = "+total);
        }

    scanner.close();













    }



}
