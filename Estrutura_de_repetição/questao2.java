import java.util.Scanner;

public class questao2 {

    static int num;
    static long fatorial;

    public static void fatorial(){
        fatorial = 1;
        for (int i = 1; i <= num; i++){
            fatorial *= i;
        
        }
    }
    public static void main(String[] args) {

    Scanner leitor = new Scanner (System.in);

        System.out.println("Insira o numero: ");
        num = leitor.nextInt();

        fatorial();

        System.out.println("Fatorial: " +fatorial);

    leitor.close();
    }

}
