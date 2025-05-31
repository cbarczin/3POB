package fase06.ExercHeranca.Exerc5.dominio;

public class Carro extends Veiculo{
    public int numeroDePortas;
    

    public Carro(String marca, int ano, int numeroDePortas) {
        super(marca, ano);
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void exibirDados() {
    System.out.println("\n--------Dados do carro--------");
    System.out.println("Marca do carro: " + marca);
    System.out.println("Ano do carro: " + ano);
    System.out.println("Quantidade de portas: " + numeroDePortas);
    System.out.println("------------------------------");
    }

}
