import java.util.Arrays;

class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                { 11, 29, 33 },
                { 51, 61, 73 },
                { 94, 10, 121 }
        };
        System.out.println((search(arr, 13)));
    }

    static boolean search(int[][] Matrix, int Target) {
        int row = 0;
        int col = Matrix.length - 1;
        while (row < Matrix.length && col >= 0) {
            if (Matrix[row][col] == Target) {
                return true;
            }
            if (Matrix[row][col] < Target) {
                row++;
            } else
                col--;
        }
        return false;
    }
}