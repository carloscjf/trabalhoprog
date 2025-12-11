public class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getTipo() {
        return "Pessoa";
    }

    public String getNome() { return nome; }

    @Override
    public String toString() {
        return getTipo() + ": " + nome + " | CPF: " + cpf;
    }
}
