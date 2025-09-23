public class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(501, "HR", 40000);
        e1.displayEmployeeDetails();

        e1.setSalary(45000);
        System.out.println("Updated Salary:");
        e1.displayEmployeeDetails();

        Manager m1 = new Manager(601, "IT", 70000, "Software Team");
        m1.displayManagerDetails();
    }
}

class Manager extends Employee {
    String team;

    Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    public void displayManagerDetails() {
        System.out.println("Manager ID: " + employeeID);    
        System.out.println("Department: " + department);    
        System.out.println("Team: " + team);
        System.out.println("--------------------");
    }
}
