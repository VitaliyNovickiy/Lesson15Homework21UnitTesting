import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMatrix {
    private Matrix matrixUtils;
    private int[][] matrix;

    @BeforeEach
    void setUp() {
        matrixUtils = new Matrix();
        matrix = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
    }


    @Test
    void testCalculateAverage() {
        double average = matrixUtils.calculateAverage(matrix);
        assertEquals(5.0, average);
    }


    @Test
    void testIsSquareMatrix() {
        boolean isSquare = matrixUtils.isSquareMatrix(matrix);
        assertTrue(isSquare);
    }

    @Test
    void testIsSquareMatrix_NonSquareMatrix() {
        int[][] nonSquareMatrix = new int[][] {
                {1, 2, 3},
                {4, 5},
                {4, 5, 6}
        };
        boolean isSquare = matrixUtils.isSquareMatrix(nonSquareMatrix);
        assertFalse(isSquare);
    }

    @Test
    void testIsSquareMatrix_EmptyMatrix() {
        int[][] emptyMatrix = new int[0][0];
        boolean isSquare = matrixUtils.isSquareMatrix(emptyMatrix);
        assertFalse(isSquare);
    }
    @Test
    void testIsSquareMatrix_NullMatrix() {
        int[][] nullMatrix = null;
        boolean isSquare = matrixUtils.isSquareMatrix(nullMatrix);
        assertFalse(isSquare);
    }
}

