package chap8.item48;

import java.math.BigDecimal;

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

    private static void bigDecimalExactArithmetic() {
        BigDecimal funds = new BigDecimal(1.00);
        int itemsBought = 0;

        BigDecimal tenCents = BigDecimal.valueOf(.10);
        for (BigDecimal price = tenCents;
             funds.compareTo(price) >= 0;
             price = price.add(tenCents)) {
            funds = funds.subtract(price);
            itemsBought++;
        }

        System.out.println("bought: " + itemsBought + " items");
        System.out.println(funds + "$ in change");
    }

    public static void main(String[] args) {
        //floatingPointArithmetic();
        bigDecimalExactArithmetic();
    }
}
