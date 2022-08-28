// the basic salary of an employee is 12000. WAP in java to compute gross and net salary of that employee where HRA=15%, and DA=110% , PF=12%.

class Programme5 {
    public static void main(String[] args) {
        float Basic = 12000;
        float HRA, DA, PF, net_salary, gross_salary;
        HRA = (15.0f / 100) * Basic;
        DA = (110.0f / 100) * Basic;
        PF = (12.0f / 100) * Basic;
        net_salary = ((Basic + DA + HRA) - PF);
        gross_salary = Basic + HRA + DA;

        System.out.println("gross salary is:" + gross_salary);
        System.out.println("net salary is:" + net_salary);

    }
}