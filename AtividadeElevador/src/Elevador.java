public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

public void inicializar(int capacidade, int totalAndares) {
    this.capacidade = capacidade;
    this.totalAndares = totalAndares;
    this.andarAtual = 0;
    this.pessoasPresentes = 0;
}
public void entrar() {
    if(this.pessoasPresentes < this.capacidade) {
        this.pessoasPresentes += 1;
    }

}
public void sair(){
    if(this.pessoasPresentes > 0) {
        this.pessoasPresentes -= 1;
    }
}
public void subir() {
    if (andarAtual < this.totalAndares) {
        this.andarAtual += 1;
        }
}
public void descer() {
    if(andarAtual > 0) {
        this.andarAtual -= 1;
    }
}
public int getAndarAtual() {
    return andarAtual;
}
public void setAndarAtual(int novoAndar) {
   this.andarAtual = novoAndar;
}
public int getTotalAndares() {
    return totalAndares;
}
public void setTotalAndares(int novototal) {
    this.totalAndares = novototal;
}
public int getCapacidade() {
    return capacidade;
}
public void setCapacidade(int novacapacidade) {
    this.capacidade = novacapacidade;
}
public int getPessoasPresentes() {
    return pessoasPresentes;
}
public void setPessoasPresentes(int novopessoasPresentes) {
    this.pessoasPresentes = novopessoasPresentes;
}

}



