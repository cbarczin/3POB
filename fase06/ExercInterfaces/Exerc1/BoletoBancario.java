package fase06.ExercInterfaces.Exerc1;

//import fase06.ExercInterfaces.Exerc1.*;

public class BoletoBancario implements Pagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento com boleto bancário realizado no valor de R$" + valor);
    }
}
