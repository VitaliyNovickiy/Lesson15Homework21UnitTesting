public class Matrix {
    public boolean isSquareMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }

        int rows = matrix.length;
        int columns = matrix[0].length;

        if (rows != columns) {
            return false;
        }


        for (int i = 0; i < rows; i++) {
            if (matrix[i].length != columns) {
                return false;
            }
        }

        return true;
    }
    public double calculateAverage(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            throw new IllegalArgumentException("Matrix must not be null or empty.");
        }

        int sum = 0;
        int count = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
                count++;
            }
        }

        return (double) sum / count;
    }
}

