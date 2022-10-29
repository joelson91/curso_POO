public class Aluno extends Pessoa {
    // Atributos
    private int matricula;
    private String curso;

    // Métodos
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno: " + this.getNome());
    }

    // Getters e Setters
    // Matricula
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    // Curso
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
