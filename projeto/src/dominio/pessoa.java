package projeto.src.dominio;

public class pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private String sexo;

public pessoa(String nome, int idade, double altura, double peso, String sexo) {
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
    System.out.println(nome);
    System.out.println(idade);
    System.out.println(altura);
    System.out.println(peso);
    System.out.println(sexo);
}

    

   

}

