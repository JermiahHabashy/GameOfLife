package view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.Cel;

/**
 * Created by Gebruiker on 10/02/2017.
 */
public class Presenter {
    private Cel model;
    private ViewGame view;

    public Presenter(Cel model, ViewGame view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
    }

    private void addEventHandlers() {
        view.getCel().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                model.setKleur(255,255,255);
            }
        });
    }

}
