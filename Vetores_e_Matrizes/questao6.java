package Vetores_e_Matrizes;
import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        int numero;
        int contagem = 0;

        Scanner leitor = new Scanner(System.in);
        int sorteio = (int)(Math.random() * 100) + 1;

        while(true){

        System.out.printf("Tente adivinhar o numero:");
        numero = leitor.nextInt();

        if(numero > sorteio){
            System.out.println("O valor que voce inseriu era maior que o numero sorteado.");
        } else if(numero < sorteio){
            System.out.println("O valor que voce inseriu era menor que o numero sorteado.");
        }else{
            System.out.println("Voce acertou.");
            break;
        }
        contagem++;
        }
        System.out.printf("%d tentativas.", contagem);
        leitor.close();
    }
}
