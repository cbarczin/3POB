package AtvAula.CadastroVeiculo.model;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String placa, String modelo, int ano, int cilindradas) {
        super(placa, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDados() {
        System.out.println("Moto - Modelo: " + modelo + " | Placa: " + placa + " | Ano: " + ano + " | Cilindradas: " + cilindradas + "cc");
    }

}
