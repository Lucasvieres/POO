package Vetores_e_Matrizes;

import java.util.Scanner;

public class questao2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int num1[] = new int[5];
        int num2[] = new int[5];

        for(int i = 0; i < num1.length; i++){
            System.out.printf("Insira os valores do primeiro vetor aqui:");
            num1[i] = leitor.nextInt();
        
        }

        for(int i = 0; i < num2.length; i++){
            System.out.printf("Insira os valores do segundo vetor aqui:");
            num2[i] = leitor.nextInt();
        
        }
        int produtoEscalar = 0;
        for(int i = 0; i < num1.length; i++){
        int multiplicacao = num1[i]*num2[i];

        produtoEscalar +=multiplicacao;
        }

    leitor.close();
    System.out.printf("Produto escalar: ", produtoEscalar);

    }
    
}
