package exercicios.aula3.exercicio1;


import exercicios.aula3.exercicio1.Conta;

public class main {
    public static void Main(String[] args) {
        Conta conta = new Conta();
        conta.deposito (1000);
        conta.saque(500);
        conta.saldo();
    }
}