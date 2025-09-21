package Métodos;
import java.util.Scanner;

public class questao3 {
    static Scanner leitor = new Scanner(System.in);

    static int vetor[] = new int[10];

    public static void carregarVetor(){
    System.out.println("INSERINDO O VETOR");
    for(int i = 0; i < vetor.length; i++){
        System.out.print("Insira o número na posição " + i + ": ");
        vetor[i] = leitor.nextInt();
        leitor.nextLine();
    }
    System.out.println();
    }

    public static void listarVetor(){

    System.out.println("LISTANDO VETOR");
        
        for(int i = 0; i < vetor.length; i++){
            System.out.printf("%d ", vetor[i]);
            
        }
        System.out.println();
    }

    public static void pares(){
        System.out.println("VERIFICANDO NUMEROS PARES");
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i]%2 == 0){
            System.out.printf("Numeros pares: %d; \n", vetor[i]);
            }
        }
        System.out.println();
    }

    public static void impares(){
        System.out.println("VERIFICANDO NUMEROS IMPARES");
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i]%2 != 0){
            System.out.printf("Numeros impares: %d; \n", vetor[i]);
            }
        }
    System.out.println();
    }

    public static void verificaPar(){
        System.out.println("VERIFICANDO NUMEROS PARES NAS POSIÇÕES IMPARES");
        int count = 0;
        for(int i = 0; i < vetor.length; i++){
            if(i%2 != 0){
                if(vetor[i]%2 == 0){
                    count ++;
                }
            }
        }
        System.out.printf("%d numeros pares.", count); 
        System.out.println();
    }

    public static void verificaImpar(){
        System.out.println("VERIFICANDO NUMEROS IMPARES NAS POSIÇÕES PARES");
        int count = 0;
        for(int i = 0; i < vetor.length; i++){
            if(i%2 == 0){
                if(vetor[i]%2 != 0){
                    count++;
                }
            }
        }
        System.out.printf("%d numeros impares", count);
        System.out.println();
           
    }

    public static void main(String[] args) {
        System.out.println("""
                OPÇÕES:

                1- Carregar Vetor
                2 - Listar Vetor
                3 - Exibir apenas os números pares do vetor
                4 - Exibir apenas os números ímpares do vetor
                5 - Exibir a quantidade de números pares existem nas posições ímpares do vetor
                6 - Exibir a quantidade de números ímpares existem nas posições pares do vetor
                0 - Sair
                \n""");

        
        int opcao;
        do{
            System.out.printf("Insira a opção desejada: ");
            opcao = leitor.nextInt();

            switch (opcao) {
            case 1:
                carregarVetor();
                break;
            case 2:
                listarVetor();
                break;
            case 3:
                pares();
                break;
            case 4:
                impares();
                break;
            case 5:
                verificaPar();
                break;
            case 6:
                verificaImpar();
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
            System.out.println("Entrada invalida, escolha outra opção.");
                break;
        }
        }while(opcao !=0);
        
    }
    
}
