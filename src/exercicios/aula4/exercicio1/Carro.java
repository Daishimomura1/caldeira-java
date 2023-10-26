package exercicios.aula4.exercicio1;

public class Carro extends veiculos{

    private double Distancia;
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    public void setDistancia(double distancia) {
        Distancia = distancia;
    }

    @Override
    public double CalcularCustoDeViagem() {
        return Distancia * 0.20;
    }
}
