package application;

import entities.Conta;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta;
        
        System.out.println("Numero da conta: ");
        int nc = sc.nextInt();
        System.out.println("Tirular da conta: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.println("Quer fazer um deposito inicial? (s/n)");
        char x = sc.next().charAt(0);
        if(x=='s'){
            System.out.println("Deposito inicia: ");
            double dopoI = sc.nextDouble();
            conta = new Conta(nc, titular, dopoI);
        }
        else{
            conta = new Conta(nc, titular);
        }
        
        System.out.println();
	System.out.println("Informações:");
	System.out.println(conta);
	
	System.out.println();
	System.out.print("Valor de deposito: ");
	double depositValue = sc.nextDouble();
	conta.deposito(depositValue);
	System.out.println("Informações atualizadas:");
	System.out.println(conta);
	
	System.out.println();
	System.out.print("Valor de saque: ");
	double withdrawValue = sc.nextDouble();
	conta.saque(withdrawValue);
	System.out.println("Updated account data:");
	System.out.println(conta);
        
        
        sc.close();
    }
}