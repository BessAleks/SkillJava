import java.util.Scanner;

public class PhoneNumberCleaner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите телефона в любом формате:");
        String text = in.nextLine();
        String numbers = text.replaceAll("[^0-9]", "");
        if (numbers.length() == 11 && numbers.charAt(0) == '8') {
            String formattedPhone = numbers.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "+$1 ($2) $3-$4-$5");
            System.out.println("Формат номера телефона для внесения в БД: " + formattedPhone);
        }
        else if (numbers.length() == 11 && numbers.charAt(0) == '7') {
            String formattedPhone = numbers.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "+$1 ($2) $3-$4-$5");
            System.out.println("Формат номера телефона для внесения в БД: " + formattedPhone);
            System.out.println(numbers);
        }
        else if (numbers.length() == 10 && numbers.charAt(0) == '9') {
            String k = "7" + numbers;
            String formattedPhone = k.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "+$1 ($2) $3-$4-$5");
            System.out.println("Формат номера телефона для внесения в БД: " + formattedPhone);
        }
        else {
            System.out.println("Неверно введен номер!");
        }
    }
}
