import core.Line;
import core.Station;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RouteCalculatorTest extends TestCase {
    List<Station> route;
    StationIndex stationIndex = new StationIndex();

    @Before
    public void setUp() throws Exception {
        route = new ArrayList<>();

        Line line1 = new Line(1,"First");
        Line line2 = new Line(2,"Second");
        Line line3 = new Line(3,"Third");

        route.add(new Station("Первая(1)",line1));
        route.add(new Station("Вторая(1)",line1));
        route.add(new Station("Третья(1)",line1));
        route.add(new Station("Четвертая(2)",line2));
        route.add(new Station("Пятая(2)",line2));
        route.add(new Station("Шестая(2)",line2));
        route.add(new Station("Седьмая(3)",line3));
        route.add(new Station("Восьмая(3)",line3));
        route.add(new Station("Девятая(3)",line3));

        stationIndex.addLine(line1);
        //stationIndex.addLine(line2);
        //stationIndex.addLine(line3);

        for (Station station : route) {
        stationIndex.addStation(station);
        }
        for (Station station : stationIndex.stations) {
            List <Station> st = new ArrayList<>();

            for (Station stationTwo : stationIndex.stations) {
            if(station.getLine().equals(stationTwo.getLine())){
                st.add(stationTwo);
            }
            if((station.getName().equals("Вторая(1)") && stationTwo.getName().equals("Пятая(2)")) || (station.getName().equals("Четвертая(2)") && stationTwo.getName().equals("Восьмая(3)"))){
                st.add(stationTwo);
            }
            }
            stationIndex.addConnection(st);
        }
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetShortestRoute() {
        List<Station> actual = new RouteCalculator(stationIndex).getShortestRoute(route.get(0),route.get(2));
        List<Station> expected = new ArrayList<>(Arrays.asList(route.get(0),route.get(1),route.get(2)));
        assertEquals(expected,actual);
    }

    @Test
    public void testCalculateDuration() {
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 22.0;
        assertEquals(expected,actual);
    }

    }