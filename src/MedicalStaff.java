import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedicalStaff extends Staff{
    List<Integer> patientIds;
    MedicalStaff() {
        patientIds = new ArrayList<Integer>();
    }
    public void addPatientId(int _id) {
        Scanner input = new Scanner(System.in);
        patientIds.add(_id);
    }
}
