import java.util.HashMap;

public abstract class Usuario {
    public int id;
    public String nome;
    public String email;
    public HashMap<Integer, LivroFisico> listaLivrosEmprestados = new HashMap<Integer, LivroFisico>();
}
