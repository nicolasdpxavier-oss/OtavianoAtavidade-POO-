public class Cofre {

    private int senha;
    private boolean estadoAberto = false;
    private boolean bloqueio = false;
    private int contador = 0;
    private String item;

    public Cofre(int senha) {
        this.senha = senha;
    }

    // Guarda um item somente se o cofre estiver aberto
    public void guardarItem(String item) {
        if (estadoAberto == true) {
            this.item = item;
        }
    }

    // Tranca o cofre se estiver aberto
    public void trancar() {
        if (estadoAberto == true) {
            this.estadoAberto = false;
        }
    }

    // Destranca o cofre e controla as tentativas de senha
    public void destrancar(int senhaDigitada) {
        if (estadoAberto == false && bloqueio == false) {
            if (senha == senhaDigitada) {
                this.estadoAberto = true;
                this.contador = 0;
            } else {
                this.contador++;

                if (contador == 3) {
                    this.bloqueio = true;
                }
            }
        }
    }

    // Visualiza o item se o cofre estiver aberto
    public String visualizarItem() {
        if (estadoAberto == true) {
            return this.item;
        } else {
            return "O cofre está fechado.";
        }
    }

    // Retira o item se o cofre estiver aberto
    public String retirarItem() {
        if (estadoAberto == true) {
            String itemRetirado = this.item;
            this.item = null;
            return itemRetirado;
        } else {
            return "Não é possível retirar: o cofre está fechado.";
        }
    }

    // Consultas de estado para os testes
    public boolean isEstadoAberto() {
        return estadoAberto;
    }

    public boolean isBloqueio() {
        return bloqueio;
    }

    public int getContador() {
        return contador;
    }
}

