package chap2.i2considerbuilderwhenfacedwithmanyconstructorparams;

import chap2.i2considerbuilderwhenfacedwithmanyconstructorparams.NutritionFacts.NutritionFactsBuilder;

public class Shopper {

    void shop() {
        NutritionFactsBuilder builder = new NutritionFactsBuilder(4, 2);
        builder.fat(12);
        builder.calories(200);

        NutritionFacts facts = builder.build();
        System.out.println(facts);
    }

    public static void main(String[] args) {
        Shopper shopper = new Shopper();
        shopper.shop();
    }
}
