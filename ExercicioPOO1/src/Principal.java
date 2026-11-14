import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.inicializar("Exemplo", 20, "00000000000");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("cpf: " + pessoa.getCpf());
    }

}
