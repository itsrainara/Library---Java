public class LivroFisico extends Livro {

    private int isbn;
    private String titulo;
    private String autor;
    private String genero;
    private String editora;
    private String anoPublicacao;
    private String numeroPaginas;
    private String conteudo = "Conteúdo do livro";

    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    public String getAnoPublicacao() {
        return anoPublicacao;
    }
    public void setAnoPublicacao(String anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    public String getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(String numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    public double calcularFrete(double km, double valorKm){
        return km * valorKm;
    }
    public int calcularFrete(int km, int valorKm) {
        return km * valorKm;
    }
    @Override
    public String exibirConteudo() {
        return this.conteudo;
    }
}
