import java.util.ArrayList;
import java.util.List;

public class Manager extends WorkApprover implements Employee
{
    private String name;
    private long empId;
    private String position;

    public String getName() {
        return name;
    }

    public long getEmpId() {
        return empId;
    }

    public String getPosition() {
        return position;
    }



    public Manager(long empId, String name, String position)
    {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    public Manager(long empId, String name, String position,List<Employee> elist)
    {
        this.empId = empId;
        this.name = name;
        this.position = position;
        this.employeeList =  elist;
    }

    Manager(List<Employee> elist){
        this.employeeList = elist;
    }

    private List<Employee> employeeList = new ArrayList<Employee>();

    @Override
    public void showEmployeeDetails()
    {
        System.out.println(empId+" " +name);
        for(Employee emp:employeeList)
        {
            emp.showEmployeeDetails();
        }
    }

   List<Employee> getListManager(){
        return employeeList;
    }


    @Override
    public void ApproveWork(Work i) {
        if (i.getAmount() <= 1000)
            System.out.println("Work approved by the Manager: " + this.name);
        else{
            nextApprover.ApproveWork(new Work(i.getAmount()/100));
        }

    }
}
