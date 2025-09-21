package Métodos;
import java.util.Scanner;

public class questao2 {

    public static void verifica(){
        Scanner leitor = new Scanner(System.in);
        int numero;
        System.out.printf("Insira o numero a ser verificado:");
        numero = leitor.nextInt();

        if(numero%2 == 0){
            System.out.printf("O numero %d é PAR.", numero);
        } else{
            System.out.printf("O numero %d é IMPAR.", numero);
        }
        leitor.close();
    }
    public static void main(String[] args) {
        System.out.println("------VERIFICADOR DE PAR OU IMPAR-------");
        verifica();
    }
    
}
