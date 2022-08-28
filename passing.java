
//If Else clause pass or fail
import java.util.*;

public class passing {
    public static void main(String args[]) {
        int markObtained, passingMarks;
        passingMarks = 40;

        Scanner in = new Scanner(System.in);
        System.out.println("input:");

        markObtained = in.nextInt();
        if (markObtained >= passingMarks)
            System.out.println("you are passesd:" + markObtained);
        else
            System.out.println("you are unfortunatelly not passsed this exam sorry");

    }
}