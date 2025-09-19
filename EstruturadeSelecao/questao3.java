
import java.util.Scanner;

public class questao3 {
    static double altura, peso;
    static int opcao;

    static Scanner leitor = new Scanner(System.in);

    public static void pesoIdeal(){
        double pesoHomem;
        double pesoMulher;

        if(opcao == 1){
            pesoHomem = (72.7*altura) - 58;

            System.out.printf("O seu peso ideal é: %.2f\n", pesoHomem);
        } else{
            pesoMulher = (62.1 *altura) - 44;

            System.out.printf("O seu peso ideal é: %.2f\n", pesoMulher);
        }
    }
public static void main(String[] args) {

    System.out.println("Insira o seu peso:");
    peso = leitor.nextDouble();

    System.out.println("Insira a sua altura: ");
    altura = leitor.nextDouble();
    altura = altura/100;
    do{
        System.out.printf("""
                Escolha a opção que se voce quer utilizar:

                Opção 1 - Peso ideal para homens.
                Opção 2 - Peso ideal para mulheres.
                Opção 0 - Sair do programa.

                Opção:
                """);
        opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                pesoIdeal();
                break;
            
            case 2: 
                pesoIdeal();
                break;

            case 0:
                System.out.println("Saindo...");
                break;
        
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }while(opcao !=0);
}
}
