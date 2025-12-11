import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro l) {
        livros.add(l);
    }

    public void listarLivros() {
        for (Livro l : livros) {
            System.out.println(l);
        }
    }
}
