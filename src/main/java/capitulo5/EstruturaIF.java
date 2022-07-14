package capitulo5;

public class EstruturaIF {
    public static void main(String[] args) {

        Double emprestimo=4000.00;

        Double movimentacaoMedia=2000.00;


        Boolean movimentaPeloMenosMetadeDoValor=(movimentacaoMedia*2)>=emprestimo;

        Boolean aContaTemTempoDeAberturaSuficiente=true;

        Boolean aContaTemNomeLimpo=true;

        Boolean liberarEmprestimo=movimentaPeloMenosMetadeDoValor && aContaTemNomeLimpo&&aContaTemNomeLimpo&&
                aContaTemTempoDeAberturaSuficiente;

        if ((movimentacaoMedia*2)>emprestimo){
            System.out.println("Pode liberar Emprestimo");
        }else{
            System.out.println("Não Pode liberar Emprestimo ");
        }





    }
}
