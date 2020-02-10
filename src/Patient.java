import java.util.Date;

public class Patient {
    int patientId;
    Date lastVisit;
    Patient(int _patientId) {
        patientId = _patientId;
    }
    void setLastVisit(Date _lastVisit) {
        lastVisit = _lastVisit;
    }
}
