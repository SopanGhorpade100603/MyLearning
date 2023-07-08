import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.time.LocalTime;

public class time {
    public static void main(String[] args) {
        // System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        LocalDate d = LocalDate.now();
        System.out.println(d);
        LocalTime t= LocalTime.now();
        System.out.println(t);
    }

}
