import java.util.Objects;

public class ContaBanco {
    public String numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;

    // Métodos normais
    public void abrirConta(String tipo){
        this.setStatus(true);
        this.setTipo(tipo);

        if (Objects.equals(this.getTipo(), "cc")){this.setSaldo(50);}
        else if (Objects.equals(this.getTipo(), "cp")){this.setSaldo(150);}
        else {System.out.println("Tipo de conta inválida!");}

        System.out.println("Conta aberta com sucesso!");
    }
    public void fecharConta(){
        if (this.getSaldo() == 0){
            setStatus(false);
            System.out.println("Sua conta foi fechada com sucesso");
        } else {
            System.out.println("Não é possível fechar sua conta");
        }
    }
    public void depositar(int deposito){
        if (getStatus()) {
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("Depósito realizado na conta de " + this.getDono());
        }
    }
    public void sacar(int saque){
        if (getStatus()){
            if (saque <= this.getSaldo()){
                this.setSaldo(this.getSaldo() - saque);
                System.out.println("Saque realizado na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para o saque");
            }
        }
    }
    public void pagarMensal(){
        if (getStatus()){
            switch (this.getTipo()) {
                case "cc" -> this.setSaldo(this.getSaldo() - 12);
                case "cp" -> this.setSaldo(this.getSaldo() - 20);
            }
            System.out.println("Mensalidade paga");
        }
    }

    // Método Construtor
    public ContaBanco(String numConta, String dono) {
        this.setNumConta(numConta);
        this.setDono(dono);
        this.saldo = 0;
        this.status = false;
    }

    /// Getters e Setters ///
    // Número da conta
    public String getNumConta() {
        return numConta;
    }
    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    //Tipo de conta
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Dono da conta
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    // Saldo na conta
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        if (this.getStatus()){
            this.saldo = saldo;
        }
    }

    // Status da conta
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public void exibir(){
        System.out.println("-------------------------------");
        System.out.println("Número da conta: " + getNumConta());
        System.out.println("Tipo de conta: " + getTipo());
        System.out.println("Dono da conta: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
    }
}