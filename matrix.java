import java.util.*;

class matrix {
    public static void main(String[] args) {
        int[][] arr = new int[][] {
                { 1, 2, 3, 4 },
                { 4, 5, 6, 7 },
                { 89, 45, 67 },
        };
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();

        }
    }

}