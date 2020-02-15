package resolvidos;

import java.util.Scanner;

public class Resolvidos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[l][c];
        
        for(int i = 0; i<l; i++){
            for(int j = 0; j<c; j++){
                mat[i][j] = sc.nextInt();   
            }
        }
        
        int in = sc.nextInt();
        
        for(int i = 0; i<=l; i++){
            for(int j = 0; j<=c; j++){
                if(mat[i][j] == in){
                    System.out.println("Posição: " + i + "," + j);
                    System.out.println("Direita: " + mat[i][j-1]);
                    System.out.println("Esquerda: " + mat[i][j+j]);
                    System.out.println("Abaixo: " + mat[i+1][j]);
                }   
            }
        }
        
        
        
        sc.close();
    }
    
}
