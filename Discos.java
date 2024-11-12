import java.util.List;

public class Discos {
    private String titulo;
    private int anoLancamento;
    private List<String> faixas;

    public void Discos(String titulo, int anoLancamento, List<String> faixas) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.faixas = faixas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setFaixas(List<String> faixas) {
        this.faixas = faixas;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public List<String> getFaixas() {
        return faixas;
    }

    @Override
    public String toString() {
        return "Discos:" +
                "\n TITULO : " + titulo +
                "\n ANODELANCAMENTO : " + anoLancamento +
                "\n FAIXAS : " + faixas;
    }
}

