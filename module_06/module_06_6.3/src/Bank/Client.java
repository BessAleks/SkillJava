package Bank;

public abstract class Client {
    public String number;
    public double sum;

    public Client(String number, double sum) {
        this.number = number;
        this.sum = sum;
    }

    abstract  public void addMoney(double amount);
    abstract public void takeOffMoney (double amount);

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getSum() {
        System.out.print("Сумма на счете " + number + " : ");
        if (sum < 0) {
            System.out.print("ВНИМАНИЕ! ОТРИЦАТЕЛЬНЫЙ БАЛАНС ");
            return sum;
        }
        else {
            return sum;
        }
    }

    public void setSum(double sum) {
        System.out.println("ВНИМАНИЕ! КОРРЕКТИРОВКА БАЛАНСА " + getNumber() + " !" );
        this.sum = sum;
    }
}
