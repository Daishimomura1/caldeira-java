package exercicios.aula4.exercicio2;

public class Triangulo extends FigurasGeometricas {
    private final double base;
    private final double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void CalcularArea() {
        System.out.println((base * altura) / 2);
    }
}