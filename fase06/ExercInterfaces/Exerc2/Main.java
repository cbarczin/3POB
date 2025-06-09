package fase06.ExercInterfaces.Exerc2;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica retangulo = new Retangulo(2, 03);
        FormaGeometrica circulo = new Circulo(2);

        retangulo.calcularArea();
        retangulo.calcularPerimetro();

        circulo.calcularArea();
        circulo.calcularPerimetro();
    }
}
