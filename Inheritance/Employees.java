
class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    double calculateBonus() {
        return salary * 0.10;
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }

    @Override
    double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }

    @Override
    double calculateBonus() {
        return salary * 0.15;
    }
}

class Intern extends Employee {
    String duration;

    Intern(String name, int id, double salary, String duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration);
    }

    @Override
    double calculateBonus() {
        return salary * 0.05;
    }
}

public class Employees {
    public static void main(String[] args) {
        Employee e1 = new Manager("Alice", 101, 90000, 10);
        Employee e2 = new Developer("Bob", 102, 70000, "Java");
        Employee e3 = new Intern("Charlie", 103, 20000, "6 months");

        e1.displayDetails();
        System.out.println("Bonus: " + e1.calculateBonus());
        System.out.println("------------------");

        e2.displayDetails();
        System.out.println("Bonus: " + e2.calculateBonus());
        System.out.println("------------------");

        e3.displayDetails();
        System.out.println("Bonus: " + e3.calculateBonus());
    }
}
