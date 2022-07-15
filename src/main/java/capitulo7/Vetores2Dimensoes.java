package capitulo7;

public class Vetores2Dimensoes {
    public static void main(String[] args) {

        Double faturamentoDia=1000.00;

        Double[] faturamentoJaneiro = new Double[]{1500.00, 2000.00,17000.00};
        Double[] faturamentoFevereiro = new Double[]{1900.00, 2900.00,12000.00};


        Double[][] faturamentoAnual = new Double[][]{faturamentoJaneiro, faturamentoFevereiro};


       // System.out.println("Faturamento do dia 1 janeiro: "+faturamentoAnual[0][0]);


        for (int i = 0; i <faturamentoAnual.length ; i++) {

            System.out.println("Mês: "+ (i+1));

            //          Double[] mes= faturamentoAnual[i];  é a mesma coisa que utilizar  Double dia=faturamentoAnual[i][j];

            for (int j = 0; j <faturamentoAnual.length ; j++) {

                Double dia=faturamentoAnual[i][j];

                System.out.println("Dia "+(j+1)+" : "+dia);
            }

        }


    }
}
