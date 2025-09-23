public class University_StudentManagement {
    private static String universityName;
    private static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private char grade;

    public University_StudentManagement(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void setUniversityName(String name) {
        universityName = name;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        if (this instanceof University_StudentManagement) {
            System.out.println("University Name: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }

    public void updateGrade(char newGrade) {
        if (this instanceof University_StudentManagement) {
            this.grade = newGrade;
            System.out.println("Grade updated to: " + newGrade);
        }
    }

    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public char getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        University_StudentManagement.setUniversityName("Global University");

        University_StudentManagement student1 = new University_StudentManagement("Hemashree", 101, 'A');
        University_StudentManagement student2 = new University_StudentManagement("Sharmila", 102, 'B');

        University_StudentManagement.displayTotalStudents();

        student1.displayStudentDetails();
        System.out.println();
        student2.displayStudentDetails();

        student2.updateGrade('A');
        System.out.println();

        student2.displayStudentDetails();
    }
}
