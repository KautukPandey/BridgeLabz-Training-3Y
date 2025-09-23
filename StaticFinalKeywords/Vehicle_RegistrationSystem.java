public class Vehicle_RegistrationSystem {
    private static double registrationFee = 100.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle_RegistrationSystem(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0.0) {
            registrationFee = newFee;
        }
    }

    public void displayRegistrationDetails() {
        if (this instanceof Vehicle_RegistrationSystem) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: $" + registrationFee);
        }
    }

    public String getOwnerName() {
        return ownerName;
    }
    public String getVehicleType() {
        return vehicleType;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public static void main(String[] args) {
        Vehicle_RegistrationSystem.updateRegistrationFee(150.0);

        Vehicle_RegistrationSystem vehicle1 = new Vehicle_RegistrationSystem("Honest raj", "Sedan", "ABC123");
        Vehicle_RegistrationSystem vehicle2 = new Vehicle_RegistrationSystem("Price danish", "SUV", "XYZ789");

        vehicle1.displayRegistrationDetails();
        System.out.println();
        vehicle2.displayRegistrationDetails();
    }
}
