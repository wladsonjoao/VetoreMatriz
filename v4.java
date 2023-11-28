
import java.util.Scanner;

public class v4 {
    public static void main(String[] args) {
        int a[] = new int[10];
        int soma = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        // Lendo os valores para o vetor A
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor para A[" + i + "]: ");
            a[i] = scanner.nextInt();
            soma += a[i];
        }
        
        scanner.close();
        
        // Calculando a média
        double media = soma / 10.0;
        
        // Apresentando a média
        System.out.println("A mÃ©dia dos valores lidos Ã©: " + media);
    }
}