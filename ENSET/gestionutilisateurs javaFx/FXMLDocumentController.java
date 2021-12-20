/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package gestionutilisateurs;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

/**
 *
 * @author ELYOUSFI
 */
public class FXMLDocumentController implements Initializable {

    private ArrayList<User> user;

    @FXML
    private TextField nom;
    @FXML
    private TextField prenom;
    @FXML
    private TextField adresse;
    @FXML
    private TextField email;
    @FXML
    private TextField password;
    @FXML
    private TextField search;
    @FXML
    private ListView<User> listView;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void addUser() {
        listView.getItems().add(new User(nom.getText(), prenom.getText(), adresse.getText(), email.getText(), password.getText()));
    }

    public void delUser() {
        int indice = listView.getSelectionModel().getSelectedIndex();
        if (indice >= 0) {
            listView.getItems().remove(indice);
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Veuillez sélectionner un élément ");
            alert.show();
        }
    }

    public void searchUser() {
        for (int i = 0; i < listView.getItems().size(); i++) {
            if(listView.getItems().get(i).getNom().equals(search.getText()))
            {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText(listView.getItems().get(i).toString());
                alert.show();
            }
        }
    }
    
    public void sortUsers() {
        
    }
    
    public void save() {
        
    }
    
    
}
