package Bank;

public class PrivatePerson extends Client {
    public PrivatePerson(String number, double sum) {
        super(number, sum);
    }

    @Override
    public void addMoney(double amount) {
        sum = sum + amount;
    }

    @Override
    public void takeOffMoney(double amount) {
        sum = sum - amount;
    }

}
