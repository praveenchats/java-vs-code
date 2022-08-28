//Given an array arr[] of n elements, write a function to search a given element x in arr[]

class LinearSearch {
    public static int search(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 80, 30, 60, 50, 110, 100, 130, 170 };

        int x = 10;
        int result = search(arr, x);
        if (result == -1)
            System.out.print("x is not present in arr[]");
        else
            System.out.print("Element x is present at index " + result);
    }
}