
public class v1 {
    public static void main(String[] args) {
        int a[] = new int[10];
        int b[] = new int[10];
        
        // Lendo os valores para o vetor A
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor para A[" + i + "]: ");
            a[i] = Integer.parseInt(System.console().readLine());
        }
        
        // Calculando os quadrados e armazenando no vetor B
        for (int i = 0; i < 10; i++) {
            b[i] = b[i] * a[i];
        }
        
        // Imprimindo o vetor B
        System.out.println("Vetor B:");
        for (int i = 0; i < 10; i++) {
            System.out.println("B[" + i + "] = " + b[i]);
        }
    }
}