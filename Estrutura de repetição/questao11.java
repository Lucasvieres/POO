import java.util.Scanner;

public class questao11 {
    static int[] num = new int[10];
    static int maior = Integer.MIN_VALUE;
    static int menor = Integer.MAX_VALUE;

    public static void verificacoes(){
        int soma = 0;
        int media;

    Scanner leitor = new Scanner(System.in);
        for(int i = 0; i < num.length; i++){

        System.out.printf("Insira 10 numeros:");
        num[i] = leitor.nextInt();
            soma += num[i];

            if(num[i] <= menor){
                menor = num[i];
            }
            if(num[i] >= maior){
                maior = num[i];
            }
        }
        media = soma / 10;

        System.out.printf("Maior valor: %d\n", maior);
        System.out.printf("Menor valor: %d\n", menor);
        System.out.printf("Media: %d\n", media);
    leitor.close();
    }
    
    public static void main(String[] args) {

    verificacoes();
    }
    
}
