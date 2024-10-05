public abstract class Biblioteca {
    public abstract void adicionarLivro(Livro livro);
    public abstract Livro pesquisarLivro(int isbn);
    public abstract boolean removerLivro(int isbn);
}
