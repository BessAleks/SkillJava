import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader
{
    public static void main(String[] args)
    {
        int sum = 0;
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей.";
        String numbers = (text.replaceAll("[^0-9]"," ")).trim();
        String[] text2 = numbers.split("\\s+");
        for (int i = 0; i < text2.length; i++){
            sum += Integer.parseInt(text2[i] + "");
            System.out.println(i+1 + " сумма: " + text2[i] + " рублей.");
        }
        System.out.println("Общая сумма заработка: " + sum);
    }
}