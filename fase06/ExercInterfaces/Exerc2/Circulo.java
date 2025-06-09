package fase06.ExercInterfaces.Exerc2;

public class Circulo implements FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 3.14*(raio*raio);
    }

    public double calcularPerimetro() {
        return 2*3.14*raio;
    }
}
