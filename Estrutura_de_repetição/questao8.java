import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int totalAlunos = 0;
        double somaNotas = 0;
        
        System.out.println("=== CÁLCULO DA MÉDIA DA TURMA ===");
        System.out.println("Digite os dados dos alunos (matrícula e nota)");
        System.out.println("Para encerrar, digite -1 na matrícula");

        
        while (true) {
            System.out.print("\nDigite o número de matrícula do aluno: ");
            int matricula = leitor.nextInt();
            
            if (matricula == -1) {
                break;
            }
            
            System.out.print("Digite a nota do aluno (0 a 10): ");
            double nota = leitor.nextDouble();
            
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
                continue;
            }
            
            totalAlunos++;
            somaNotas += nota;
            
            System.out.println("Aluno " + matricula + " adicionado com nota: " + nota);
        }
        
        System.out.println("\n" + "=" .repeat(40));
        System.out.println("RESULTADOS FINAIS:");
        System.out.println("Total de alunos: " + totalAlunos);
        
        if (totalAlunos > 0) {
            double media = somaNotas / totalAlunos;
            System.out.printf("Soma total das notas: %.2f\n", somaNotas);
            System.out.printf("Média da turma: %.2f\n", media);
            

        leitor.close();
    }
}
}