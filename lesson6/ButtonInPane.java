import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.scene.input.KeyEvent;
import javafx.scene.Cursor;

public class ButtonInPane extends Application {
    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        // Create a scene and place a button in the scene
        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("OK"));

        Scene scene = new Scene(pane, 200, 50);
        primaryStage.setTitle("Button in a pane"); // Set the stage title
        primaryStage.setScene(scene); // Place the scene in the stage

        // scene.setCursor(Cursor.OPEN_HAND);
        // scene.setCursor(Cursor.CLOSED_HAND);
        // scene.setCursor(Cursor.CROSSHAIR);
        // scene.setCursor(Cursor.DEFAULT);
        // scene.setCursor(Cursor.HAND);
        // scene.setCursor(Cursor.WAIT);
        // scene.setCursor(Cursor.H_RESIZE);
        // scene.setCursor(Cursor.V_RESIZE);
        // scene.setCursor(Cursor.MOVE);
        // scene.setCursor(Cursor.TEXT);

        // primaryStage.addEventHandler( KeyEvent.KEY_PRESSED, keyEventhandler(KeyEvent));
        primaryStage.show(); // Display the stage
    }

    // void keyEventhandler(event) {
    //      (event) -> {
    //         System.out.println("Key pressed: " + event.toString());
        
    //         switch(event.getCode().getCode()) {
    //             case 27 : { // 27 = ESC key
    //                 primaryStage.close();
    //                 break;
    //             }
    //             case 10 : { // 10 = Return
    //                 primaryStage.setWidth( primaryStage.getWidth() * 2);
    //                 break;
    //             }
    //             default:  {
    //                 System.out.println("Unrecognized key");
    //             }
    //         }
    //     }
    // }

    
}