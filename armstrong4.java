class armstrong4 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int num = 121, rem, temp, res = 0;
        temp = num;
        while (temp != 0) {
            rem = temp % 10;
            res += Math.pow(rem, 3);
            temp = temp / 10;
        }
        if (res == num)
            System.out.println(num + "Is palindrom");

        else
            System.out.println(num + "Is not palindrom");
    }
}