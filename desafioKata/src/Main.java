import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n=== TESTE DE SEGURANÇA ===");

        Cofre cofreTeste = new Cofre(5678);

        cofreTeste.destrancar(1111);
        cofreTeste.destrancar(2222);
        cofreTeste.destrancar(3333);

        System.out.println("Tentativas incorretas: " + cofreTeste.getContador());
        System.out.println("Cofre bloqueado: " + cofreTeste.isBloqueio());

// Mesmo com a senha correta, não deve abrir
        cofreTeste.destrancar(5678);

        System.out.println("Cofre aberto: " + cofreTeste.isEstadoAberto());
    }

}