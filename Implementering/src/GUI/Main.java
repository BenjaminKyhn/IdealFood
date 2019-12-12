package GUI;


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

    @Override

    public void start(Stage primaryStage) throws Exception{
        Stage root = FXMLLoader.load(getClass().getResource("start.fxml"));
        root.show();
//        primaryStage.setTitle("IdealFood");
//        primaryStage.setScene(new Scene(root, 546, 822));
//        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public void popupChooseIngredients (javafx.event.ActionEvent actionEvent) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("chooseIngredients.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();

        stage.setTitle("Choose Ingredients");
        stage.setScene(new Scene(root1));
        stage.show();



    }



    @FXML
    private TableColumn<TableSetterGetter, Logic.Ingredient> Ingredient;

    @FXML
    private TableColumn<TableSetterGetter, CheckBox> select;



}
