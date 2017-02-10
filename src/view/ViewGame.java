package view;

import javafx.scene.control.Button;
import javafx.scene.layout.*;

/**
 * Created by Gebruiker on 10/02/2017.
 */
public class ViewGame extends BorderPane {
    private Button cel;

    public ViewGame() {
        initialiseNodes();
        layoutNodes();
    }



    private void initialiseNodes() {
        cel = new Button();

    }

    private void layoutNodes() {
        setCenter(cel);
    }

    public Button getCel() {
        return cel;
    }

    public void setCel(Button cel) {
        this.cel = cel;
    }
}
