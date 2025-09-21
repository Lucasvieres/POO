package Vetores_e_Matrizes;

import java.util.Scanner;

public class questao7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        char letra1;
        char letra2;
        String temp;
        int contagem = 0;
        
        System.out.printf("Insira a primeira letra:");
        temp = leitor.nextLine();
        letra1 = temp.charAt(0);

        System.out.printf("Insira a segunda letra:");
        temp = leitor.nextLine();
        letra2 = temp.charAt(0);

        while(letra1 < letra2){
            letra1 ++;
            contagem ++;
        }

        System.out.printf("Intervalo entre as letras: %d\n", contagem);

        leitor.close();
    }
    
}
