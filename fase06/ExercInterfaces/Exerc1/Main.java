package fase06.ExercInterfaces.Exerc1;

public class Main {
    public static void main(String[] args) {
        Pagamento cartaoCredito = new CartaoCredito();
        Pagamento boletoBancario = new BoletoBancario();

        cartaoCredito.realizarPagamento(120.59);
        boletoBancario.realizarPagamento(25.99);
    }
}
