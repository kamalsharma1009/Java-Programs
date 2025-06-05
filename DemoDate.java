import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;;
public class DemoDate {
    public static void main(String args[]) {
        Date date = new Date();
        System.out.println(date);

        LocalDate ldate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(ldate.format(formatter));
    }
}
