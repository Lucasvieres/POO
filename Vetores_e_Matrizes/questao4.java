package Vetores_e_Matrizes;

import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        byte idade[] = new byte[3];
        String nome[] = new String[3];

        for(int i = 0; i < idade.length; i++){
            System.out.printf("Insira o nome da %d° candidata aqui:", i+1);
            nome[i] = leitor.nextLine();

            System.out.printf("Insira a idade da %d° candidata aqui:", i+1);
            idade[i] = leitor.nextByte();
            leitor.nextLine();
        }
        for(int i = 0; i < idade.length; i++){

        if(idade[i] >= 18 && idade[i] <= 20){
        System.out.printf("Nome: %s\n", nome[i]);
        }
        }
        leitor.close();
    }
    
}
