package projeto.src.dominio;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private String sexo;

public Pessoa(String nome, int idade, double altura, double peso, String sexo) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
    this.peso = peso;
    this.sexo = sexo;
    }

public String getNome() {
    return nome;
}

public int getIdade() {
    return idade;
}

public double getAltura() {
    return altura;
}

public double getPeso() {
    return peso;
}

public String getSexo() {
    return sexo;
}

public void setNome(String nome) {
    this.nome = nome;
}

public void setIdade(int idade) {
    this.idade = idade;
}

public void setAltura(double altura) {
    this.altura = altura;
}

public void setPeso(double peso) {
    this.peso = peso;
}

public void setSexo(String sexo) {
    this.sexo = sexo;
}

public void listarPessoas() {
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("Altura: " + altura);
    System.out.println("Peso: " + peso);
    System.out.println("Sexo: " + sexo);
    }
}

