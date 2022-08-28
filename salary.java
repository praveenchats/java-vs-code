/*WAP in JAVA to input basic salary and to compute Gross salary of an employee if salary is less than 12000 then HRA
will be 20%, and DA will be 115% of Basic salary otherwise HRA will be 15% and DA will be 90% of Basic salary.*/

import java.util.Scanner;
class salary{
    public static void main(String args[])
    {
        double basic_salary,gross_salary,HRA,DA;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter basic salary:");
        basic_salary=sc.nextFloat();
        if(basic_salary<12000)
        {
            HRA = 0.2 * basic_salary;
            DA = 1.15 * basic_salary;
            System.out.println("HRA:" + HRA);
            System.out.println("DA:" + DA);
        }
        else{
            HRA = 0.15 * basic_salary;
            DA = 0.9 * basic_salary;
            System.out.println("HRA:" + HRA);
            System.out.println("DA:" + DA);
        }
        gross_salary = basic_salary + HRA + DA;
        System.out.println("GROSS:" + gross_salary);
    }
}