package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField input1;

    @FXML
    private TextField input2;

    @FXML
    private Label showLabel;

    @FXML
    private void add(){
        String s1 = input1.getText();
        String s2 = input2.getText();

        double result = Double.parseDouble(s1) + Double.parseDouble(s2);
        showLabel.setText(result + "");
    }

    @FXML
    private void multiply(){
        String s1 = input1.getText();
        String s2 = input2.getText();

        double result = Double.parseDouble(s1) * Double.parseDouble(s2);
        showLabel.setText(result + "");
    }
}
