public class Main {
    public static void main(String[] args) {
        Aluno v1 = new Aluno();
        v1.setNome("Juvenal");
        v1.setIdade(13);
        v1.setCurso("Sistemas");
        v1.setMatricula(3213111);
        v1.setSexo("Masculino");

        System.out.println(v1.toString());
        v1.pagarMensalidade();
    }
}