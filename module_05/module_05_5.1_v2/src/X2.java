import java.util.Scanner;// Подключаем класс Scanner

public class X2 {// Создаем новый класс
    public static void main(String args[]) {// Создаем новый мотод

        System.out.println("Введите размер креста:");// Выводим строчку в консоль
        int cross2Size = new Scanner(System.in).nextInt();// Получаем от пользователя данные для определения размеров

        System.out.println("Какой маркер использовать???");// Выводим строчку в консоль
        String symbol = new Scanner(System.in).nextLine();// Получаем от пользователя данные для определения символа

        StringBuilder crossStr = new StringBuilder();// Создаем новый объек класса представляющий последовательность символов

        for (int i = 0; i <cross2Size; i++) {// Задаем условия для цикла
            for (int j = 0; j <cross2Size; j++) {// Задаем условия для цикла
                crossStr.append(i + j == cross2Size - 1 || i == j ? symbol : " ".repeat(symbol.length()));// Условия заполнения строки
            }
            crossStr.append("\n");// Пропуск строки
        }

        System.out.println(crossStr.toString());// Выводим строчку в консоль
    }
}
