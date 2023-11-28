
public class v3 {
    public static void main(String[] args) {
        int a[] = new int[10];
        int b[] = new int[10];
        
        // Lendo os valores para o vetor A
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor para A[" + i + "]: ");
            a[i] = Integer.parseInt(System.console().readLine());
        }
        
        // Invertendo os valores e armazenando no vetor B
        for (int i = 0; i < 10; i++) {
            b[i] = a[9 - i];
        }
        
        // Imprimindo o vetor B
        System.out.println("Vetor B:");
        for (int i = 0; i < 10; i++) {
            System.out.println("B[" + i + "] = " + b[i]);
        }
    }
}