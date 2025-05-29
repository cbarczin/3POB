package fase06.ExercHeranca.Exerc2.dominio;

public class Carro extends Veiculo {
    private int qntdPortas;
    
    public Carro(String marca, String modelo, int ano, int qntdPortas) {
        super(marca, modelo, ano);
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
        System.out.println("---------------");
        System.out.println("Dados do carro: ");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Quantidade de portas: " + qntdPortas);
    }
}
