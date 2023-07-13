import java.util.Arrays;

public class Program {
    public static void main(String[] args) {


        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        boolean isSquare = Matrix.isSquareMatrix(matrix);
        System.out.println("Is square matrix: " + isSquare);


        double average = Matrix.calculateAverage(matrix);
        System.out.println("Average: " + average);
    }
}




