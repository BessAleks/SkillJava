public class Main
{

    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;
        System.out.println(container.count);
        System.out.println(sumDigits(1111112));
    }

    public static Integer sumDigits(Integer number) {
        int sum = 0;
        String str = Integer.toString(number);
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(str.charAt(i) + "");
        }
        return sum;
    }
}
