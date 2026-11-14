
public class Funcionario {

    private String nome;
    private double salarioBase;
    private String cargo;

    public Funcionario(String nome, double salarioBase, String cargo) {
        this.nome = nome;
        this.salarioBase = salarioBase > 0 ? salarioBase : 0;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public String getCargo() {
        return cargo;
    }

    public double calcularSalarioLiquido() {
        return salarioBase - (salarioBase * 0.10);
    }
}

