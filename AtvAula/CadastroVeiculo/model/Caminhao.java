package AtvAula.CadastroVeiculo.model;

public class Caminhao extends Veiculo {
    public double capacidadeCarga;

    public Caminhao(String placa, String modelo, int ano, double capacidadeCarga) {
        super(placa, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void exibirDados() {
        System.out.println("Caminhao - Modelo: " + modelo + " | Placa: " + placa + " | Ano: " + ano + " | Capacidade de carga: " + capacidadeCarga);
    }
}
