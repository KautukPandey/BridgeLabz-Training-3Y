public class Hospital_ManagementSystem {
    private static String hospitalName;
    private static int totalPatients = 0;

    private final String patientID;
    private String name;
    private int age;
    private String ailment;

    public Hospital_ManagementSystem(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    public static void setHospitalName(String name) {
        hospitalName = name;
    }

    public static int getTotalPatients() {
        return totalPatients;
    }

    public void displayPatientDetails() {
        if (this instanceof Hospital_ManagementSystem) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getAilment() {
        return ailment;
    }
    public String getPatientID() {
        return patientID;
    }

    public static void main(String[] args) {
        Hospital_ManagementSystem.setHospitalName("City Hospital");
        Hospital_ManagementSystem patient1 = new Hospital_ManagementSystem("Lathika", 30, "Flu", "P001");
        Hospital_ManagementSystem patient2 = new Hospital_ManagementSystem("Lidiya", 45, "Fracture", "P002");

        System.out.println("Total Patients Admitted: " + Hospital_ManagementSystem.getTotalPatients());
        patient1.displayPatientDetails();
        System.out.println();
        patient2.displayPatientDetails();
    }
}
