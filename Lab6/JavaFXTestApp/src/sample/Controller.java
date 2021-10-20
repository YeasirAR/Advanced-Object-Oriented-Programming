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

import java.io.*;
import java.net.Socket;
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

    BufferedReader cReader;
    BufferedWriter cWriter;

    public Controller(){
        try {
            Socket sc = new Socket("localhost", 6600);

            OutputStreamWriter o = new OutputStreamWriter(sc.getOutputStream());
            cWriter = new BufferedWriter(o);

            InputStreamReader isr = new InputStreamReader(sc.getInputStream());
            cReader = new BufferedReader(isr);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }


    @FXML
    private void add(){
        String s1 = input1.getText();
        String s2 = input2.getText();

        try {
            // send the data to the server, with the op type
            // if possible use json, https://stackoverflow.com/questions/21953958/how-to-send-json-object-through-java-sockets
            cWriter.write("add\n");
            cWriter.write(s1 + "\n");
            cWriter.write(s2 + "\n");
            cWriter.flush();

            String res = cReader.readLine();
            showLabel.setText(res);

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    private void multiply(){
        String s1 = input1.getText();
        String s2 = input2.getText();

        try {
            cWriter.write("multiply\n");
            cWriter.write(s1 + "\n");
            cWriter.write(s2 + "\n");
            cWriter.flush();

            String res = cReader.readLine();
            showLabel.setText(res);

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
