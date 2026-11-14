public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public void inicializar(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setNome(String nome){
        if (!nome.trim().isEmpty()){
            this.nome = nome;
        }
    }
    public void setIdade(int idade){
        if(idade >= 0){
            this.idade = idade;
        }
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
        if( cpf.length() == 11){
            this.cpf = cpf;
        }
    }
}
