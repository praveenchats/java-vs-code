/*WAP in JAVA to input an amount in Rs through command line argument and find the minimum number of 2000, 500,
200, 100, 50, 20, 10, 5, 2 and 1 Rs denominations will be needed to have that amount.
Ex: Rs. 3868 => (2000*1) + (500*3) + (200*1) + (100*1) + (50*1) + (10*1) + (5*1) + (2*1) + (1*1)*/

import java.util.Scanner;
class amount{
    public static void main(String args[])
    {
        int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10, 5, 1 };
        int[] noteCounter = new int[9];

        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
      
        // count notes using Greedy approach
        for (int i = 0; i < 9; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }
      
        // Print notes
        System.out.println("Currency Count ->");
        for (int i = 0; i < 9; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                    + noteCounter[i]);
            }
        }
    }
}