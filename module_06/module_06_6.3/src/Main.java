import Bank.Client;
import Bank.CorporateBody;
import Bank.Ip;
import Bank.PrivatePerson;

public class Main {
    public static void main(String[] args) {
        Client one = new PrivatePerson ("20040080000000004523",10000);
        one.addMoney(100);
        System.out.println(one.getSum() + " руб.");


        Client two = new CorporateBody("20040080000000007788",10000);
        two.takeOffMoney(100000);
        System.out.println(two.getSum() + " руб.");
        two.setSum(1000000);

        Client three = new Ip("20040080000000005623",10000);
        three.addMoney(500);
        System.out.println(three.getSum());
    }
}
