
public class v2 {
    public static void main(String[] args) {
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[10];
        
        // Lendo os valores para o vetor A
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor para A[" + i + "]: ");
            a[i] = Integer.parseInt(System.console().readLine());
        }
        
        // Lendo os valores para o vetor B
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor para B[" + i + "]: ");
            b[i] = Integer.parseInt(System.console().readLine());
        }
        
        // Calculando a soma e armazenando no vetor C
        for (int i = 0; i < 10; i++) {
            c[i] = a[i] + b[i];
        }
        
        // Imprimindo o vetor C
        System.out.println("Vetor C:");
        for (int i = 0; i < 10; i++) {
            System.out.println("C[" + i + "] = " + c[i]);
        }
    }
}