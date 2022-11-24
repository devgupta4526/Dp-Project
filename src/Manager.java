import java.util.ArrayList;
import java.util.List;

public class Manager extends WorkApprover implements Employee
{
    private String name;
    private long empId;
    private String position;

    public Manager(long empId, String name, String position)
    {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    private List<Employee> employeeList = new ArrayList<Employee>();

    @Override
    public void showEmployeeDetails()
    {
        for(Employee emp:employeeList)
        {
            emp.showEmployeeDetails();
        }
    }

    public void addEmployee(Employee emp)
    {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp)
    {
        employeeList.remove(emp);
    }

    @Override
    public void ApproveWork(Work i) {
        if (i.getAmount() <= 100000)
            System.out.println("Loan amount of " + i.getAmount() + " approved by the Company Director");
        else
            nextApprover.ApproveWork(i);
    }
}
