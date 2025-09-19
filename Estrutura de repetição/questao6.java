import java.util.Scanner;

public class questao6 {
    
    public static void soma(int num, int[] somas) {
        if(num % 2 == 0) {
            somas[0] += num;
        } else {
            somas[1] += num;
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int somaPar = 0;
        int somaImpar = 0;
        int num;

        System.out.println("Soma dos pares e ímpares (digite 0 para parar):");

        do {
            System.out.print("Insira um número: ");
            num = leitor.nextInt();
            
            if(num > 0) {
                if(num % 2 == 0) {
                    somaPar += num;
                } else {
                    somaImpar += num;
                }
            }
            
        } while(num > 0);

        System.out.println("Soma dos pares: " + somaPar);
        System.out.println("Soma dos ímpares: " + somaImpar);

        leitor.close();
    }
}