package GUI;


import Logic.IdealFoodController;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

public class Main extends Application {

    private Scene startScene;
    Stage stage = new Stage();

    @FXML
    private CheckBox checkbox1;
    @FXML
    private Button findRecipeButton;


    @Override
    public void start(Stage primaryStage) throws Exception {
//        Stage root = FXMLLoader.load(getClass().getResource("start.fxml"));
//        root.show();
//        primaryStage.setTitle("IdealFood");
//        primaryStage.setScene(new Scene(root, 546, 822));
//        primaryStage.show();

        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("GUI/start.fxml"));
        primaryStage.setTitle("IdealFood");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        /** Benjamin skal bruge det her senere */
//        IdealFoodController idealFoodController = new IdealFoodController();
//        checkbox1.setOnAction(actionEvent -> {
//            idealFoodController.addIngredient("checkbox1");
//        });
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void popupChooseIngredients(javafx.event.ActionEvent actionEvent) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("chooseIngredients.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        stage.setTitle("Choose Ingredients");
        stage.setScene(new Scene(root1));
        stage.show();
    }

//    public void selectIngredients(){
//        IdealFoodController idealFoodController = new IdealFoodController();
//        idealFoodController.addIngredient();
//    }
    //        IdealFoodController idealFoodController = new IdealFoodController();
//        checkbox1.setOnAction(actionEvent -> {
//            idealFoodController.addIngredient("checkbox1");
//        });

    @FXML
    private TableColumn<TableSetterGetter, Logic.Ingredient> Ingredient;

    @FXML
    private TableColumn<TableSetterGetter, CheckBox> select;


}
