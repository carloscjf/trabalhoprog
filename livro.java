public class Livro {

    // Associação simples
    private Autor autor;

    // Composição
    private Editora editora;

    private String titulo;

    public Livro(String titulo, Autor autor, String editoraNome) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = new Editora(editoraNome);
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + " | " + autor + " | Editora: " + editora;
    }
}
