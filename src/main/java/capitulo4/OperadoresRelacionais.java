package capitulo4;

public class OperadoresRelacionais {
    public static void main(String[] args) {

        Boolean number=3>2;
        System.out.println("3>2 ?"+number);

        Boolean number01=3<2 && 5>9;
        System.out.println("3<2 && 5>9 ?"+number01);

        Boolean number02=3>2 || 5>9;
        System.out.println("3>2 || 5>9 ?"+number02);

        Boolean number03=3<2 != 3<2;
        System.out.println("3<2 != 3<2 ?"+number03);

        System.out.println(number03.equals(number01));


    }
}
