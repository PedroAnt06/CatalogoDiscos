import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private List<Discos> discos;
    private List<Artista> artistas;
    private List<String> generos;

    public Sistema() {
        discos = new ArrayList<>();
        artistas = new ArrayList<>();
        generos = new ArrayList<>();
    }

    public void adicionarDisco(String titulo, int anoLancamento, List<String> faixas) {
        Discos novoDisco = new Discos();
        novoDisco.setTitulo(titulo);
        novoDisco.setAnoLancamento(anoLancamento);
        novoDisco.setFaixas(faixas);
        discos.add(novoDisco);
        System.out.println("Disco adicionado");
    }

    public void adicionarArtista(String nome, String genero, String tituloDisco) {
        for (Discos disco : discos) {
            if (disco.getTitulo().equalsIgnoreCase(tituloDisco)) {
                Artista novoArtista = new Artista();
                novoArtista.setNome(nome);
                novoArtista.setGenero(genero);
                artistas.add(novoArtista);
                System.out.println("Artista adicionado ao disco: " + tituloDisco);
                return;
            }
        }
        System.out.println("Disco nao encontrado");
    }

    public void listarDiscos() {
        if (discos.isEmpty()) {
            System.out.println("Nenhum disco cadastrado");
            return;
        }

        for (Discos disco : discos) {
            System.out.println("Titulo: " + disco.getTitulo());
            System.out.println("Ano de Lancamento: " + disco.getAnoLancamento());
            System.out.println("Faixas: " + disco.getFaixas());

            System.out.println("Artistas:");
            for (Artista artista : artistas) {
                System.out.println(" Nome: " + artista.getNome() + " Genero: " + artista.getGenero());
            }
            System.out.println("---------------------------------");
        }
    }

    public void editarDisco(String tituloAntigo, String novoTitulo, int novoAno, List<String> novasFaixas) {
        for (Discos disco : discos) {
            if (disco.getTitulo().equalsIgnoreCase(tituloAntigo)) {
                disco.setTitulo(novoTitulo);
                disco.setAnoLancamento(novoAno);
                disco.setFaixas(novasFaixas);
                System.out.println("Disco atualizado");
                return;
            }
        }
        System.out.println("Disco nao encontrado");
    }

    public void removerDisco(String titulo) {
        discos.removeIf(disco -> disco.getTitulo().equalsIgnoreCase(titulo));
        System.out.println("Disco removido");
    }

    public void editarArtista(String nomeAntigo, String novoNome, String novoGenero) {
        for (Artista artista : artistas) {
            if (artista.getNome().equalsIgnoreCase(nomeAntigo)) {
                artista.setNome(novoNome);
                artista.setGenero(novoGenero);
                System.out.println("Artista atualizado");
                return;
            }
        }
        System.out.println("Artista nao encontrado");
    }

    public void removerArtista(String nome) {
        artistas.removeIf(artista -> artista.getNome().equalsIgnoreCase(nome));
        System.out.println("Artista removido");
    }

    public void adicionarGenero(String genero) {
        if (!generos.contains(genero)) {
            generos.add(genero);
            System.out.println("Genero adicionado");
        } else {
            System.out.println("Genero já existe");
        }
    }

    public void listarGeneros() {
        if (generos.isEmpty()) {
            System.out.println("Nenhum genero cadastrado.");
            return;
        }
        System.out.println("Generos disponíveis:");
        for (String genero : generos) {
            System.out.println("- " + genero);
        }
    }

    public void removerGenero(String genero) {
        if (generos.remove(genero)) {
            System.out.println("Genero removido");
        } else {
            System.out.println("Gênero não encontrado");
        }
    }
}
