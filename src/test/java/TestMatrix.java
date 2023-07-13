import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMatrix {
    private int[][] matrix;

    @BeforeEach
    void setUp() {
        matrix = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
    }


    @Test
    void testCalculateAverage() {
        double average = Matrix.calculateAverage(matrix);
        assertEquals(5.0, average);
    }


    @Test
    void testIsSquareMatrix() {
        boolean isSquare = Matrix.isSquareMatrix(matrix);
        assertTrue(isSquare);
    }

    @Test
    void testIsSquareMatrix_NonSquareMatrix() {
        int[][] nonSquareMatrix = new int[][] {
                {1, 2, 3},
                {4, 5, 6}
        };
        boolean isSquare = Matrix.isSquareMatrix(nonSquareMatrix);
        assertFalse(isSquare);
    }

    @Test
    void testIsSquareMatrix_EmptyMatrix() {
        int[][] emptyMatrix = new int[0][0];
        boolean isSquare = Matrix.isSquareMatrix(emptyMatrix);
        assertFalse(isSquare);
    }
}

