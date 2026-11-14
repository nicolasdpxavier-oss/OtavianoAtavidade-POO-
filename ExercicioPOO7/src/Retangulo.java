
public class Retangulo {

    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura > 0 ? largura : 1;
        this.altura = altura > 0 ? altura : 1;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setLargura(double largura) {
        if (largura > 0) {
            this.largura = largura;
        }
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}

