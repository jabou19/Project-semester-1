package worldofzuul.presentationgui;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Window {

    public static void popUp(String title, String message){ // den bruger vi til laver vinduer
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL); //Blocks other windows until you close this one
        window.setTitle(title);

        TextArea text = new TextArea();
        text.setEditable(false);
        text.setWrapText(true);
        text.setText(message);

        VBox layout = new VBox();
        layout.getChildren().add(text);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout,250, 150);// størelsen 

        window.setScene(scene);
        window.showAndWait();
    }
}
