public class Aluno extends Pessoa {

    public Aluno(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public String getTipo() {
        return "Aluno";
    }
}
