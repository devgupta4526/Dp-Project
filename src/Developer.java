public class Developer extends WorkApprover implements Employee
{
    private String name;
    private long empId;
    private String position;

    public Developer(long empId, String name, String position)
    {
        this.empId = empId;
        this.name = name;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails()
    {
        System.out.println(empId+" " +name);
    }

    @Override
    public void ApproveWork(Work i) {
        if (i.getAmount() <= 100)
            System.out.println("Work of " + i.getAmount() + " approved by the Developer");
        else
            nextApprover.ApproveWork(i);
    }
}