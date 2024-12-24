public class Matrizes {
    public static void main(String[] args) {
        int linhas = 5;
        int colunas = 8;
        int tam = 0;
        int[][] matrizInteiros = new int[linhas][colunas];
        for(int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                matrizInteiros[i][j] = i + j + 2;
            }
        }
        for(int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                System.out.println(matrizInteiros[i][j]);
                tam++;
            }
        }
        System.out.println("O tamanho da matriz é "+tam);
    }
}
