package sample;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    @FXML
    private TextField input1;

    @FXML
    private TextField input2;

    @FXML
    private Label showLabel;

    @FXML
    private ChoiceBox choiceBox;

    @FXML
    public void initialize() {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        choiceBox.setItems(FXCollections.observableArrayList(list));
    }


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


    @FXML
    private void changeScene(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("sample2.fxml"));
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("Hello World");

        window.setScene(new Scene(parent, 600, 450));
        window.show();


    }
}
