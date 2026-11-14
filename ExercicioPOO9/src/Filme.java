
public class Filme {

    private String titulo;
    private String diretor;
    private int anoLancamento;
    private int duracao;

    public Filme(String titulo, String diretor, int anoLancamento, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public void exibirInformacoes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Diretor: " + diretor);
        System.out.println("Ano de lancamento: " + anoLancamento);
        System.out.println("Duracao: " + duracao + " minutos");
    }
}

