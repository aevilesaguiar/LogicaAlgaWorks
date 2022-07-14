package capitulo4;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        Integer adicao=1+1;
        System.out.println(adicao);

        Integer subtracao=2-1;
        System.out.println(subtracao);

        Integer multiplicacao=2*1;
        System.out.println(multiplicacao);

        Double divisao = 3.0/2;
        System.out.println(divisao);

        Integer modulo= 5%2;
        System.out.println(modulo);

        Integer precedencia01=1+1*5;
        System.out.println(precedencia01);

        Integer precedencia02=(1+1)*5;
        System.out.println(precedencia02);

        Integer precedencia03=5/(1+1);
        System.out.println(precedencia03);

        Integer precedencia04=5/1+1;
        System.out.println(precedencia04);

        Double precedencia05=5.0* 1+1 /3;
        System.out.println(precedencia05);

        Double precedencia06=(5.0* 1)+(1 /3)+20;
        System.out.println(precedencia06);

    }


}
