import java.util.Scanner;

public class PhoneNumberCleaner2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите телефона в любом формате:");
        String text = in.nextLine();
            String formattedPhone = text.replaceAll("[^0-9]", "").replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "+$1 ($2) $3-$4-$5");
            System.out.println(formattedPhone);
    }
}
