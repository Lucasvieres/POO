package Métodos;
import java.util.Scanner;

public class questao4 {
    
    public static boolean isEquilatero(double lado1, double lado2, double lado3) {
        return (lado1 == lado2) && (lado2 == lado3) && (lado1 == lado3);
    }
    

    public static boolean isIsosceles(double lado1, double lado2, double lado3) {
        return (lado1 == lado2 && lado1 != lado3) || 
               (lado1 == lado3 && lado1 != lado2) || 
               (lado2 == lado3 && lado2 != lado1);
    }
    
    public static boolean isEscaleno(double lado1, double lado2, double lado3) {
        return (lado1 != lado2) && (lado2 != lado3) && (lado1 != lado3);
    }
    
    public static boolean isTrianguloValido(double lado1, double lado2, double lado3) {
        return (lado1 + lado2 > lado3) && 
               (lado1 + lado3 > lado2) && 
               (lado2 + lado3 > lado1) &&
               (lado1 > 0) && (lado2 > 0) && (lado3 > 0);
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("=== CLASSIFICADOR DE TRIÂNGULOS POR LADOS ===");
        
        System.out.print("Digite o primeiro lado: ");
        double lado1 = leitor.nextDouble();
        
        System.out.print("Digite o segundo lado: ");
        double lado2 = leitor.nextDouble();
        
        System.out.print("Digite o terceiro lado: ");
        double lado3 = leitor.nextDouble();
        
        if (!isTrianguloValido(lado1, lado2, lado3)) {
            System.out.println("Os lados fornecidos não formam um triângulo válido!");
            System.out.println("A soma de quaisquer dois lados deve ser maior que o terceiro lado.");
        } else {

            if (isEquilatero(lado1, lado2, lado3)) {
                System.out.println("Tipo: Triângulo Equilátero");
            } else if (isIsosceles(lado1, lado2, lado3)) {
                System.out.println("Tipo: Triângulo Isósceles");
            } else if (isEscaleno(lado1, lado2, lado3)) {
                System.out.println("Tipo: Triângulo Escaleno");
            }
            

            System.out.println("\nResultados das verificações:");
            System.out.println("Equilátero: " + isEquilatero(lado1, lado2, lado3));
            System.out.println("Isósceles: " + isIsosceles(lado1, lado2, lado3));
            System.out.println("Escaleno: " + isEscaleno(lado1, lado2, lado3));
        }
        
        leitor.close();
    }
}