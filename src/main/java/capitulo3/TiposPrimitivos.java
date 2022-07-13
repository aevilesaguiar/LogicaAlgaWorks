package capitulo3;

public class TiposPrimitivos {
    public static void main(String[] args) {

        byte numeroByte = -128; //-128 ate 127, tem casos que o valor é ausente=null

        /*nenhum tipo além do byte primitivo, é o unico que aceita o null*/

        short numeroshort=32767; //-32768 ATÉ 32767

        int numeroInteger= 2147483647;//2147483648 ATÉ 2147483647

        long numeroLong=923372037000000000L;//-9,223372037X10 1n ATÉ 9,223372037X10 1n

        System.out.println(numeroByte);

        System.out.println(numeroshort);

        System.out.println(numeroInteger);

        System.out.println(numeroLong);

        /*Decimais*/

        float numeroFloat = 1.0f;

        double numeroDouble = 1.0;

        /*String não tem valor primitivo*/
    }
}
