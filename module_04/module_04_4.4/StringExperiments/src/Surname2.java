import java.util.Scanner;

public class Surname2 {
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
            int spaceIndex1 = text.indexOf(' ');
            String text1 = text.substring(0, spaceIndex1);
            int spaceIndex2 = text.lastIndexOf(' ');
            String text2 = (text.substring(spaceIndex1, spaceIndex2)).trim();
            String text3 = (text.substring(spaceIndex2)).trim();
            System.out.println(text1);
            System.out.println(text2);
            System.out.println(text3);
        }
        else {
            System.out.println("Введен не корректный формат ФИО!");
        }
    }
}
