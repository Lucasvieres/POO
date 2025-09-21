package Vetores_e_Matrizes;

import java.util.Scanner;

public class questao3 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeros[] = new int[10];
        int unitario, maior = 0, menor = 0, igual = 0;

        for(int i = 0; i < numeros.length; i++){
            System.out.printf("Insira o %d° numero aqui: ", i+1);
            numeros[i] = leitor.nextInt();

        }
        System.out.printf("Insira o valor do numero a ser comparado aqui:");
        unitario = leitor.nextInt();

        for(int i = 0; i < numeros.length; i++){
            if(unitario < numeros[i]){
                maior ++;
            } else if(unitario > numeros[i]){
                menor ++;
            }else{
                igual ++;
            }
        }
        System.out.printf("%d numeros são maiores que %d\n", maior, unitario);
        System.out.printf("%d numeros são menores que %d\n", menor, unitario);
        System.out.printf("%d numeros são iguais a %d\n", igual, unitario);

        leitor.close();
    }
    
}
