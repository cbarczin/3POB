package fase06.ExercHeranca.Exerc5.dominio;

public class Moto extends Veiculo{
    public boolean temPartidaEletrica;

    public Moto(String marca, int ano, boolean temPartidaEletrica) {
        super(marca, ano);
        this.temPartidaEletrica = temPartidaEletrica;
    }

    public boolean isTemPartidaEletrica() {
        return temPartidaEletrica;
    }

    public void setTemPartidaEletrica(boolean temPartidaEletrica) {
        this.temPartidaEletrica = temPartidaEletrica;
    }

    @Override
    public void exibirDados() {
    System.out.println("\n--------Dados da moto--------");
    System.out.println("Marca da moto: " + marca);
    System.out.println("Ano da moto: " + ano);
    System.out.println("Tem partida elétrica?: " + (temPartidaEletrica ? "Sim": "Não"));
    System.out.println("------------------------------");
    }
}
