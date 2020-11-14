import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class JavaFxIntro extends Application{
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a scene and place a button in the scene
        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 500, 250);
        primaryStage.setTitle("MyJavaFX"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.setResizable(false); // Stop user from resizing the window
        primaryStage.show(); // Display the stage
        
        
    }
    /**
    * The main method is only needed for the IDE with limited
    * JavaFX support. Not needed for running from the command line.
    */
    // public static void main(String[] args) {
    //     Application.launch(args);
    // }
}