import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

public class Main
{
    private static String staffFile = "data/staff.txt";
    private static String dateFormat = "dd.MM.yyyy";
    private static String startYear2017 = "01.01.2017";
    private static String endYear2017 = "31.12.2017";
    private static Date dateStartYear2017 = null;
    private static Date dateEndYear2017 = null;

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        dateStartYear2017 = format.parse(startYear2017);
        dateEndYear2017 = format.parse(endYear2017);
        //=============Первый вариант сортировки по двум критериям =====================================================
        //ArrayList<Employee> staff = loadStaffFromFile();
        //Collections.sort(staff, (o1, o2) -> {
            //if (o1.getSalary().compareTo(o2.getSalary()) == 0) {
            //return o1.getName().compareTo(o2.getName());}
            //else {
            //return o1.getSalary().compareTo(o2.getSalary());
            //}
        //});
        //==============================================================================================================
        //=============Второй вариант сортировки по двум критериям =====================================================
        ArrayList<Employee> staff = loadStaffFromFile();
        Comparator<Employee> stafftwo = Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName);
        Collections.sort(staff, stafftwo);
        //==============================================================================================================
        for (Employee employee : staff ){
        System.out.println(employee);
}
        System.out.println();
        Stream <Employee> stream = staff.stream();
        //stream.filter(employee -> employee.getWorkStart().after(dateStartYear2017) && employee.getWorkStart().before(dateEndYear2017)).forEach(System.out :: println); Фильтр по дате приема на работу
        //staff.stream().max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out :: println); Нахождение максимального значения зарплаты

        (stream.filter(employee -> employee.getWorkStart().after(dateStartYear2017) && employee.getWorkStart().before(dateEndYear2017))).max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out :: println);

    }

    private static ArrayList<Employee> loadStaffFromFile()
    {
        ArrayList<Employee> staff = new ArrayList<>();
        try
        {
            List<String> lines = Files.readAllLines(Paths.get(staffFile));
            for(String line : lines)
            {
                String[] fragments = line.split("\t");
                if(fragments.length != 3) {
                    System.out.println("Wrong line: " + line);
                    continue;
                }
                staff.add(new Employee(
                    fragments[0],
                    Integer.parseInt(fragments[1]),
                    (new SimpleDateFormat(dateFormat)).parse(fragments[2])
                ));
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return staff;
    }
}