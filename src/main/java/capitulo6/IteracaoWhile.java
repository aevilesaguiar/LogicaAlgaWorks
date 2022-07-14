package capitulo6;

public class IteracaoWhile {
    public static void main(String[] args) {
/*
        for (int i = 0; i <5 ; i++) {
            System.out.println("Um texto qualquer: "+(i+1));
        }

        int i=0;
        while (i<5){
            System.out.println("Um texto qualquer while: "+(i+1));
            i++;
        }
        int i=0;
        while (i<10){

            if(i==5){
                System.out.println("vai parar");
                break;
            }
            System.out.println("Um texto qualquer while: "+(i+1));
            i++;
        }*/

        int i=0;
        while (i<10){

            if(i==5){
                System.out.println("vai continuar");
                i++;
                continue;
            }
            System.out.println("Um texto qualquer while");
            i++;
        }


    }
}
