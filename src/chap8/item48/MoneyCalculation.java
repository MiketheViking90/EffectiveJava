package chap8.item48;

public class MoneyCalculation {

    private static void floatingPointArithmetic() {
        double funds = 1.00;
        int itemsBought = 0;

        for (double price = .10; funds >= price; price += .10) {
            itemsBought++;
            funds -= price;
        }

        System.out.println("bought: " + itemsBought + " items");
        System.out.println(funds + "$ in changes");
    }

    public static void main(String[] args) {
        floatingPointArithmetic();
    }
}
