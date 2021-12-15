package lab9;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class Main extends Application{

    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Maxim Bugăescu FAF-202 ");

        Label nr1 = new Label("Dividend:");
        TextField nr1Input = new TextField("");
        nr1Input.setPromptText("Dividend");

        Label nr2 = new Label("Divisor:");
        TextField nr2Input = new TextField("");
        nr2Input.setPromptText("Divisor");

        Label resultLabel = new Label("Result:");

        button = new Button("Caculate");

        VBox layout =  new VBox(10);
        layout.setPadding(new Insets(60,20,20,20));

        button.setOnAction ( e -> new ErrCheck().check(resultLabel, nr1Input, nr2Input) );

        layout.getChildren().addAll(nr1, nr1Input,nr2, nr2Input,button,resultLabel);

        Scene scene = new Scene(layout,400,350);
        window.setScene(scene);
        window.show();
    }
}