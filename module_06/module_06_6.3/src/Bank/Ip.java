package Bank;

public class Ip extends Client {
    static double MIN_SUM = 1000;
    public Ip(String number, double sum) {
        super(number, sum);
    }

    @Override
    public void addMoney(double amount) {
        if (amount < MIN_SUM){
            sum = sum + amount - (amount * 0.01);
        }
        else if (amount >= MIN_SUM){
            sum = sum + amount - (amount * 0.005);
        }
    }

    @Override
    public void takeOffMoney(double amount) {
        sum = sum - amount;
    }
}
