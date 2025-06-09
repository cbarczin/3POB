package fase06.ExercInterfaces.Exerc1;

public class CartaoCredito implements Pagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento com cartão de crédito realizado no valor de R$" + valor);
    }
}
