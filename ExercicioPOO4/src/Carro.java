
public class Carro {

    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidadeAtual = 0;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void acelerar(double valor) {
        if (valor > 0) {
            velocidadeAtual += valor;
        }
    }

    public void frear(double valor) {
        if (valor > 0) {
            velocidadeAtual -= valor;

            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
        }
    }
}
