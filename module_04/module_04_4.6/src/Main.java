import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static  int i = 1;
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy EEEE");
        Calendar calendarNow = new GregorianCalendar();
        Calendar calendar = new GregorianCalendar(1989, Calendar.JUNE , 22);
        Date date = calendar.getTime();
        Date dateNow = calendarNow.getTime();
        System.out.println("Текущая дата: " + dateFormat.format(dateNow));
        System.out.println("Дата моего рождения: " + dateFormat.format(date));
        while (calendar.before(calendarNow)) {
            calendar.add(Calendar.YEAR, +1);
            System.out.println(i + " год " + dateFormat.format(calendar.getTime()));
            i += 1;
        }
        }
   }
