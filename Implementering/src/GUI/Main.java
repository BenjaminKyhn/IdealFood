package GUI;

import Logic.Ingredient;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class Main extends Application {

    private Scene startScene;

    @Override

    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("GUI/Start.fxml"));
        primaryStage.setTitle("IdealFood");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }

    public void popupChooseIngredients ()

    /*@FXML
    private TableColumn<TableSetterGetter, Logic.Ingredient> Ingredient;

    @FXML
    private TableColumn<TableSetterGetter, CheckBox> select; */

    @FXML
    private TableView()

}
