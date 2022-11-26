public class Demo {
    public static void main(String[] args) {
//        Developer dev1 = new Developer(100, "Lokesh Sharma", "Pro Developer");
//        Developer dev2 = new Developer(101, "Vinay Sharma", "Developer");
//        CompanyDirector engDirectory = new CompanyDirector();
//        engDirectory.addEmployee(dev1);
//        engDirectory.addEmployee(dev2);
//
//        Manager man1 = new Manager(200, "Kushagra Garg", "SEO Manager");
//        Manager man2 = new Manager(201, "Vikram Sharma ", "Kushagra's Manager");
//
//        CompanyDirector accDirectory = new CompanyDirector();
//        accDirectory.addEmployee(man1);
//        accDirectory.addEmployee(man2);
//
//        CompanyDirector directory = new CompanyDirector();
//        directory.addEmployee(engDirectory);
//        directory.addEmployee(accDirectory);
//        directory.showEmployeeDetails();
//
//
//        dev1.SetNextApprover(dev2);
//        dev2.SetNextApprover(man1);
//        man1.SetNextApprover(man2);
//        dev1.ApproveWork(new Work(50000));
//        dev1.ApproveWork(new Work(200000));
//        dev1.ApproveWork(new Work(500000));
//        dev1.ApproveWork(new Work(700000));

        Developer dev1 = new Developer(100, "Lokesh Sharma", "Pro Developer");
        Developer dev2 = new Developer(101, "Vinay Sharma", "Developer");
        Manager man1 = new Manager(200, "Kushagra Garg", "SEO Manager");
        Manager man2 = new Manager(201, "Vikram Sharma ", "Kushagra's Manager");
        CompanyDirector director = CompanyDirector.getInstance();
        director.addEmployeeManager(dev1,man1);
        director.addEmployeeManager(dev2,man2);
        director.addEmployee(man1);
        director.addEmployee(man2);
        director.showEmployeeDetails();
        dev1.nextApprover = man1;
        man1.nextApprover= director;
        Work w = new Work(100000);
        dev1.ApproveWork(w);


    }
}
