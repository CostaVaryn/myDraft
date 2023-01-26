package tp.taskschatgpt;

import java.util.Iterator;

public class Matrix {
    private int rows;
    private int columns;
    private int[][] data;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new int[rows][columns];
    }

    public void setValueAt(int i, int j, int value) {
        this.data[i][j] = value;
    }

    public int getValueAt(int i, int j) {
        return this.data[i][j];
    }

    public void multiplyByScalar(int scalar) {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.data[i][j] *= scalar;
            }
        }
    }

    public void add(Matrix m) {
        if (this.rows != m.rows || this.columns != m.columns) {
            throw new IllegalArgumentException("Invalid matrix dimensions");
        }
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.data[i][j] += m.data[i][j];
            }
        }
    }

    public void transpose() {
        int[][] transposedData = new int[this.columns][this.rows];
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                transposedData[j][i] = this.data[i][j];
            }
        }
        this.data = transposedData;
        int temp = this.rows;
        this.rows = this.columns;
        this.columns = temp;
    }

    public static Matrix operator(Matrix m1, Matrix m2) {
        Matrix result = new Matrix(m1.rows, m1.columns);
        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m1.columns; j++) {
                result.data[i][j] = m1.data[i][j] + m2.data[i][j];
            }
        }
        return result;
    }

    public static Matrix operator(Matrix m1, int scalar) {
        Matrix result = new Matrix(m1.rows, m1.columns);
        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m1.columns; j++) {
                result.data[i][j] = m1.data[i][j] * scalar;
            }
        }
        return result;
    }

    public Iterator iterator() {
        return new MatrixIterator(this);
    }

    private class MatrixIterator implements Iterator {
        private int currentRow = 0;
        private int currentColumn = 0;
        private Matrix matrix;

        public MatrixIterator(Matrix matrix) {
            this.matrix = matrix;
        }

        public boolean hasNext() {
            return currentRow < matrix.rows && currentColumn < matrix.columns;
        }

        public Integer next() {
            int result = matrix.data[currentRow][currentColumn];
            currentColumn++;
            if (currentColumn == matrix.columns) {
                currentColumn = 0;
                currentRow++;
            }
            return result;
        }
    }
}