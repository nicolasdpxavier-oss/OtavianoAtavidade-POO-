
public class Aluno {

    private int matricula;
    private String nome;
    private double mediaFinal;

    public Aluno(int matricula, String nome, double mediaFinal) {
        this.matricula = matricula;
        this.nome = nome;
        this.mediaFinal = (mediaFinal >= 0 && mediaFinal <= 10)
                ? mediaFinal : 0;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public boolean verificarAprovacao() {
        return mediaFinal >= 6;
    }
}
