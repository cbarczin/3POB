package fase06.L6Exercicio03.dominio;

public class Elevador {
    private int andarAtual;
    private int totalAndares;

    public Elevador(int andarAtual, int totalAndares) {
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public void subir() {
        if(andarAtual < totalAndares) {
            System.out.println("Subindo...");
            andarAtual++;
        } else {
            System.out.println("Você já está no último andar!");;
        }
    }

    public void descer() {
        if(andarAtual > 0) {
            System.out.println("Descendo...");
            andarAtual--;
        } else {
            System.out.println("Você já está no térreo");;
        }
    }

    public void exibirAndar() {
        System.out.println("O andar atual é: " + andarAtual);
    }
}
