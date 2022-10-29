import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // Métodos
    public void marcarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        } else {
            System.out.println("Não é possível iniciar a luta");
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }
    public void lutar(){
        if (this.isAprovada()){
            System.out.println("### DESAFIADO ###");
            this.getDesafiado().apresentar();

            System.out.println("### DESAFIANTE ###");
            this.getDesafiante().apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            switch (vencedor) {
                case 0 -> { // Empate
                    System.out.println("Empatou");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                }
                case 1 -> { // Desafiado ganhou
                    System.out.println(this.getDesafiado().getNome() + " ganhou!");
                    System.out.println(this.getDesafiante().getNome() + " perdeu!");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                }
                case 2 -> { // Desafiante ganhou
                    System.out.println(this.getDesafiante() + " ganhou!");
                    System.out.println(this.getDesafiado() + " perdeu!");
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                }
            }
        }
    }

    // Getters e Setters
    // Desafiado
    public Lutador getDesafiado() {
        return desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    // Desafiante
    public Lutador getDesafiante() {
        return desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    // Rounds
    public int getRounds() {
        return rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    // Aprovada
    public boolean isAprovada() {
        return aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
