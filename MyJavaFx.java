
/*every JavaFx program is defined in a class that extends javafx.application.Application
the javafx.application.Application class defines the essetntial framework for
writing JavaFx Programs */


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class MyJavaFx {
    
    public void start(Stage primaryStage){
        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 200,250);
        primaryStage.setTitle("My JavaFx");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String [] args){
        Application.launch(args);
    }
    
}
