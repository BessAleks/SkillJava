
public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(text.length() + " символов в тексте");
        String text5 = " рублей.";

        int Index1 = text.indexOf('5');
        String text1 = text.substring(Index1);
        int spaceIndex = text1.indexOf(' ');
        String text2 = text1.substring(0,spaceIndex);
        int intNumber1 = Integer.parseInt(text2);
        System.out.println("Вася заработал: " + intNumber1 + text5);

        int Index2 = text.lastIndexOf('3');
        String text3 = text.substring(Index2);
        int spaceIndex2 = text3.indexOf(' ');
        String text4 = text3.substring(0,spaceIndex2);
        int intNumber2 = Integer.parseInt(text4);
        System.out.println("Маша заработала: " + intNumber2 + text5);
        int sum = intNumber1 + intNumber2;
        System.out.println("Сумма заработка Васи и Маши составила: " + sum + text5);
    }
}