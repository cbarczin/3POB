package projeto02.dominio;

public class Pessoa {
    private String nome;
    private float altura;
    private float peso;
    private int idade;
    private String genero;


public Pessoa(String nome, float altura, float peso, int idade, String genero) {
    this.nome = nome;
    this.altura = altura;
    this.peso = peso;
    this.idade = idade;
    this.genero = genero;
}


public String getNome() {
    return nome;
}


public float getAltura() {
    return altura;
}


public float getPeso() {
    return peso;
}


public int getIdade() {
    return idade;
}


public String getGenero() {
    return genero;
}


public void setNome(String nome) {
    this.nome = nome;
}


public void setAltura(float altura) {
    this.altura = altura;
}


public void setPeso(float peso) {
    this.peso = peso;
}


public void setIdade(int idade) {
    this.idade = idade;
}


public void setGenero(String genero) {
    this.genero = genero;
}

public void CalcularIMC() {
    float calc = peso/(altura*altura);

    if(calc < 18.5) {
        System.out.println(nome + ", voce esta abaixo do peso! :(");
    } else {
        if((calc >= 18.5) && (calc <= 24.9)) {
            System.out.println(nome + ", voce esta no peso ideal! :)");
        } else {
            if((calc >= 25 ) && (calc <= 29.9)) {
                System.out.println(nome + ", voce esta com sobrepso! :'(");
            } else {
                if((calc >= 30) && (calc <=34.9)) {
                    System.out.println(nome + ", voce esta com obesidade classe I! CUide-se! :(");
                } else {
                    if((calc >= 35) && (calc <= 39.9)) {
                        System.out.println(nome + ", voce esta com obesidade classe II. Cuide-se muito! :((");
                    }
                }
            }
        }
    }
}


}
