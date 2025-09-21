package Métodos;

import java.util.Scanner;

public class questao1 {
    public static void reajuste(){
        Scanner leitor = new Scanner(System.in);
        float salario, reajuste, novosalario = 0.0f;

        System.out.printf("Insira o valor do salário: ");
        salario = leitor.nextFloat();

        System.out.printf("Agora insira o reajuste: ");
        reajuste = leitor.nextFloat();
        
        novosalario = salario + (salario*(reajuste/100.0f));

        System.out.printf("O salario com o reajuste de %.1f %% é de R$ %.2f reais.", reajuste, novosalario);
        leitor.close();
    }

public static void main(String[] args) {
    System.out.println("Calculando reajuste:");

    reajuste();
}
    
}
