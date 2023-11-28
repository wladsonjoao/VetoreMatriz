

public class M1 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        matriz[0][0] = 2;
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 && j == 0) {
                    continue; // Pula o elemento [0][0] que já foi preenchido
                }
                // O elemento atual é o dobro do elemento anterior
                matriz[i][j] = matriz[i][j-1] * 2; 
            }
        }
        
        // Imprime a matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}