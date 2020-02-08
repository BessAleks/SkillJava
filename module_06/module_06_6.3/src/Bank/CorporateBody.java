package Bank;

public class CorporateBody extends Client {
    public CorporateBody(String number, double sum) {
        super(number, sum);
    }

    @Override
    public void addMoney(double amount) {
        sum = sum + amount;
    }

    @Override
    public void takeOffMoney(double amount) {
    sum = sum - amount - (amount * 0.01);
    }
}
