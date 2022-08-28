import java.util.*;

class Biggest {
    static void printSubStr(String str, int low, int high) {
        for (int i = low; i <= high; ++i)
            System.out.print(str.charAt(i));
    }

    static boolean longestPalSubstr(String str) {
        int n = str.length();
        int maxLength = 1, start = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                int flag = 1;
                for (int k = 0; k < (j - i + 1) / 2; k++)
                    if (str.charAt(i + k) != str.charAt(j - k))
                        flag = 0;
                if (flag != 0 && (j - i + 1) > maxLength) {
                    start = i;
                    maxLength = j - i + 1;
                }
            }
        }
        printSubStr(str, start, start + maxLength - 1);

        return false;
    }

    public static void main(String[] args) {
        String str = "Praveen";
        System.out.println(longestPalSubstr(str));
    }
}