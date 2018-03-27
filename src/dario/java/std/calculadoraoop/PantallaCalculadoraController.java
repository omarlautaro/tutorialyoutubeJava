package dario.java.std.calculadoraoop;

import java.awt.event.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class PantallaCalculadoraController implements Initializable {

    public void initialize(URL url, ResourceBundle rb) {
    }
    @FXML
    private Button igual;

    @FXML
    private Button resta;
    @FXML
    private Button suma;

    @FXML
    private Button multiplicacion;

    @FXML
    private Label display;

    @FXML
    private Button coma;

    @FXML
    private Button division;

    @FXML
    private Button numero1;

    @FXML
    private Button numero2;

    @FXML
    private Button numero3;

    @FXML
    private Button numero4;

    @FXML
    private Button numero5;

    @FXML
    private Button numero6;

    @FXML
    private Button numero7;

    @FXML
    private Button numero8;

    @FXML
    private Button numero9;

    @FXML
    void ejecutarboton(ActionEvent evento1) {
        if (evento1.getSource() == numero1) {
            display.setText("1");
        } else if (evento1.getSource() == numero2) {
            display.setText("2");
        } else if (evento1.getSource() == numero3) {
            display.setText("3");
        } else if (evento1.getSource() == numero4) {
            display.setText("4");
        } else if (evento1.getSource() == numero5) {
            display.setText("5");
        } else if (evento1.getSource() == numero6) {
            display.setText("6");
        } else if (evento1.getSource() == numero7) {
            display.setText("7");
        } else if (evento1.getSource() == numero8) {
            display.setText("8");
        } else if (evento1.getSource() == numero9) {
            display.setText("9");
        } else if (evento1.getSource() == suma) {
            display.setText("+");
        } else if (evento1.getSource() == resta) {
            display.setText("-");
        } else if (evento1.getSource() == multiplicacion) {
            display.setText("*");
        } else if (evento1.getSource() == division) {
            display.setText("/");
        }

    }

    @FXML
    void botonnum2(ActionEvent event2) {
        if (event2.getSource() == numero1) {
            display.setText("1");
        } else if (event2.getSource() == numero2) {
            display.setText("2");
        } else if (event2.getSource() == numero3) {
            display.setText("3");
        } else if (event2.getSource() == numero4) {
            display.setText("4");
        } else if (event2.getSource() == numero5) {
            display.setText("5");
        } else if (event2.getSource() == numero6) {
            display.setText("6");
        } else if (event2.getSource() == numero7) {
            display.setText("7");
        } else if (event2.getSource() == numero8) {
            display.setText("8");
        } else if (event2.getSource() == numero9) {
            display.setText("9");
        }
    }

  }
