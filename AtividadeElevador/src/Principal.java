
public class Principal {
    public static void main(String[] args) {
        int capacidade = 8;
        int totalAndares = 10;

        Elevador elevador = new Elevador();

        elevador.inicializar(capacidade, totalAndares);

        System.out.println("Capacidade do elevador: " + elevador.getCapacidade());
        System.out.println("Total de andares: " + elevador.getTotalAndares());
        System.out.println("Andar atual: " + elevador.getAndarAtual());
        System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes());

        // Testando entrada e saída de pessoas
        elevador.entrar();
        elevador.entrar();
        elevador.entrar();

        System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes());

        elevador.sair();

        System.out.println("Pessoas presentes: " + elevador.getPessoasPresentes());

        // Testando subida
        elevador.subir();
        elevador.subir();
        elevador.subir();

        System.out.println("Andar atual: " + elevador.getAndarAtual());

        // Testando descida até o térreo
        elevador.descer();
        elevador.descer();
        elevador.descer();
        elevador.descer();

        System.out.println("Andar atual: " + elevador.getAndarAtual());

        // Testando subida até o último andar
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();

        System.out.println("Andar atual: " + elevador.getAndarAtual());

        elevador.entrar();
        elevador.entrar();
        elevador.entrar();
        elevador.entrar();
        elevador.entrar();
        elevador.entrar();

        System.out.println("pessoas presentes: " + elevador.getPessoasPresentes());
    }
}
