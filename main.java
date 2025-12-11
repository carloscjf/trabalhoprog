public class Main {
    public static void main(String[] args) {

        // Pessoas
        Pessoa aluno1 = new Aluno("Igor", "123");
        Pessoa aluno2 = new Aluno("Maria", "456");
        Pessoa prof1 = new Professor("Dr. Paulo", "789");

        // Autores
        Autor autor1 = new Autor("Machado de Assis");
        Autor autor2 = new Autor("J. K. Rowling");

        // Livros
        Livro l1 = new Livro("Dom Casmurro", autor1, "Editora Alfa");
        Livro l2 = new Livro("Harry Potter", autor2, "Rocco");

        // Biblioteca (agregação)
        Biblioteca bib = new Biblioteca();
        bib.adicionarLivro(l1);
        bib.adicionarLivro(l2);

        // Empréstimos (classe associativa)
        Emprestimo e1 = new Emprestimo(aluno1, l1, "10/10/2025");
        Emprestimo e2 = new Emprestimo(prof1, l2, "12/10/2025");

        // Mostrar resultados
        System.out.println("=== LIVROS CADASTRADOS ===");
        bib.listarLivros();

        System.out.println("\n=== EMPRÉSTIMOS ===");
        System.out.println(e1);
        System.out.println(e2);
    }
}
