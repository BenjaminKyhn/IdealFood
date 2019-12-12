package Logic;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseController {
    Connection connection = null;

    public DatabaseController() {
        // #1. Connect to the database
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/idealfood?serverTimezone=UTC",
                    "root",
                    ""
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Ingredient> getAllIngredients() {
        ArrayList<Ingredient> listOfAllIngredients = new ArrayList<>();
        String mitQuery = "SELECT * FROM ingredients;";
        try {
            Statement statement = connection.createStatement();
            // #3. Execute the statement and send the SQL-query to the SQL-server
            ResultSet resultSet = statement.executeQuery(mitQuery);
            // #4. Iterate through the results and print the results (vi har måske flere resultater end 1, derfor vil en løkke læse alle rækker ud fra resultSettet)
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double calories = resultSet.getDouble("calories");
                double protein = resultSet.getDouble("protein");
                double fat = resultSet.getDouble("fat");
                double carbohydrates = resultSet.getDouble("carbohydrates");
                Ingredient ingredient = new Ingredient(id, name, calories, protein, fat, carbohydrates);
                listOfAllIngredients.add(ingredient);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listOfAllIngredients;
    }

    public static void main(String[] args) {
        DatabaseController databaseController = new DatabaseController();
        System.out.println(databaseController.getAllIngredients());
    }
}
