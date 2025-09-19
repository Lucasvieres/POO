import java.util.Scanner;

public class questao1 {
    static Scanner leitor = new Scanner(System.in);

    public static void adicao() {
        System.out.printf("Insira o primeiro valor:");
        int valor1 = leitor.nextInt();

        System.out.printf("\nInsira o segundo valor:");
        int valor2 = leitor.nextInt();

        int soma = valor1 + valor2;
        System.out.printf("Soma: %d\n", soma);
        System.out.println();
    }

    public static void subtracao() {
        System.out.printf("Insira o primeiro valor:");
        int valor1 = leitor.nextInt();

        System.out.printf("\nInsira o segundo valor:");
        int valor2 = leitor.nextInt();

        int subtracao = valor1 - valor2;
        System.out.printf("Subtração: %d\n", subtracao);
        System.out.println();
    }

    public static void multiplicacao() {
        System.out.printf("Insira o primeiro valor:");
        int valor1 = leitor.nextInt();

        System.out.printf("\nInsira o segundo valor:");
        int valor2 = leitor.nextInt();

        int multiplicacao = valor1 * valor2;
        System.out.printf("Multiplicação: %d\n", multiplicacao);
        System.out.println();
    }

    public static void divisao() {
        System.out.printf("Insira o primeiro valor:");
        int valor1 = leitor.nextInt();

        System.out.printf("\nInsira o segundo valor:");
        int valor2 = leitor.nextInt();

        if (valor2 == 0) {
            System.out.println("Erro: Divisão por zero!");
        } else {
            double divisao = (double) valor1 / valor2;
            System.out.printf("Divisão: %.2f\n", divisao);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int opcao;
        
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            
            opcao = leitor.nextInt();
            
            switch (opcao) {
                case 1:
                    adicao();
                    break;
                case 2:
                    subtracao();
                    break;
                case 3:
                    multiplicacao();
                    break;
                case 4:
                    divisao();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);
        
        leitor.close();
    }
}