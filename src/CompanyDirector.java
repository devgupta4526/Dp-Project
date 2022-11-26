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

    public void addEmployeeManager(Employee emp , Manager manager){
        String name = manager.getName();
        String pos = manager.getPosition();
        long id = manager.getEmpId();
       List<Employee> listMan = manager.getListManager();
       listMan.add(emp);
       manager = new Manager(id,name,pos,listMan);
    }

    @Override
    public void ApproveWork(Work i) {
        if (i.getAmount() <= 150000)
            System.out.println("Work of " + i.getAmount() + " approved by the Company Director");
        else
            System.out.println("Work is not approved by the Company Director");
    }
}
