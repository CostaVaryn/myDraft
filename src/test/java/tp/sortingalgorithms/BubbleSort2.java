package tp.sortingalgorithms;

public class BubbleSort2 {
    public static void matrixBubbleSort(int[][] sortMatrix){
        int swap;
        for (int i = 0; i < sortMatrix.length; i++) {
            for (int j = 0; j < sortMatrix[i].length; j++) {
                for (int k = 0; k < sortMatrix.length; k++) {
                    for (int l = 0; l < sortMatrix[k].length; l++) {
                        if (sortMatrix[i][j] <= sortMatrix[k][l]) {
                            swap = sortMatrix[i][j];
                            sortMatrix[i][j] = sortMatrix[k][l];
                            sortMatrix[k][l] = swap;
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] sortMatrix = new int[][]{
            {8, 3, 5},
            {1, 4, 6},
            {9, 7, 2}
        };
        matrixBubbleSort(sortMatrix);

        for (int[] matrix : sortMatrix) {
            for (int i : matrix) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
