import java.util.ArrayList;
import java.util.List;
public class Artista {
    private String nome;
    private  String genero;
    private List<Discos> discos;

    public Artista() {
        this.nome = nome;
        this.genero = genero;
        this.discos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Discos> getDiscos() {
        return discos;
    }

    public void addDiscos(List<Discos> discos) {
        this.discos = discos;
    }

    @Override
    public String toString() {
        return "Artista: " +
                "\n NOME : " + nome +
                "\n GENERO : " + genero +
                "\n DISCOS : " + discos;
    }
}
