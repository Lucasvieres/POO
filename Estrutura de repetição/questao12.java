import java.util.Scanner;

public class questao12 {

    public static void main(String[] args){
    Scanner leitor = new Scanner(System.in);
        double indice;
        String letra;

        do{
        System.out.printf("Insira o indice:");
        indice = leitor.nextDouble();
        leitor.nextLine();

            if(indice == 0.0){
                System.out.println("Saindo...");
            } else if(0.05 <= indice && indice <= 0.25){
                System.out.println("Indice de poluição aceitavel.");
            } else if(0.3 <= indice && indice <= 0.39){
                System.out.println("Industrias do grupo 1 devem suspender as atividades.");
            } else if(indice >= 0.4 && indice <= 0.49){
                System.out.println(" Industrias do 1º e 2º grupo são intimadas a suspenderem suas atividades");
            } else{
                System.out.println("Todos os grupos devem suspender as atividades.");
            }
        
            System.out.printf("Deseja encerrar o programa? ");
            letra = leitor.nextLine();

        }while(!letra.equalsIgnoreCase("S") || indice != 0.0);
    leitor.close();
    }
    
}
