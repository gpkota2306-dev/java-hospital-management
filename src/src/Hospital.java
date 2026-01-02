import java.util.ArrayList;

public class Hospital {
    public static void main(String[] args) {

        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<Doctor> doctors = new ArrayList<>();

        patients.add(new Patient(1, "Ravi", 25, "Fever"));
        patients.add(new Patient(2, "Anu", 30, "Cold"));

        doctors.add(new Doctor(1, "Dr. Kumar", "Physician"));
        doctors.add(new Doctor(2, "Dr. Meena", "ENT"));

        System.out.println("Patients List:");
        for (Patient p : patients) {
            p.display();
        }

        System.out.println("\nDoctors List:");
        for (Doctor d : doctors) {
            d.display();
        }
    }
}
