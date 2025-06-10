package AtvAula.CadastroVeiculo.dominio;

public class Moto extends Veiculo {
    public int cilindradas;

    public Moto(String placa, String modelo, int ano, int cilindradas) {
        super(placa, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDados() {
        System.out.println("Moto - Modelo: " + modelo + " | Placa: " + placa + " | Ano: " + ano + " | Cilindradas: " + cilindradas);
    }

}
