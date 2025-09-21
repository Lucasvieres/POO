import java.util.Scanner;

public class questao5 {
    static int num;
    public static void tabuada(){

        System.out.printf("Tabuada do %d: \n", num);

        for(int i = 1; i <= 10; i++){


        System.out.println(num + "X" + i + "=" +(num*i));
        }
    }
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira um número: ");
        num = leitor.nextInt();
    
        tabuada();

    leitor.close();
    }    
}
