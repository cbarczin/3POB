package AtvAula.CadastroVeiculo.model;

public class Carro extends Veiculo {
    public int qntdPortas;

    public Carro(String placa, String modelo, int ano, int qntdPortas) {
            super(placa, modelo, ano);
            this.qntdPortas = qntdPortas;
    }

    public int getQntdPortas() {
        return qntdPortas;
    }

    public void setQntdPortas(int qntdPortas) {
        this.qntdPortas = qntdPortas;
    }

    @Override
    public void exibirDados() {
        System.out.println("Carro - Modelo: " + modelo + " | Placa: " + placa + " | Ano: " + ano + " | Quantidade de portas: " + qntdPortas);
    }

}
