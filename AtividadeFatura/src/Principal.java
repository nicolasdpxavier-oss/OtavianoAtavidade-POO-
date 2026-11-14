public class Principal {
    public static void main(String[] args) {
        Fatura fatura1 = new Fatura(101, "Manete", 2, 200.99);
        double valorTotal = fatura1.calcularValorFatura();
        System.out.println("Valor total de faturas: " + valorTotal);
    }
}


