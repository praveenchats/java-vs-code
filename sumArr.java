class sumArr {
    public static void main(String[] args) {
        int arr[] = { 34, 56, 34, 23, 12 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}