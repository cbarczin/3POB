package fase06.ExercExcecoes.Exer3.exception;

public class ValorInvalidoException extends Exception {
    public ValorInvalidoException(String mensagem) {
        super(mensagem);
    }

    @Override
    public String toString() {
        return "ValorInvalidoException []";
    }
}
