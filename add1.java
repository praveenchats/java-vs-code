class add1 {

    int sum = 0;

    public static void main(String[] args) {
        int num1 = addition(5, 4);
        double num2 = addition(4.5, 5.6);
        System.out.println("int: " + num1);
        System.out.println("double: " + num2);

    }

    static int addition(int a, int b) {
        int sum = a + b;
        return sum;
    }

    static double addition(double d, double e) {
        return d + e;
    }
}