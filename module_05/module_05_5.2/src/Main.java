import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>() {{
            add("Первое дело");
            add("Второе дело");
            add("Третье дело");
            add("Четвертое дело");
        }};

        while (true) {
            System.out.println();
            System.out.println("LIST чтобы увидеть список дел.");
            System.out.println("ADD чтобы добавить дело.");
            System.out.println("EDIT чтобы заменить дело.");
            System.out.println("DELETE чтобы удалить дело.");
            System.out.println("Введите команду: ");
            Scanner in = new Scanner(System.in);
            String command = in.nextLine();
            String[] comToDo = command.split("\\s");

            if ("LIST".equals(comToDo[0])) {
                for (int i = 0; i < todoList.size(); i++) {
                    System.out.println((i + 1) + ". " + todoList.get(i));
                }
            }

            else if (("ADD".equals(comToDo[0])) && (Character.isLetter(comToDo[1].charAt(0)))) {
                    comToDo [0] = "";
                    todoList.add((Arrays.toString(comToDo).replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(",","")).trim());
                System.out.println("Дело успешно добавлено!");

            } else if (("ADD".equals(comToDo[0])) && (comToDo[1].matches("\\d"))) {
                int intNumber = Integer.parseInt(comToDo[1]);
                comToDo [0] = "";
                comToDo [1] = "";
                todoList.add(intNumber - 1,(Arrays.toString(comToDo).replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(",","")).trim());
                System.out.println("Дело успешно добавлено!");
            }
            else if (("EDIT".equals(comToDo[0])) && (comToDo[1].matches("\\d"))) {
                int intNumber = Integer.parseInt(comToDo[1]);
                    comToDo [0] = "";
                    comToDo [1] = "";
                    todoList.set(intNumber - 1,(Arrays.toString(comToDo).replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(",","")).trim());
                System.out.println("Дело успешно заменено!");
            }
            else if (("DELETE".equals(comToDo[0])) && (comToDo[1].matches("\\d"))) {
                int intNumber = Integer.parseInt(comToDo[1]);
                todoList.remove(intNumber - 1);
                System.out.println("Дело успешно удалено!");
            }
            else {
                System.out.println("Введена неправильная команда!");
            }
        }
    }
}
