public class Course {
    String courseName;
    int duration;   // in months
    double fee;
    static String instituteName;

    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
        System.out.println("--------------------");
    }

    public static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        updateInstituteName("ABC Institute");

        Course c1 = new Course("Java Programming", 6, 5000);
        Course c2 = new Course("Web Development", 4, 4000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        updateInstituteName("XYZ Academy");  
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
