package Logic;

import java.util.ArrayList;

public class IdealFoodController {
    ArrayList<String> selectedIngredients;

    public IdealFoodController() {
        selectedIngredients = new ArrayList<>();
    }

    public void addIngredient(String name) {
        selectedIngredients.add(name);
    }

    public void selectIngredients(int id) {
        DatabaseController databaseController = new DatabaseController();
        ArrayList<Ingredient> listOfAllIngredients = databaseController.getAllIngredients();

        ArrayList<Ingredient> listOfSelectedIngredients = new ArrayList<>();

        for (int i = 0; i < listOfAllIngredients.size(); i++) {
            Ingredient ingredient = listOfAllIngredients.get(i);
            for (int j = 0; j < selectedIngredients.size(); j++) {
                if (ingredient.getName().equals(selectedIngredients.get(i)))
                    listOfSelectedIngredients.add(ingredient);
            }
        }

    }
}
