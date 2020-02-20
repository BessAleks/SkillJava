public class Main2 {
    public static void main(String[] args) {
        int vasayAge = 11; // Лет Васе
        int katyAge = 3; // Лет Кате
        int mishaAge = 27; // Лет Мише

        int min = -1;
        int middle = -1;
        int max = -1;

        if (vasayAge > katyAge) {
            max = vasayAge;
        } else {
            max = katyAge;
        }
        if (max < mishaAge) {
            max = mishaAge;
        }

        if (vasayAge < katyAge) {
            min = vasayAge;
        } else {
            min = katyAge;
        }
        if (min > mishaAge) {
            min = mishaAge;
        }

        if ((vasayAge == max || vasayAge == min) && (katyAge == max || katyAge == min)) {
            middle = mishaAge;
        }
        if ((mishaAge == max || mishaAge == min) && (katyAge == max || katyAge == min)) {
            middle = vasayAge;
        }
        if ((vasayAge == max || vasayAge == min) && (mishaAge == max || mishaAge == min)) {
            middle = katyAge;
        }

        // Система проверки
        boolean a = min < middle && min < max;
        boolean b = middle < max && middle > min;
        boolean c = max > middle && max > min;

        if (a && b && c) {
            System.out.println("Максимальный возраст: " + max);
            System.out.println("Средний возраст: " + middle);
            System.out.println("Минимальный возраст: " + min);
        } else {
            System.out.println("Условия не прошли проверку!");
        }
    }
}




