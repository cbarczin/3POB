package fase06.ExercHeranca.Exerc5.dominio;

public abstract class Veiculo {
    public String marca;
    public int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this. ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirDados() {
        System.out.println("Marca do carro: " + marca);
        System.out.println("Ano do carro: " + ano);
    }
}
