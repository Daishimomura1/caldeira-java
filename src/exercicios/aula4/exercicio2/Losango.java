package exercicios.aula4.exercicio2;

public class Losango extends FigurasGeometricas {
    private final double diagonal1;
    private final double diagonal2;
    public Losango (double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }
    @Override
    public void CalcularArea () {
        System.out.println( (diagonal1 * diagonal2) /2);
    }
}

