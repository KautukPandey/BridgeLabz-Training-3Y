
class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: " + (fee - (fee * discount / 100)));
    }
}

public class ECH{
    public static void main(String[] args) {
        Course c1 = new Course("Basic Java", 6);
        OnlineCourse c2 = new OnlineCourse("Advanced Java", 8, "Udemy", true);
        PaidOnlineCourse c3 = new PaidOnlineCourse("Spring Boot Masterclass", 10, "Coursera", true, 5000, 20);

        c1.displayInfo();
        System.out.println("------------------");
        c2.displayInfo();
        System.out.println("------------------");
        c3.displayInfo();
    }
}
