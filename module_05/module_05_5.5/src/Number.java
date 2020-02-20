import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Number {
    public static void main(String[] args) {
        char[] chars = {'А', 'В', 'Е', 'К', 'М', 'Н', 'О', 'Р', 'С', 'Т', 'Х', 'У'};
        int id = 1;
        ArrayList<String> numbers = new ArrayList<>();
        for (int i = 0; i < chars.length; i++){
            for (double j = 0.01; j <= 9.99; j = j + 0.01){
                for (double k = 0.1; k <= 19.7; k = k + 0.1){
                    numbers.add((chars[i] + Double.toString(BigDecimal.valueOf(j).setScale(3, RoundingMode.HALF_UP).doubleValue()) + chars[i] + chars[i] + Double.toString(BigDecimal.valueOf(k).setScale(3, RoundingMode.HALF_UP).doubleValue())).replaceAll("\\.",""));
                    for (int m = 0; m < numbers.size(); m++) {

                    }
                }
            }
        }
        System.out.println("Количество блатных номеров: " + numbers.size());
        while (true) {
            System.out.println("Введите искомый номер:");
            Scanner in = new Scanner(System.in);
            String command = in.nextLine();

            long nano_startTime_one  = System.nanoTime();
            if (numbers.contains(command)) {
                long nano_endTime_one = System.nanoTime();
                System.out.println("Номер найден! " + command + " Поиск перебором: поиск занял " + (nano_endTime_one - nano_startTime_one) + " нс");
            } else {
                long nano_endTime_one = System.nanoTime();
                System.out.println("Номер не блатной!" + " Поиск перебором: поиск занял " + (nano_endTime_one - nano_startTime_one) + " нс");
            }

            Collections.sort(numbers);
            long nano_startTime_two  = System.nanoTime();
            int index = Collections.binarySearch(numbers,command);
                long nano_endTime_two = System.nanoTime();
                if (index > 0) {
                    System.out.println("Номер найден! " + command + " Бинарным поиском по сортированному ArrayList: поиск занял " + (nano_endTime_two - nano_startTime_two) + " нс");
                }
            else{
                System.out.println("Номер не блатной!" + " Бинарным поиском по сортированному ArrayList: поиск занял " + (nano_endTime_two - nano_startTime_two) + " нс");
            }

            //long nano_startTime_three  = System.nanoTime();
            Set<String> set = new HashSet(numbers);
            long nano_startTime_three  = System.nanoTime();
            if (set.contains(command)){
                long nano_endTime_three  = System.nanoTime();
                System.out.println("Номер найден! " + command + " Поиском в HashSet: поиск занял " + (nano_endTime_three - nano_startTime_three) + " нс");
            }
            else {
                long nano_endTime_three  = System.nanoTime();
                System.out.println("Номер не блатной!" + " Поиском в HashSet: поиск занял " + (nano_endTime_three - nano_startTime_three) + " нс");
            }

            //long nano_startTime_four  = System.nanoTime();
            Set<String> s = new TreeSet(numbers);
            long nano_startTime_four  = System.nanoTime();
            if (s.contains(command)){
                long nano_endTime_four  = System.nanoTime();
                System.out.println("Номер найден! " + command + " Поиском в TreeSet: поиск занял " + (nano_endTime_four - nano_startTime_four) + " нс");
            }
            else {
                long nano_endTime_four  = System.nanoTime();
                System.out.println("Номер не блатной!" + " Поиском в TreeSet: поиск занял " + (nano_endTime_four - nano_startTime_four) + " нс");
            }
        }
    }
}