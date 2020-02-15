
package aula02;

public class Conta {

    private int numConta;
    private String nome;
    private double saldo;

    public Conta(int numConta, String nome, double depoIni) {
        this.numConta = numConta;
        this.nome = nome;
       deposito(depoIni);
    }

    public Conta(int numConta, String nome) {
        this.numConta = numConta;
        this.nome = nome;
    }
    
    

    public int getNumConta() {
        return numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double depoIni) {
        this.saldo = depoIni;
    }
       
    public void deposito(double y){
        this.saldo += y;
    }
    
     public void saque(double z){
        this.saldo -= z + 5;
    }

    @Override
    public String toString() {
        return "Conta: " + numConta + ", nome:" + nome + ", saldo:" + String.format("%.2f", saldo);
    }

    
     
}

