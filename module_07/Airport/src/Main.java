import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    private static Date dateNow = new Date();
    private static Date dateNowPlusTwoHours = new Date(dateNow.getTime() + 7200000);

    public static void main(String[] args) {
Airport.getInstance().getTerminals().forEach(terminal -> terminal.getFlights().stream().filter(type-> type.getType().equals(Flight.Type.DEPARTURE)).filter(date-> date.getDate().after(dateNow) && date.getDate().before(dateNowPlusTwoHours)).forEach(x-> System.out.println(x.getDate() + " | " + x.getCode() + " | " + x.getAircraft().getModel())));
    }
}
