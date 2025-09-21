package Vetores_e_Matrizes;

import java.util.Scanner;

public class questao5 {

    public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    int v1[] = new int[5];
    int v2[] = new int[5];
    int contagem = 0;

    for(int i = 0; i < v1.length; i++){
        System.out.printf("Insira os valores do primeiro vetor:");
        v1[i] = leitor.nextInt();

    }
    for(int i = 0; i < v1.length; i++){

        System.out.printf("Insira os valores do segundo vetor: ");
        v2[i] = leitor.nextInt();
    }

    for(int i = 0; i < v2.length; i++){
        if(v1[i] == v2[i]){
            contagem++;
        }
    }

    System.out.printf("V1 e V2 possuem as mesmas entradas em %d posicoes.", contagem);
    leitor.close();
    }

}
