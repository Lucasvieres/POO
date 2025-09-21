import java.util.Scanner;

public class questao9 {
    static Scanner leitor = new Scanner(System.in);
    static int menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE, num;

    public static void verifica(){
        if(num <= menor){
            menor = num;
        }
        if(num>=maior){
            maior = num;
        }
    }
    public static void main(String[] args) {
        
        System.out.println("Insira valores inteiros e positivos:");


    do{
        System.out.printf("Insira um numero:");
        num = leitor.nextInt();
        if(num >= 0){
        verifica();
        }
    }while(num>0);

    System.out.printf("Menor valor: %d\n", menor);
    System.out.printf("Maior valor: %d\n", maior);
    
    leitor.close();
    }



}
