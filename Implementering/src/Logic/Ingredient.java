package Logic;

public class Ingredient {
    private int id;
    private String name = "";
    private String unit = "g";
    private double amount = 100.0;
    private double calories = 0.0;
    private double protein = 0.0;
    private double fat = 0.0;
    private double carbohydrates = 0.0;

    public Ingredient(){}

    public Ingredient(int id, String name, double calories, double protein, double fat, double carbohydrates) {
        this.id = id;
        this.name = name;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
    }

    public void specifyIngredient(String name) {
        this.id = id;
        this.name = name;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.carbohydrates = carbohydrates;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", amount=" + amount +
                ", calories=" + calories +
                ", protein=" + protein +
                ", fat=" + fat +
                ", carbohydrates=" + carbohydrates +
                '}';
    }
}
