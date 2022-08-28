package com.Ankit.StringProgram;

public class StrOperation {
    public static void main(String[] args) {
        String name = "nEeLiMa";
        System.out.println("String: " + name);
        int value = name.length();
        System.out.println("Length of the String: " + value);

        //Lower Case
        String lowerS = name.toLowerCase();
        System.out.println("Lower case: " + lowerS);

        //Upper Case
        String upperS = name.toUpperCase();
        System.out.println("Upper case: " + upperS);

        //Reverse of the string
        char[] rev = name.toCharArray();
        for (int i = rev.length - 1; i >= 0; i--) {

            System.out.print(rev[i]);
        }
        //Comparing two Strings
        String s1 = "kiit";
        String s2 = "KIIT";

        System.out.println(s1.equals(s2));           //false
        System.out.println(s1.equalsIgnoreCase(s2));//true


        //Concatenating Strings

        String a = new String("KIIT");
        String b = new String(" UNIVERSITY");
        String s = String.format("%s%s", a, b);

        System.out.println("Insert: " + s.toString());
    }