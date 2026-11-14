public class Produto{
   private String nome;
   private double preco;
   private int quantidadeDisponivel;

   public void inicializar(String nome, double preco, int quantidadeDisponivel) {
       this.nome = nome;
       this.preco = preco;
       this.quantidadeDisponivel = quantidadeDisponivel;
   }
   public String getNome() {
       return nome;
   }
   public double getPreco() {
       return preco;
   }
   public int getQuantidadeDisponivel() {
       return quantidadeDisponivel;
   }
   public void setNome(String nome) {
       this.nome = nome;
   }
   public void setPreco(double preco) {
       this.preco = preco;
   }
    public void setQuantidadeDisponivel(int quantidadeDisponivel)    {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
}


