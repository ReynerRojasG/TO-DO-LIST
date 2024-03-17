/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package tareas.pendientes;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Reyner
 */

public class FXMLDocumentController implements Initializable {
    // Crea los botones
    @FXML
    private Label label;
    
    @FXML
    private AnchorPane Window;
  
    @FXML
    private Button ok_btn;
    
    @FXML
    private ListView<Task> list_view;

    @FXML
    private CheckBox check_box;
    
    @FXML
    private Button delete_btn;
    
    @FXML
    private TextField addTask_lb;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    // Metodo para agregar tarea
    @FXML
    private void AddAction(ActionEvent event) {
        String text = addTask_lb.getText(); // Obtiene el texto del label
        if (!text.isEmpty()){ // Verifica si no esta vacio
            Task newtask = new Task(text);
            list_view.getItems().add(newtask); // Agrega un Item a la lista
            addTask_lb.clear(); // Borra lo que esta en el label
        }
    }
    
    // Metodo para cambiar el estado con el boton Check
    @FXML
    private void CheckAction(ActionEvent event) {
     Task checkTask = list_view.getSelectionModel().getSelectedItem(); // Establecido para obtener lo seleccionado de la lista
    
    if(checkTask != null){  // Verifica si hay algo
        if(checkTask.isComplete() == true){ 
         checkTask.setComplete(false); // Marca completado si es igual a verdadero
        }else{
         checkTask.setComplete(true); // Marca completado si es igual a falso
        }
          list_view.refresh();      // Actualiza la lista
        }         
    }
    // Metodo para eliminar Item de la lista
    @FXML
    private void DeleteAction(ActionEvent event) {
        int selectedID = list_view.getSelectionModel().getSelectedIndex(); // Crea un ID para tener los Index seleccionados de la lista
        list_view.getItems().remove(selectedID); // Los elimina
    }  
    
    // Metodo para cambiar el Check de checkBox
    @FXML
    private void ClickAction(MouseEvent event) {
        Task clickTask = list_view.getSelectionModel().getSelectedItem(); // Obtiene el Item seleccionado
        check_box.setSelected(clickTask.isComplete());     // Cambia el estado del Check segun el metodo isComplete()  
    }
}