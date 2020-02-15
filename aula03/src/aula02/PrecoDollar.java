package aula02;

public class PrecoDollar {
        
    private double dollar;
    private double quant;
    
    public PrecoDollar(){
        
    }

    public double getDollar() {
        return dollar;
    }

    public void setDollar(double dollar) {
        this.dollar = dollar * 1.06;
    }

    public double getQuant() {
        return quant;
    }

    public void setQuant(double quant) {
        this.quant = quant;
    }

    public double pagar(){
        return this.getDollar() * this.getQuant();
    }
   
}

