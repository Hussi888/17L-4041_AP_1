import java.time.LocalDateTime;
import java.util.Date;

public class Main {
    public static Date currentDate;
    public static void main(String args[]) {
        FaisalHospital hospital = FaisalHospital.getInstance();
        currentDate = java.util.Calendar.getInstance().getTime();

    }
}
