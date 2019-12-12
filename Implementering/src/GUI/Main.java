package GUI;


import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {

    @FXML
    private AnchorPane uber;
    @FXML
    private ImageView imView;

    @FXML

    public Button findRecipiesButton;
    public Button storeIngredientButton;


    @Override

    public void start(Stage primaryStage) throws Exception{
        Stage root = FXMLLoader.load(getClass().getResource("start.fxml"));
        root.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

    public void popupChooseIngredients (javafx.event.ActionEvent actionEvent) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("chooseIngredients.fxml"));
        Stage root = fxmlLoader.load();
        root.show();

    }

    public void popupStoreIngredient (javafx.event.ActionEvent actionEvent) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("storeIngredient.fxml"));
        Stage root = fxmlLoader.load();
        root.show();
    }
    public void closeStoreIngredientsPopup() {
        Stage stage = (Stage) storeIngredientButton.getScene().getWindow();
        stage.close();
    }


    public void changeSceneCloseChooseIngredientsPopup() {
        Stage stage = (Stage) findRecipiesButton.getScene().getWindow();
        stage.close();
    }




}
