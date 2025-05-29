package fase06.ExercHeranca.Exerc3.dominio;

public class Gato extends Animal {
    public String mia;

    public Gato(String nome, int idade, String mia) {
        super(nome, idade);
        this.mia = mia;
    }

    public String getMia() {
        return mia;
    }

    public void setMia(String mia) {
        this.mia = mia;
    }

    @Override
    public void emitirSom() {
        System.out.println(mia);
    }

    public void exibirInfos() {
        System.out.println("---------------");
        System.out.println("O animal em questão é um: Gato!");
        System.out.println("O seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        emitirSom();
    }
}
