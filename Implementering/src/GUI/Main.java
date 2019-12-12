package GUI;


import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

public class Main extends Application {

    private Scene startScene;
    private Scene chooseIngredientsScene;
    public Button findRecipiesButton;
    Stage stage = new Stage();

    @Override

    public void start(Stage primaryStage) throws Exception{
        Stage root = FXMLLoader.load(getClass().getResource("start.fxml"));
        root.show();
//      primaryStage.setTitle("IdealFood");
//      primaryStage.setScene(new Scene(root, 546, 822));
//      primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public void changeSceneToChooseIngredientsScene (javafx.event.ActionEvent actionEvent) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("chooseIngredients.fxml"));
        if(chooseIngredientsScene == null) {
            chooseIngredientsScene = new Scene(root);
        }

        Stage primaryStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        primaryStage.setScene(chooseIngredientsScene);
        primaryStage.show();
    }

    public void popupChooseIngredients(javafx.event.ActionEvent actionEvent) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("chooseIngredients.fxml"));
        Stage root = fxmlLoader.load();

        stage.setTitle("Choose Ingredients");
        root.show();

    }

    public void findRecipiesSaveButton() {


    }

    public void closePopup() {
        Stage stage = (Stage) findRecipiesButton.getScene().getWindow();
        stage.close();
    }







    @FXML
    private TableColumn<TableSetterGetter, Logic.Ingredient> Ingredient;

    @FXML
    private TableColumn<TableSetterGetter, CheckBox> select;



}
