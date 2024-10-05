import java.util.HashMap;

public class Aluno extends Usuario {
    private int id;
    private String nome;
    private String email;
    private HashMap<Integer, LivroFisico> listaLivrosEmprestados = new HashMap<Integer, LivroFisico>();
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public HashMap<Integer, LivroFisico> getListaLivrosEmprestados() {
        return listaLivrosEmprestados;
    }

    public void setLivrosEmprestadosLista(int isbn, LivroFisico livro) {
        this.listaLivrosEmprestados.put(isbn, livro);
    }

}
