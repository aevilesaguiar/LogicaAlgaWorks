package capitulo4;

public class OperadoresLogicos {
    public static void main(String[] args) {


                Boolean carrinhoMaiorQue100=false;
                Boolean periodoPromocao=true;

                Boolean aplicarDesconto=carrinhoMaiorQue100 && periodoPromocao;

                if(aplicarDesconto){
                    System.out.println("Sim! Aplique o desconto. ");
                }else {
                    System.out.println("Não Aplique o desconto. ");
                }



    }
}
