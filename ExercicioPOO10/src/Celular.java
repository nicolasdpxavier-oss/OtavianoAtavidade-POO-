
public class Celular {

    private String marca;
    private String modelo;
    private double preco;
    private int armazenamento;

    public Celular(String marca, String modelo, double preco, int armazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco > 0 ? preco : 0;
        this.armazenamento = armazenamento > 0 ? armazenamento : 0;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void exibirResumo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Preco: R$ " + preco);
        System.out.println("Armazenamento: " + armazenamento + " GB");
    }
}
