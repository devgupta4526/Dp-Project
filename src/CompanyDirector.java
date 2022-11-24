import java.util.ArrayList;
import java.util.List;

public class CompanyDirector extends WorkApprover implements Employee
{

    private static CompanyDirector companyDirector = null;
    private List<Employee> employeeList = new ArrayList<Employee>();

    private CompanyDirector(){


    }

    private CompanyDirector(List<Employee> l){
        this.employeeList = l;

    }

    public static CompanyDirector getInstance()
    {
//lazy initialization
        if (companyDirector== null)
            companyDirector = new CompanyDirector();
        return companyDirector;
    }

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
