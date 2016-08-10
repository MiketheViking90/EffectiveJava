package chap2.i2considerbuilderwhenfacedwithmanyconstructorparams;

import lombok.ToString;

@ToString
public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int carbs;
    private final int protein;

    // Telescoping constructors
    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0, 0, 0, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0, 0, 0);
    }

    private NutritionFacts(int servingSize, int servings, int calories, int fat, int carbs, int protein) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.carbs = carbs;
        this.protein = protein;
    }

    // Builder pattern
    public static class NutritionFactsBuilder {
        private final int servingSize;
        private final int servings;

        private int calories = 0;
        private int fat = 0;
        private int carbs = 0;
        private int protein = 0;

        public NutritionFactsBuilder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public NutritionFactsBuilder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public NutritionFactsBuilder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public NutritionFactsBuilder carbs(int carbs) {
            this.carbs = carbs;
            return this;
        }

        public NutritionFactsBuilder protein(int protein) {
            this.protein = protein;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(servingSize, servings, calories, fat, carbs, protein);
        }

    }
}
