import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a circle and set its properties
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        // circle.setStroke(Color.RED);
        // circle.setFill(Color.WHITE);
        circle.setStyle("-fx-fill: yellow; -fx-stroke: green; -fx-stroke-width: 5;");
        //If an incorrect JavaFX CSS is used, your program will still compile and run, but the style will be ignored.
        //docs.oracle.com/javafx/2/api/javafx/scene/doc-files/cssref.html
        
        // Create a pane to hold the circle
        Pane pane = new Pane();
        pane.getChildren().add(circle);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setTitle("ShowCircle"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage
    }
}