import java.util.Scanner;//

public class Main //
{
    private static int minIncome = 200000; // Задаем переменную для минимальных доходов компании
    private static int maxIncome = 900000; // Задаем переменную для максимальных доходов компании

    private static int officeRentCharge = 140000; // Задаем переменную для расходов на аренду
    private static int telephonyCharge = 12000; // Задаем переменную для затрат на телефон
    private static int internetAccessCharge = 7200; // Задаем переменную для затрат на интернет

    private static int assistantSalary = 45000; // Задаем переменную для зп ассистента
    private static int financeManagerSalary = 90000; // Задаем переменную для зп бухгалтера

    private static double mainTaxPercent = 0.24; // Задаем переменную для налога
    private static double managerPercent = 0.15; // Задаем переменную для процента с продаж менеджера

    private static double minInvestmentsAmount = 100000; // Задаем минимальную сумму для инвестиций

    public static void main(String[] args)// Создаем метод
    {
        while (true)// Создаем цикл
        {
            System.out.println("Введите сумму доходов компании за месяц " +
                    "(от 200 до 900 тысяч рублей): ");// Выводим на печать текс
            int income = (new Scanner(System.in)).nextInt();// Команда для получения данных от пользователя через командную стороку

            if (!checkIncomeRange(income)) {// Проверяем данные введеные пользователем. Попадают ли эти данные в заданные границы.
                continue;// Если данные совпадают- продолжаем расчеты.
            }

            double managerSalary = income * managerPercent;// Считает зп менеджеру
            double pureIncome = income - managerSalary -
                    calculateFixedCharges();//Считает прибыль облогаемую налогом
            double taxAmount = mainTaxPercent * pureIncome;//Считает налог на прибыль
            double pureIncomeAfterTax = pureIncome - taxAmount;//Считает чистый доход без налога
            double minLnCome = (calculateFixedCharges() + (mainTaxPercent * minInvestmentsAmount / (1 - mainTaxPercent)) + minInvestmentsAmount) / (1 - managerPercent);//Формула для расчета минимально дохода, при котором можно инвестировать
            boolean canMakeInvestments = pureIncomeAfterTax >=
                    minInvestmentsAmount;//задается условие для возможности инвестировать


            System.out.println("Зарплата менеджера: " + managerSalary);// Печатает сумму зп менеджера
            System.out.println("Общая сумма налогов: " +
                    (taxAmount > 0 ? taxAmount : 0));//Печатает 0 если налог меньше 0, и сумму налога, если больше
            System.out.println("Компания может инвестировать: " +
                    (canMakeInvestments ? "да" : "нет"));//Печатает да, если булево значение истина, и нет, если ложь
            System.out.println("Минимальная сумма дохода компании для инвестиций: " + minLnCome);// Печать

            if (pureIncome < 0) {
                System.out.println("Бюджет в минусе! Нужно срочно зарабатывать!");// Печатает текст при условии что прибыль отрицательная
            }
        }
    }

    private static boolean checkIncomeRange(int income)// Создаем метод для числа введеного пользователем
    {
        if (income < minIncome)//Сравниваем введеное число и минимальную границу
        {
            System.out.println("Доход меньше нижней границы");//Печатаем текст
            return false;//Если условие не выполнены, то возвращаем ложь
        }
        if (income > maxIncome)//Сравниваем введеное число и максимальную границу
        {
            System.out.println("Доход выше верхней границы");//Печатаем текст
            return false;//Если условие не выполнены, то возвращаем ложь
        }
        return true;// Отправляет разрешение для while запустить цикл заново.
    }

    private static int calculateFixedCharges()//считает постоянные затраты
    {
        return officeRentCharge +
                telephonyCharge +
                internetAccessCharge +
                assistantSalary +
                financeManagerSalary;// Считает фиксированные траты компании
    }
}
