public class Main {
    public static void main(String[] args) {
        Discos discos = new Discos();
        discos.setTitulo("ExmplodeTitulo");
        System.out.println(discos.getTitulo());
        discos.setAnoLancamento(2024);
        System.out.println(discos.getAnoLancamento());
        discos.setFaixas("1"); /* Como posso testar a arraylist? */
        System.out.println(discos.toString());
    }
}
