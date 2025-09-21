package EstruturadeSelecao;

import java.util.Scanner;

public class questao2 {
    static int num1, num2;

    static Scanner leitor = new Scanner(System.in);

    public static void multiplo(){

        if(num1%num2 ==0 || num2%num1 == 0){
            System.out.println("Os numeros sao multiplos um do outro.");
        } else{
            System.out.println("OS números não são multiplos um do outro.");
        }
    }

    public static void par(){
        if(num1%2 == 0 && num2%0 == 0){
            System.out.println("Ambos os numeros são pares.");
        } else if(num1%2 == 0){
            System.out.println("Somente o primeiro número é par.");
        } else {
            System.out.println("Somente o segundo número é par.");
        }
    }

    public static void media(){

       double media = (num1+num2)/2.0;

        if(media < 7){
            System.out.println("O valor da média é menor que 7.");
        } else if(media > 7){
            System.out.println("O valor da média é maior que 7.");
        } else{
            System.out.println("O valor da média é exatamente igual a 7.");
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        int opcao;

        System.out.println("Insira o primeiro valor: ");
        num1 = leitor.nextInt();

        System.out.println("Insira o segundo valor: ");
        num2 = leitor.nextInt();

        do{
        System.out.print("""
            Escolha o que quer analisar:
            
            Opção 1 - Verificar se são múltiplos um do outro.
            Opção 2 - Verificar se são pares.
            Opção 3 - Verificar se sua média é <= 7.

            Opção 0 - Sair.

                    """);

        opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                multiplo();
                break;
            
            case 2:
                par();
                break;

            case 3:
                media();
                break;
            case 0:
                System.out.println("Saindo...");
                break;

            default:
            System.out.println("Opção inválida.");
                break;
        }
        }while(opcao !=0);

        leitor.close();
        
    }
}
