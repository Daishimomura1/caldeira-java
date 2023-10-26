package exercicios.aula4.exercicio1;

public class Moto extends veiculos{

    private double distancia;

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public double CalcularCustoDeViagem() {
        return distancia * 0.15;
    }

}