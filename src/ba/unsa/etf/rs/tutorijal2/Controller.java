package ba.unsa.etf.rs.tutorijal2;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    public TextField rijec;
    public Label rezultat;

    public void provjeri(ActionEvent actionEvent) {
        rezultat.setText("Treba ispisati rijec!");
    }
}

