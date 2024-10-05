import java.util.HashMap;

public class BibliotecaMunicipal extends Biblioteca {
    private HashMap<Integer, LivroFisico> listaLivros = new HashMap<Integer, LivroFisico>();
    private HashMap<Integer, Integer> getListaLivrosEmprestados = new HashMap<Integer, Integer>();
    @Override
    public void adicionarLivro(Livro livro) {
    }
    public boolean adicionarLivro(LivroFisico livro) {
        this.listaLivros.put(livro.getIsbn(),livro);
        return true;
    }
    @Override
    public Livro pesquisarLivro(int isbn) {
        return this.listaLivros.get(isbn);
    }
    @Override
    public boolean removerLivro(int isbn) {
        if (this.listaLivros.remove(isbn) == null) {
            return false;
        } else {
            return true;
        }
    }
    public void emprestarLivro(LivroFisico livro, Aluno aluno) {
        this.getListaLivrosEmprestados.put(livro.getIsbn(),aluno.getId());
        aluno.setLivrosEmprestadosLista(livro.getIsbn(), livro);
    }
    public void devolverLivro (int isbn ) {
        this.getListaLivrosEmprestados.remove(isbn);
    }
}
