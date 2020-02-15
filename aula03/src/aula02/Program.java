
package aula02;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrecoDollar p = new PrecoDollar();
        
        System.out.println("Qual o preço do Dollar? ");
        double x = sc.nextDouble();
        p.setDollar(x);
        
        System.out.println("Quantos Dollares irá comprar? ");
        double y = sc.nextDouble();
        p.setQuant(y);
        
        System.out.println("Preço em reais: " + p.pagar());
       
        sc.close();
    }
    
}
