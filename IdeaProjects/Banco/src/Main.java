public class Main {
    public static void main(String[] args) {
        ContaBanco jubileu = new ContaBanco("1101", "Jubileu Soares");
        ContaBanco creusa = new ContaBanco("1102", "Creusa Moraes");

        jubileu.abrirConta("cp");
        creusa.abrirConta("cc");

        jubileu.depositar(600);

        creusa.sacar(50);

        creusa.fecharConta();

        jubileu.exibir();
        creusa.exibir();
    }
}