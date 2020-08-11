import core.Line;
import core.Station;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class RouteCalculatorTest extends TestCase {
    List<Station> route;
    StationIndex stationIndex = new StationIndex();
    RouteCalculator calculator;

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

        Stream.of(line1, line2, line3).forEach(stationIndex::addLine);
        Stream.of(route.get(0),route.get(1),route.get(2),route.get(3),route.get(4),route.get(5),route.get(6),route.get(7),route.get(8)).peek(s -> s.getLine().addStation(s)).forEach(stationIndex::addStation);

        stationIndex.addConnection(Stream.of(route.get(1), route.get(4)).collect(Collectors.toList()));
        stationIndex.addConnection(Stream.of(route.get(3), route.get(7)).collect(Collectors.toList()));
        stationIndex.getConnectedStations(route.get(1));
        stationIndex.getConnectedStations(route.get(3));

        calculator = new RouteCalculator(stationIndex);

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testGetShortestRoute() {
        List<Station> actual = calculator.getShortestRoute(route.get(0),route.get(2));
        List<Station> expected = new ArrayList<>(Arrays.asList(route.get(0),route.get(1),route.get(2)));
        assertEquals(expected,actual);
    }
    @Test
    public void testGetShortestRouteTwo() {
        List<Station> actual = calculator.getShortestRoute(route.get(0),route.get(5));
        List<Station> expected = new ArrayList<>(Arrays.asList(route.get(0),route.get(1),route.get(4),route.get(5)));
        assertEquals(expected,actual);
    }
    @Test
    public void testGetShortestRouteThree() {
        List<Station> actual = calculator.getShortestRoute(route.get(0),route.get(8));
        List<Station> expected = new ArrayList<>(Arrays.asList(route.get(0),route.get(1),route.get(4),route.get(3),route.get(7),route.get(8)));
        assertEquals(expected,actual);
    }

    @Test
    public void testCalculateDuration() {
        double actual = RouteCalculator.calculateDuration(route);
        double expected = 22.0;
        assertEquals(expected,actual);
    }

    }