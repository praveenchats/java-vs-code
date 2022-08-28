package com.Neelima.General;

public class Employee {
    protected int empid;
    private String ename;

    public Employee(int empid, String ename) {
        this.empid = empid;
        this.ename = ename;
    }

    public int earning(int basic){
        int DA = basic * 80/100;
        int HRA = basic * 15/100;
        int ans = basic + DA + HRA;

        return ans;

    }

}
package com.Neelima.Marketing;
import com.Neelima.General.Employee;