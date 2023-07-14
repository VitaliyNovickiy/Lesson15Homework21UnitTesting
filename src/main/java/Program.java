
public class Program {
    public static void main(String[] args) {

        Matrix matrixUtils = new Matrix();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        matrixUtils.showMatrix(matrix);
        System.out.println(matrixUtils.isSquareMatrix(matrix));

        boolean isSquare = matrixUtils.isSquareMatrix(matrix);
        System.out.println("Is square matrix: " + isSquare);

        double average = matrixUtils.calculateAverage(matrix);
        System.out.println("Average: " + average);
    }
}




