package exercicio;

public class ContaBanco {
   public int numConta;
   protected String tipo;
   private String dono;
   private double saldo;
   private boolean status;

    public void ContaBanco() {
        this.setSaldo(0);
        this.setStatus(true);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
   
    public void abrirConta(String t){
        this.setStatus(true);
        this.setTipo(t);
        if("cc".equals(this.tipo)){
            this.setSaldo(50);
        }else{
            this.setSaldo(150);
        }
        System.out.println("Conta aberta!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() != 0){
            System.out.println("Não é possivel, há saldo na conta");
        }else{
            this.status = false;
            System.out.println("Conta fechada com sucesso");
        }
    }
    public void depositar(double x){
        if(this.status == true){
         this.setSaldo(this.getSaldo() + x); 
            System.out.println("Depósito realizado!");
        }else{
            System.out.println("Conta não existente!");
        }
    }
    
    public void sacar(double y){
        if(this.getSaldo() < y){
            System.out.println("Sem saldo suficiente!");
        }else{
        this.setSaldo(this.getSaldo() - y);
            System.out.println("Saque realizado com sucesso!");
        }
    }
   
    public void pagarMensal(){
        if("cc".equals(this.getTipo())){
            this.setSaldo(this.getSaldo() - 20);
        }else{
            this.setSaldo(this.getSaldo() - 12);
        }
    }

    public void tudo() {
        System.out.print("Conta numero: " + numConta + ", tipo =" + tipo + ", dono=" + dono + ", saldo=" + saldo + ", status: " + status);
    }
    
    
}
