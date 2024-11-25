import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*    teste classe discos
        Discos discos = new Discos();
        discos.setTitulo("ExmplodeTitulo");
        System.out.println(discos.getTitulo());
        discos.setAnoLancamento(2024);
        System.out.println(discos.getAnoLancamento());
        System.out.println(discos.toString());
*/
/*      teste classe artista
        Artista artista = new Artista();
        artista.setNome("ArtistaExemplo");
        System.out.println(artista.getNome());
        artista.setGenero("Rock brabo");
        System.out.println(artista.getGenero());
        System.out.println(artista.toString());
*/

        Sistema sistema = new Sistema();
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\n=== Catálogo de Discos ===");
            System.out.println("1. Adicionar Disco");
            System.out.println("2. Adicionar Artista");
            System.out.println("3. Listar Discos");
            System.out.println("4. Editar Disco");
            System.out.println("5. Remover Disco");
            System.out.println("6. Adicionar Genero");
            System.out.println("7. Listar Generos");
            System.out.println("8. Remover Genero");
            System.out.println("9. Editar Artista");
            System.out.println("10. Remover Artista");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Titulo do disco: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ano de lançcamento: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Numero de faixas: ");
                    int numFaixas = scanner.nextInt();
                    scanner.nextLine();

                    List<String> faixas = new ArrayList<>();
                    for (int i = 1; i <= numFaixas; i++) {
                        System.out.print("Nome da faixa " + i + ": ");
                        faixas.add(scanner.nextLine());
                    }

                    sistema.adicionarDisco(titulo, ano, faixas);
                }
                case 2 -> {
                    System.out.print("Nome do artista: ");
                    String nome = scanner.nextLine();
                    System.out.print("Genero musical: ");
                    String genero = scanner.nextLine();
                    System.out.print("Titulo do disco pra associar: ");
                    String tituloDisco = scanner.nextLine();
                    sistema.adicionarArtista(nome, genero, tituloDisco);
                }
                case 3 -> sistema.listarDiscos();
                case 4 -> {
                    System.out.print("Titulo atual do disco: ");
                    String tituloAtual = scanner.nextLine();
                    System.out.print("Novo titulo do disco: ");
                    String novoTitulo = scanner.nextLine();
                    System.out.print("Novo ano de lancamento: ");
                    int novoAno = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Numero de novas faixas: ");
                    int novasFaixasNum = scanner.nextInt();
                    scanner.nextLine();

                    List<String> novasFaixas = new ArrayList<>();
                    for (int i = 1; i <= novasFaixasNum; i++) {
                        System.out.print("Nome da nova faixa " + i + ": ");
                        novasFaixas.add(scanner.nextLine());
                    }

                    sistema.editarDisco(tituloAtual, novoTitulo, novoAno, novasFaixas);
                }
                case 5 -> {
                    System.out.print("Título do disco pra remover: ");
                    String titulo = scanner.nextLine();
                    sistema.removerDisco(titulo);
                }
                case 6 -> {
                    System.out.print("Nome do genero pra adicionar: ");
                    String genero = scanner.nextLine();
                    sistema.adicionarGenero(genero);
                }
                case 7 -> sistema.listarGeneros();
                case 8 -> {
                    System.out.print("Nome do genero pra remover: ");
                    String genero = scanner.nextLine();
                    sistema.removerGenero(genero);
                }
                case 9 -> {
                    System.out.print("Nome atual do artista: ");
                    String nomeAtual = scanner.nextLine();
                    System.out.print("Novo nome do artista: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Novo genero do artista: ");
                    String novoGenero = scanner.nextLine();
                    sistema.editarArtista(nomeAtual, novoNome, novoGenero);
                }
                case 10 -> {
                    System.out.print("Nome do artista pra remover: ");
                    String nome = scanner.nextLine();
                    sistema.removerArtista(nome);
                }
                case 0 -> {
                    System.out.println("Saindo do sistema...");
                    executando = false;
                }
                default -> System.out.println("Opcao invalida. Tente novamente.");
            }
        }

        scanner.close();
    }
}




