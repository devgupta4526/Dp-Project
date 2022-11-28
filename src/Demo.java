public class Demo {
    public static void main(String[] args) {

        //setup developer/leaf nodes
        Developer dev1 = new Developer(100, "Lokesh Sharma", "Pro Developer");
        Developer dev2 = new Developer(101, "Vinay Sharma", "Developer");
        Developer dev3 = new Developer(102, "Arun Sharma", "Jnr Developer");
        Developer dev4 = new Developer(103, "Vijay Sharma", "Developer");
        Developer dev5 = new Developer(104, "Lewis Sharma", "Sr Developer");
        Developer dev6 = new Developer(105, "Aditya Sharma", "Developer");

        //setup all managers
        Manager man1 = new Manager(200, "Kushagra Garg", "Team A manager");
        Manager man2 = new Manager(201, "Vikram Sharma ", "Team B Manager");
        Manager man3 = new Manager(202, "Vinayak Dubey", "A and B senior Manager");
        Manager man4 = new Manager(203, "Ajinkya Singh", "Director's Right Hand");


        CompanyDirector director = CompanyDirector.getInstance();

        //creating the organization structure
        director.addEmployeeManager(dev1,man1);
        director.addEmployeeManager(dev2,man1);
        director.addEmployeeManager(dev3,man2);
        director.addEmployeeManager(dev4,man2);
        director.addEmployeeManager(man1,man3);
        director.addEmployeeManager(man2,man3);
        director.addEmployeeManager(dev5,man4);
        director.addEmployeeManager(dev6,man4);
        director.addEmployee(man3);
        director.addEmployee(man4);
        director.showEmployeeDetails();

        //setting correct approver for each node
        dev1.nextApprover = man1;
        dev2.nextApprover = man1;
        man1.nextApprover = man3;

        dev3.nextApprover = man2;
        dev4.nextApprover = man2;
        man2.nextApprover = man3;

        man3.nextApprover = director;

        dev4.nextApprover = man4;
        dev5.nextApprover = man4;
        man4.nextApprover = director;

        Work w = new Work(1000);
        dev2.ApproveWork(w);

        w = new Work(100000);
        dev1.ApproveWork(w);

        w = new Work(15000);
        dev3.ApproveWork(w);

        w = new Work(200000);
        man1.ApproveWork(w);

        w = new Work(1000);
        dev5.ApproveWork(w);




    }
}
