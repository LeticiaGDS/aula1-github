
package aula02;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta;
        
        System.out.println("Numero da conta: ");
        int numConta = sc.nextInt();
        System.out.println("Nome do dono: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.println("Deposito inicial? ");
        char vai = sc.next().charAt(0);
        if(vai == 'y'){
            System.out.println("Entre com o deposito inicial: ");
            double depoIni = sc.nextDouble();
            conta = new Conta(numConta, nome, depoIni);
            
        }else{
            conta = new Conta(numConta, nome);
        }
        
        System.out.println("Informações: ");
        System.out.println(conta);
        
        System.out.println("\nEntre com o valor do depósito: ");
        double x = sc.nextDouble();
        conta.deposito(x);
        
        System.out.println("\nInformações atualizadas: ");
        System.out.println(conta);
        
        System.out.println("\nEntre com o valor do saque: ");
        double y = sc.nextDouble();
        conta.saque(y);
        
        System.out.println("\nInformações atualizadas: ");
        System.out.println(conta);
        
        
        
        
        
        
        
        sc.close();
    }     
}
