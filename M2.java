

import java.util.Random;

public class M2 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Random random = new Random();
        
        // Preenche a matriz com valores aleatórios
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
              // Gera números aleatórios entre 0 e 99
                matriz[i][j] = random.nextInt(100);
            }
        }
        
        int maiorV = matriz[0][0];
        int menorV = matriz[0][0];
        int lMaiorV = 0;
        int cMaiorV = 0;
        int lMenorV = 0;
        int cMenorV = 0;
        
        // Encontra o maior e o menor valor da matriz e suas posições
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] > maiorV) {
                    maiorV = matriz[i][j];
                    lMaiorV = i;
                    cMaiorV = j;
                }
                if (matriz[i][j] < menorV) {
                    menorV = matriz[i][j];
                    lMenorV = i;
                    cMenorV = j;
                }
            }
        }
        
        // Imprime a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Maior valor: " + maiorV + " (linha " + lMaiorV + ", coluna " + cMaiorV + ")");
        System.out.println("Menor valor: " + menorV + " (linha " + lMenorV + ", coluna " + cMenorV + ")");
    }
}