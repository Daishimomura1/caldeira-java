package exercicios.aula4.exercicio2;

public class Circulo extends FigurasGeometricas {
    private final double raio;
    public Circulo (double raio) {
        this.raio = raio;
    }
    @Override
    public void CalcularArea () {
        System.out.println(Math.PI * Math.pow(raio, 2));
    }
}
