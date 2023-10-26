package exercicios.aula3.exercicio1;


import java.time.LocalTime;
class Conta {
    private String nome;
    private String cpf;
    private String identificadorConta;
    private String banco;
    private String endereco;
    private double saldo;
    private LocalTime horarioatual;

    public void saque(double valor) {
        if (valor<saldo) {
            saldo-=valor;
        } else { System.out.println("Saldo Insuficiente");}
    }

    public void deposito(double valor) {
        saldo+=valor;
    }
    public void pix(double valor, Conta destino) {
        if (valor<saldo) {
            saldo-=valor;
        } else { System.out.println("saldo insuficiente");}
    }

    public void tranferencia(double valor, Conta destino) {
        if (valor<saldo) {
            saldo-=valor;
        } else { System.out.println("saldo insuficiente");
        }
    }

    public void saldo() {
        System.out.println(this.saldo);
    }
    public void horarioatual() {
        System.out.println(this.horarioatual);
    }
    public void informacoes() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.saldo);
        System.out.println(this.banco);
        System.out.println(this.endereco);
        System.out.println(this.horarioatual);
        System.out.println(this.identificadorConta);
    }

}