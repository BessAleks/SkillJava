import java.security.Key;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class PhoneBook {
    public static void main(String[] args) {
        TreeMap<String, String> date = new TreeMap<>();
        date.put("Валера", "89605554488");
        date.put("Кислый", "89621111111");
        date.put("Кабан", "5555555");

        while (true) {
            System.out.println();
            System.out.println("Общее количество контактов в записной книжке: " + date.size());
            System.out.println("введите LIST чтобы увидеть список номеров.");
            System.out.println("Введите данные:");
            Scanner in = new Scanner(System.in);
            String command = in.nextLine();
            if (command.equals("LIST")) {
                System.out.println("Список данных:");
                for (String key : date.keySet())
                    System.out.println(key + " " + date.get(key));

            } else if (date.containsValue(command)) {
                System.out.println("Данный номер уже есть в базе: ");
                for (String k : date.keySet()) {
                    if (date.get(k).equals(command)) {
                        System.out.println(k +" " + command);
                    }
                }
            }
            else if (date.containsKey(command)){
                System.out.println("Данный контакт уже есть в базе: ");
                System.out.println(command + " " + date.get(command));
            }
            else if (!date.containsKey(command) || !date.containsValue(command)){
                if (command.matches("^[0-9]+$")){
                    System.out.println("Введите имя для введеного номера:");
                    Scanner n = new Scanner(System.in);
                    String name = in.nextLine();
                    date.put(name, command);
                }
                else {
                    System.out.println("Введите номер для введеного имени:");
                    Scanner p = new Scanner(System.in);
                    String phone = in.nextLine();
                    date.put(command,phone);
                }
            }

        }
    }
    }
