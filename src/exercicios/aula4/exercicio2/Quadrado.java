package exercicios.aula4.exercicio2;

public class Quadrado extends FigurasGeometricas {
    private final double lado;
    public Quadrado (double lado) {
        this.lado = lado;
    }
    @Override
    public void CalcularArea () {
        System.out.println( Math.pow(lado,2));
    }
}

