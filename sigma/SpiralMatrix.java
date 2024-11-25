public class SpiralMatrix {
    public static void printSpiralElement(int[][] matrix) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // for Top Row is constant and col is variable
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // Right here row is variable and col is constant
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // bottom here row is constant and col is variable
            for (int j = endCol - 1; j >= startCol; j--) {
                // for odd col or row
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left in endRow-1 goto startRow+1
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }

    }

    // Sum of diagonal of a matrix using Optimize approach O(n)
    public static int diagonalSum(int[][] matrix) {
        if (matrix.length == matrix[0].length) {
            int sum = 0;
            for (int i = 0; i < matrix.length; i++) {
                sum += matrix[i][i];
                int j = matrix.length - 1 - i;
                if (i != j) {
                    sum += matrix[i][j];
                }
            }
            return sum;
        }
        return -1;
    }


    // searching in 2D sorted array
    /*{{10,20,30,40},
       {15,25,35,45},
       {27,29,37,48},
       {32,33,39,50}
    } */

    public static void stairSearch(int [][] matrix, int key){
        int n = matrix.length;
        int m = matrix[0].length;
        int row = n-1;
        int col = 0;
        while(row>=0 && col<m){
            if(matrix[row][col] == key){
                System.out.println("Element is found in (" +row + "," + col+")");
                break;
            }
            else if(matrix[row][col]<key){
                col++;
            }
            else{
                row--;
            }
        }
        if(col==m){
            System.out.println("It's not found");
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{10,20,30,40},
        {15,25,35,45},
        {27,29,37,48},
        {32,33,39,50}};
        stairSearch(matrix, 125);
    }
}