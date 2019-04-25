package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);


    }

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER); // grid settings
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Scene scene = new Scene(grid, 300, 200);

        TextField tf1 = new TextField("Please press the button");

        Button btn = new Button();
        btn.setText("Say 'Hello World FX!");
        btn.setOnAction(actionEvent -> tf1.setText("Thank You!!!!"));

        final ToggleGroup group = new ToggleGroup();
        RadioButton rb1 = new RadioButton();
        rb1.setToggleGroup(group);
        RadioButton rb2 = new RadioButton();
        rb2.setToggleGroup(group);
        RadioButton rb3 = new RadioButton();
        rb3.setToggleGroup(group);
        RadioButton rb4 = new RadioButton();
        rb4.setToggleGroup(group);


        rb1.setText("Light");
        rb2.setText("Dark");
        rb3.setText("Pastel");
        rb4.setText("Bright");
        rb1.setSelected(true);

        group.selectedToggleProperty().addListener((ov, old_toggle, new_toggle) -> {
            if (group.getSelectedToggle() == rb1) {
                grid.styleProperty().set("-fx-background-color: WHITE");
                rb1.styleProperty().set("-fx-background-color: WHITE");
                rb2.styleProperty().set("-fx-background-color: WHITE");
                rb3.styleProperty().set("-fx-background-color: WHITE");
                rb4.styleProperty().set("-fx-background-color: WHITE");
                rb1.styleProperty().set("-fx-text-fill: BLACK");
                rb2.styleProperty().set("-fx-text-fill: BLACK");
                rb3.styleProperty().set("-fx-text-fill: BLACK");
                rb4.styleProperty().set("-fx-text-fill: BLACK");
                tf1.styleProperty().set("-fx-background-color: WHITE");
                tf1.styleProperty().set("-fx-text-fill: BLACK");
                btn.styleProperty().set("-fx-text-fill: BLACK");
                btn.styleProperty().set("-fx-background-color: WHITE");
            } else if (group.getSelectedToggle() == rb2) {
                grid.styleProperty().set("-fx-background-color: BLACK");
                rb1.styleProperty().set("-fx-background-color: BLACK");
                rb2.styleProperty().set("-fx-background-color: BLACK");
                rb3.styleProperty().set("-fx-background-color: BLACK");
                rb4.styleProperty().set("-fx-background-color: BLACK");
                rb1.styleProperty().set("-fx-text-fill: WHITE");
                rb2.styleProperty().set("-fx-text-fill: WHITE");
                rb3.styleProperty().set("-fx-text-fill: WHITE");
                rb4.styleProperty().set("-fx-text-fill: WHITE");
                tf1.styleProperty().set("-fx-background-color: BLACK");
                tf1.styleProperty().set("-fx-text-fill: WHITE");
                btn.styleProperty().set("-fx-background-color: BLACK");
                btn.styleProperty().set("-fx-text-fill: WHITE");
            } else if (group.getSelectedToggle() == rb3) {
                grid.styleProperty().set("-fx-background-color: #6EB5FF");
                tf1.styleProperty().set("-fx-background-color: #FF9CEE");
                btn.styleProperty().set("-fx-text-fill: #F3FFE3");
                btn.styleProperty().set("-fx-background-color: #FF9CEE");

            } else if (group.getSelectedToggle() == rb4) {
                grid.styleProperty().set("-fx-background-color: WHITE");
                rb1.styleProperty().set("-fx-background-color: WHITE");
                rb2.styleProperty().set("-fx-background-color: WHITE");
                rb3.styleProperty().set("-fx-background-color: WHITE");
                rb4.styleProperty().set("-fx-background-color: WHITE");
            }
        });

        grid.add(tf1, 0, 0);
        grid.add(btn, 0, 1);
        grid.add(rb1, 0, 3);
        grid.add(rb2, 0, 4);
        grid.add(rb3, 0, 5);
        grid.add(rb4, 0, 6);


        primaryStage.setTitle("Interactive JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
