package exercicios.aula4.exercicio1;

public abstract class veiculos {
    private String marca;
    private String modelo;
    private int ano;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public veiculos(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public double CalcularCustoDeViagem() {
        return 0;
    }


}
