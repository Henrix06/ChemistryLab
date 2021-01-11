import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.*;

public class HomeController {

    public AnchorPane btnSubmit;
    public Label resultLAbel;
    public Label explanationLabel;
    public TextArea elementView;

    //public String[] elements = {"hydrogen","helium","lithium","beryllium","boron","carbon","nitrogen","oxygen","fluorine","neon","sodium","magnessium","aluminum","silicon","phosphorus","sulphur","chlorine","argon","potassium","calcium"};
    //public String[]  selected={};
    ArrayList<String> element = new ArrayList<>();
    public void addHydrogen(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 1){
            element.add("Hydrogen");
            elementView.setText(String.valueOf(element));
        }

    }

    public void addLithium(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 1){
            element.add("Lithium");
            elementView.setText(String.valueOf(element));
        }
    }

    public void addSodium(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 1){
            element.add("Sodium");
            elementView.setText(String.valueOf(element));
        }
    }

    public void addPotassium(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 1){
            element.add("Potassium");
        }

    }

    public void addBerylium(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 1){
            element.add("BeryLium");
            elementView.setText(String.valueOf(element));
        }
    }

    public void addMagnessium(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 1){
            element.add("Magnessium");
            elementView.setText(String.valueOf(element));
        }
    }

    public void addBoron(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 1){
            element.add("Boron");
            elementView.setText(String.valueOf(element));
        }
    }


    public void addCarbon(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 1){
            element.add("Carbon");
            elementView.setText(String.valueOf(element));
        }
    }

    public void addNitrogen(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 1){
            element.add("Nitrogen");
            elementView.setText(String.valueOf(element));
        }
    }

    public void addOxygen(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 1){
            element.add("Oxygen");
            elementView.setText(String.valueOf(element));
        }
    }

    public void addFluorine(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 1){
            element.add("Fluorine");
            elementView.setText(String.valueOf(element));
        }
    }

    public void addArgon(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 1){
            element.add("Argon");
            elementView.setText(String.valueOf(element));
        }
    }

    public void addAluminium(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 1){
            element.add("Aluminium");
            elementView.setText(String.valueOf(element));
        }
    }

    public void addSilicon(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 1){
            element.add("Silicon");
            elementView.setText(String.valueOf(element));
        }
    }

    public void addPhosphorus(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 1){
            element.add("Phosphorus");
            elementView.setText(String.valueOf(element));
        }
    }

    public void addSulphur(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 1){
            element.add("Sulphur");
            elementView.setText(String.valueOf(element));
        }
    }

    public void addCalcium(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 1){
            element.add("Calcium");
            elementView.setText(String.valueOf(element));
        }
    }

    public void addHelium(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 1){
            element.add("Helium");
            elementView.setText(String.valueOf(element));
        }
    }

    public void addNeon(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 1){
            element.add("Chlorine");
            elementView.setText(String.valueOf(element));
        }
    }

    public void addChlorine(MouseEvent mouseEvent) {
        if (mouseEvent.getClickCount() == 1){
            element.add("Chlorine");
            elementView.setText(String.valueOf(element));
        }
    }

    public void submit(MouseEvent mouseEvent) {
        if(element.size() == 0){
        resultLAbel.setTextFill(Color.TOMATO);
        resultLAbel.setText("Server Error : Check");

        explanationLabel.setTextFill(Color.GREEN);
        explanationLabel.setText("No elementSelected");}

        if((element.contains("Hydrogen"))&(element.contains("Hydrogen"))&(element.contains("Oxygen"))){
            resultLAbel.setTextFill(Color.BLACK);
            resultLAbel.setText("H(2)0");

            explanationLabel.setTextFill(Color.GREEN);
            explanationLabel.setText("Water");
        }

        if((element.contains("Sodium"))&(element.contains("Chlorine"))){
            resultLAbel.setTextFill(Color.BLACK);
            resultLAbel.setText("NaCl");

            explanationLabel.setTextFill(Color.GREEN);
            explanationLabel.setText("Sodium Chloride");
        }

        /*if((element.contains("Hydrogen"))&(element.contains("Hydrogen"))&(element.contains("Oxygen"))&(element.contains("Oxygen"))){
            resultLAbel.setTextFill(Color.BLACK);
            resultLAbel.setText("H(2)0(2)");

            explanationLabel.setTextFill(Color.GREEN);
            explanationLabel.setText("An Acid");
        }*/

        if((element.contains("Hydrogen"))&(element.contains("Chlorine"))){
            resultLAbel.setTextFill(Color.BLACK);
            resultLAbel.setText("HCl");

            explanationLabel.setTextFill(Color.GREEN);
            explanationLabel.setText("HydroChloride");
        }
    }

    public void drop(MouseEvent mouseEvent) {
        element.removeAll(element);
        elementView.setText(String.valueOf(element));
    }

    public void quit(MouseEvent mouseEvent) throws IOException {
        javafx.scene.Node node = (Node) mouseEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
    }
}
