class maxArr {
    public static void main(String[] args) {
        int arr[] = { 76, 98, 25, 91, 78 };
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}