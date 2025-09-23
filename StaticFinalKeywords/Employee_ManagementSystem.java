public class Employee_ManagementSystem {
    private static String companyName;
    private static int totalEmployees = 0;
    private String name;
    private final int id;
    private String designation;

    public Employee_ManagementSystem(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void setCompanyName(String name) {
        companyName = name;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        if (this instanceof Employee_ManagementSystem) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
        }
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getDesignation() {
        return designation;
    }

    public static void main(String[] args) {
        Employee_ManagementSystem.setCompanyName("Tech Solutions Inc.");

        Employee_ManagementSystem emp1 = new Employee_ManagementSystem("Thamarai", 101, "Software Engineer");
        Employee_ManagementSystem emp2 = new Employee_ManagementSystem("Rohan", 102, "Project Manager");

        Employee_ManagementSystem.displayTotalEmployees();

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
    }
}
