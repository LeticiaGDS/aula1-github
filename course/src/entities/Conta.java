package entities;

public class Conta {
    private int nc;
    private String titular;
    private double saldo;
    
    public Conta(int nc, String titular, double depoI){
        this.nc = nc;
        this.titular = titular;
        deposito(depoI);
    }
    
    public Conta(int nc, String titular){
        this.nc = nc;
        this.titular = titular;
    }
    
    public int getNc() {
        return nc;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void  saque(double quantia){
         this.saldo -= quantia + 5; 
    }
    
    public void deposito(double quantia){
         this.saldo += quantia; 
    }
    
    public String toString(){
        return "Conta " + nc + ", titular " + titular + ", saldo " + saldo;
    }
    
}
