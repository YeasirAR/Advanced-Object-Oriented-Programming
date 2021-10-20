package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField tf1;
    @FXML
    private TextField tf2;
    @FXML
    private TextField tf3;
    @FXML
    private TextField tf4;
    @FXML
    private TextField tf5;
    @FXML
    private TextField tf6;
    @FXML
    private TextField tf7;
    @FXML
    private TextField tf8;
    @FXML
    private TextField tf9;
    @FXML
    private TextArea output;
    @FXML
    private Label max;

    public void show() {
        String[] s1 = new String[3];
        String[] s2 = new String[3];
        String[] s3 = new String[3];
        s1[0]= tf1.getText();
        s1[1]= tf2.getText();
        s1[2]= tf3.getText();
        s2[0]= tf4.getText();
        s2[1]= tf5.getText();
        s2[2]= tf6.getText();
        s3[0]= tf7.getText();
        s3[1]= tf8.getText();
        s3[2]= tf9.getText();
        output.setText(s1[0]+" " +s1[1]+" "+s1[2]+"\n"+s2[0]+" " +s2[1]+" "+s2[2]+"\n"+s3[0]+" " +s3[1]+" "+s3[2]+"\n");

        if (Double.parseDouble(s1[2]) > Double.parseDouble(s2[2])  && Double.parseDouble(s1[2])  > Double.parseDouble(s3[2])) {
            max.setText(s1[0]+"  " +s1[1]+"  "+s1[2]);
        }
        else if (Double.parseDouble(s2[2]) > Double.parseDouble(s1[2])  && Double.parseDouble(s2[2])  > Double.parseDouble(s3[2])) {
            max.setText(s2[0] + "  " + s2[1] + "  " + s2[2]);
        }
        else{
            max.setText(s3[0]+"  " +s3[1]+"  "+s3[2]);
        }
    }
}