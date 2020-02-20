import java.util.Scanner;
import java.util.regex.Pattern;

public class Surname {
    public static void main(String[] args) {
        while (true){
            int space = 0;
        int dash = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ФИО:");
        String text = in.nextLine();
        for (char elements : text.toCharArray()) {
            if (elements == ' ') {
                space++;
            } else if (elements == '-') {
                dash++;
            }
        }

        String[] text2 = text.split("[\\s,\\-]");
        for (int i = 0; i < text2.length; i++) {
            for (int k = 1; k < text2[i].length(); k++) {
                for (int m = 0; m < text2.length - 1; m++) {
                    int j = text2.length - 1;
                    if ((space == 3 || space == 2) && (dash <= 1) && (text2[i].matches("^[А-Яа-я,-]+$")) && ((Character.isUpperCase(text2[i].charAt(0))) || ((Character.isUpperCase(text2[m].charAt(0))) && (Character.isLowerCase(text2[j].charAt(0))))) && (Character.isLowerCase(text2[i].charAt(k)))) {

                    } else {
                        System.out.println("Введен не корректный формат ФИО! Ошибка в " + text2[i]);
                        System.exit(0);
                    }
                }
            }
            System.out.println(text2[i]);
        }
    }
    }
}








