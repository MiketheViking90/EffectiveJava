package chap2.item2;

import chap2.item2.NutritionFacts.NutritionFactsBuilder;

public class Shopper {

    void shop() {
        NutritionFactsBuilder builder = new NutritionFactsBuilder(4, 2);
        builder.fat(12);
        builder.calories(200);

        NutritionFacts facts = builder.build();
        NutritionFacts facts2 = builder.build();
        System.out.println(facts);
    }

    public static void main(String[] args) {
        Shopper shopper = new Shopper();
        shopper.shop();
    }
}
