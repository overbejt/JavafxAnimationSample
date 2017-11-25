
package animationsample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class AnimationSample extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Circle cir = new Circle();
        cir.setFill(Color.CADETBLUE);
        cir.setRadius(30);
        cir.relocate(15,15);
        
        Pane root = new Pane();
        root.getChildren().add(cir);
        
        Scene scene = new Scene(root, 600, 600);
        
        primaryStage.setTitle("Tansition!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
