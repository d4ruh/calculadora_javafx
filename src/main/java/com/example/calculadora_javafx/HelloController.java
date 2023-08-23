package com.example.calculadora_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Optional;


public class HelloController {
    @FXML private Label equationLabel;

    static String last1;
    static String last2;
    static double result;

    @FXML
    public void onButtonAction(ActionEvent e) {
        String valor = ((Button)e.getSource()).getText();

        switch (valor) {
            case "0":
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                equationLabel.setText(equationLabel.getText() + " " + valor);
                break;
            case "CE":
                equationLabel.setText("");
                break;
            case "⌫":
                equationLabel.setText(removeLastCharacter(equationLabel.getText()));
        }

        //equationLabel.setText(equationLabel.getText() + valor + " ");
    }

    @FXML
    public void onCalculateButton(ActionEvent e) {
        System.out.println("teste");
    }

    //nota: roubei do google, sla como funciona
    public static String removeLastCharacter(String str) {
        String result = Optional.ofNullable(str)
                .filter(sStr -> sStr.length() != 0)
                .map(sStr -> sStr.substring(0, sStr.length() - 1))
                .orElse(str);
        return result;
    }
}