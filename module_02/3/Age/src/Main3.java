public class Main3 {
    public static void main(String[] args) {
        int vasayAge = 21; // Лет Васе
        int katyAge = 22; // Лет Кате
        int mishaAge = 20; // Лет Мише

        int min = -1;
        int middle = -1;
        int max = -1;
        int tmp;

        min = vasayAge;
        middle = katyAge;
        max = mishaAge;

        if (max > min) {
        } else {
            tmp = max;
            max = min;
            min = tmp;
        }
        if (max > middle) {
        } else {
            tmp = max;
            max = middle;
            middle = tmp;
        }
        if (middle > min) {
        } else {
            tmp = middle;
            middle = min;
            min = tmp;
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Среднее число равно: " + middle);
        System.out.println("Минимальное число равно: " + min);
    }
}
