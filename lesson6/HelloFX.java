import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

public class HelloFX extends Application {

    @Override //Overriding the start method in Application
    public void start(Stage stage) {

        Label label = new Label("Hello World");
        VBox vBox = new VBox(label);
        Scene scene = new Scene(vBox);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}