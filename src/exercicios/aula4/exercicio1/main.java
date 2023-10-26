package exercicios.aula4.exercicio1;

public class main {
    public static void main(String[] args) {
        Carro carro = new Carro ("pedra", "4 rodas", 2003);
        Moto moto = new Moto("batata", "7 rodas", 2033);

        carro.setDistancia(10000);
        moto.setDistancia(45000);

        System.out.println("Custo do carro " + carro.CalcularCustoDeViagem());
        System.out.println("Custo da moto " + moto.CalcularCustoDeViagem());
    }
}
