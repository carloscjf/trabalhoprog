public class Emprestimo {
    private Pessoa pessoa;
    private Livro livro;
    private String data;

    public Emprestimo(Pessoa pessoa, Livro livro, String data) {
        this.pessoa = pessoa;
        this.livro = livro;
        this.data = data;
    }

    @Override
    public String toString() {
        return pessoa.getNome() + " pegou \"" + livro.toString() + "\" em " + data;
    }
}
