import javax.print.attribute.standard.Media;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FaisalHospital {
    List<Patient> patients;
    List<MedicalStaff> medicalStaff;
    List<Technician> technicians;
    public static FaisalHospital hospital;
    public static FaisalHospital getInstance() {
        //Singleton Pattern
        if (hospital == null)
            hospital = new FaisalHospital();
        return hospital;
    }
    FaisalHospital() {
        getInstance();
    }
    public void addPatient() {
        if (patients == null)
            patients = new ArrayList<Patient>();
        Scanner input = new Scanner(System.in);
        input.nextLine();
    }
    public void addTechnicians() {

    }
    public void addMedicalStaff(int _id) {
        medicalStaff.add(new MedicalStaff());
    }
}
