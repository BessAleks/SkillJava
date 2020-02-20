import java.util.Scanner;
import java.util.TreeSet;

public class EmailList {
    public static void main(String[] args) {
        TreeSet <String> emailList = new TreeSet<>();
            emailList.add("valera@gj.com");
            emailList.add("snow@cat.com");
            emailList.add("vaska@cat.com");
            emailList.add("snezhanna@dog.ru");

        while (true) {
            int space = 0;
            int at = 0;
            int point = 0;
            System.out.println();
            System.out.println("LIST чтобы увидеть список email-ов.");
            System.out.println("ADD чтобы добавить email.");
            System.out.println("Введите команду:");
            Scanner in = new Scanner(System.in);
            String command = in.nextLine();

            for (char elements : command.toCharArray()) {
                if (elements == ' ') {
                    space++;
                }
                else if (elements == '@'){
                    at++;
                }
                else if (elements == '.'){
                    point++;
                }
            }
            String[] email = command.split("\\s");

                if ("LIST".equals(email[0])) {
                    System.out.println("Список email-ов:");
                    for (String word : emailList)
                        System.out.println(word);

                } else if ("ADD".equals(email[0]) && (space == 1) && (at == 1) && (point >= 1)) {
                    String[] mail = email[1].split("[.]");
                    if (mail[1].matches("^[a-z]+$")) {
                        emailList.add(email[1]);
                        System.out.println("email успешно добавлен!");
                    }
                    else {
                        System.out.println("Введена не корректная команда!");
                    }
                    } else {
                    System.out.println("Введена не корректная команда!");
                }
        }
    }
}
