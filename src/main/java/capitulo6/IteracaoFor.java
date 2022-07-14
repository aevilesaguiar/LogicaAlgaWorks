package capitulo6;

public class IteracaoFor {
    public static void main(String[] args) {

/*

        for (int i = 0; i <5 ; i++) {
            System.out.println("Uma frase Qualquer: "+(i+1));
        }


        Double []  carrinhoDeCompras= new Double[]{50.00,30.00,150.00};

        Double total=0.00;

        for (int i = 0; i < carrinhoDeCompras.length ; i++) {

            System.out.println("Iteração "+(i+1) +", total: "+total);
            total+=carrinhoDeCompras[i];
        }

        System.out.println(total);



        for (int i = 0; i <10 ; i++) {
            if(i== 2){
                System.out.println("Vai parar");
                break;
            }

            System.out.println("Iteração: "+i);
        }

           for (int i = 0; i <10 ; i++) {
            if(i== 4){
                System.out.println("Vai continuar");
                continue;
            }

            System.out.println("Iteração: "+i);
        }


*/
        Integer[] produtos = new Integer[] { 100,125,300,600};


        for (int i = 0; i < produtos.length ; i++) {

            Integer produto= produtos[i];
            System.out.println("Produto de codigo: "+produto);

            if(produto.equals(100)){
                System.out.println("Produto Encontrado!");
                break;
           }
        }


    }
}
