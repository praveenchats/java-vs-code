public class palindrom2 {
    public static void main(String[] args) {
        int num = 121, rev = 0, rem, temp;
        temp = num;
        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (num == rev) {
            System.out.println(num + " is palindrom ");

        } else {
            System.out.println(num + "is not palindrom");
        }
    }
}