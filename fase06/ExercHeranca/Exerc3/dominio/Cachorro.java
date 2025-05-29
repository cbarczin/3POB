package fase06.ExercHeranca.Exerc3.dominio;

public class Cachorro extends Animal{
    public String late;

    public Cachorro(String nome, int idade, String late) {
        super(nome, idade);
        this.late = late;
    }

    public String getLate() {
        return late;
    }

    public void setLate(String late) {
        this.late = late;
    }

    @Override
    public void emitirSom() {
        System.out.println(late);
    }

    public void exibirInfos() {
        System.out.println("---------------");
        System.out.println("O animal em questão é um: Cachorro!");
        System.out.println("O seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        emitirSom();
    }
}
