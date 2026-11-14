
public class ContaBancaria {

    private int numero;
    private String titular;
    private double saldo;

    public ContaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito realizado!");
        } else {
            System.out.println("Valor invalido para deposito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saque nao permitido.");
        }
    }

    public boolean verificarSaldo(double valor) {
        return saldo >= valor;
    }
}

