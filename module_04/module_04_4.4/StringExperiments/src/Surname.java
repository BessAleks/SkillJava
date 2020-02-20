import java.util.Scanner;

public class Surname {
    public static void main(String[] args) {
        int space = 0;
            Scanner in = new Scanner(System.in);
            System.out.println("Введите ФИО:");
            String text = in.nextLine();
            for (char elements : text.toCharArray()) {
            if (elements == ' ') {
                space++;
            }
        }
            if (space == 2) {
                String[] isbnParts = text.split(" ");
                System.out.println(isbnParts[0]);
                System.out.println(isbnParts[1]);
                System.out.println(isbnParts[2]);
            } else {
                System.out.println("Введен не корректный формат ФИО!");
            }
        }
}

