package chap2.item2;

import lombok.ToString;

@ToString
public class NutritionFacts {

    private static int count = 0;

    private final int id;
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

        this.id = count++;
    }

    private NutritionFacts(NutritionFactsBuilder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.carbs = builder.carbs;
        this.protein = builder.protein;

        this.id = count++;
    }

    public static class NutritionFactsBuilder implements GenericBuilder<NutritionFacts> {
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

        public NutritionFactsBuilder macros(int fat, int carbs, int protein) {
            this.fat = fat;
            this.carbs = carbs;
            this.protein = protein;
            return this;
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

        @Override
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }

    }
}
