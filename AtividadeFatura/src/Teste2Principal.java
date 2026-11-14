public class Teste2Principal {
    public static void main(String[] args) {
        Fatura fatura2 = new Fatura(103,"Teclado", -5, 150.00);
        double valorTotal = fatura2.calcularValorFatura();
        System.out.println("Valor total da fatura: " + valorTotal);
    }
}
