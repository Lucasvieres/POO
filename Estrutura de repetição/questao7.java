import java.util.Scanner;

public class questao7{
static Scanner leitor = new Scanner(System.in);
    static int num;
    static int qtd = 20;
    public static void quadrado(){
        int quadrado;
    for (int i = num; i <num + 20; i++){
        quadrado = i * i;
        System.out.println(i + "² = " + quadrado);
    }
}
    public static void main(String[] args) {

        System.out.printf("insira o numero inicial: ");
        num = leitor.nextInt();

        quadrado();

        leitor.close();
    }
}