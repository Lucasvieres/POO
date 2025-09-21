package Vetores_e_Matrizes;

import java.util.Scanner;

public class questao1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int num[] = new int[5];


        for(int i = 0; i < num.length; i++){

        System.out.printf("Insira um numero:");
        num[i] = leitor.nextInt();

        }

        System.out.printf("Ordem decrescente:\n");
        for(int i = 4; i >=0; i--){
            System.out.printf("%d\n", num[i]);
        }

        leitor.close();
        
    }
}
