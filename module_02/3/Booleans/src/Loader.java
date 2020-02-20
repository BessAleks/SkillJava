
public class Loader {
    public static void main(String[] args) {
        int milkAmount = 2; // ml
        int powderAmount = 5; // g
        int eggsCount = 3; // items
        int sugarAmount = 5; // g
        int oilAmount = 1; // ml
        int appleCount = 1; // item

        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        if (powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30) {
            System.out.println("Pancakes");
        } else {
            System.out.println("Not enough ingredients for Pancakes");
        }
        //milk - 300 ml, powder - 5 g, eggs - 5
        if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
            System.out.println("Omelette");
        } else {
            System.out.println("Not enough ingredients for Omelette");
        }
        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        if (appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4) {
            System.out.println("Apple pie");
        } else {
            System.out.println("Not enough ingredients for Apple pie");
        }
    }
}