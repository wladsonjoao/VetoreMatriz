

public class M3 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][4];
        
        // Preenche a matriz com valores aleatórios
        for (int i = 0; i < 3; i++) {
            int soma = 0;
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 10); // Gera números aleatórios entre 0 e 9
                soma += matriz[i][j];
            }
            matriz[i][3] = soma;
        }
        
        // Imprime a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}