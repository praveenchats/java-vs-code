import java.util.*;

public class Test1 {

    private static final Class<Number[]> NULL = null;

    public static Double addValues(double Number[])

    {

        Scanner sc = new Scanner(System.in);

        int i, sum = 0;

        System.out.println("Enter the values in the array");

        for (i = 1; i <= Number.length; i++)

        {

            Number[i] = sc.nextInt();

        }

        if (Number[].class == NULL)

            return null;

        else

            for (i = 1; i <= Number.length; i++)

            {

                sum = (int) (sum + Number[i]);

            }

        return (double) sum;

    }

}
