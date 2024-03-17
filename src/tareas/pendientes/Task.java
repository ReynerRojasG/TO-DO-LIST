/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareas.pendientes;
/**
 *
 * @author Reyner
 */
//Clase Tarea
public class Task {
    private String name;
    private boolean complete;
    //Sets and gets
    public Task(String name){
    this.name = name;
    complete = false;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
    //Cambia el estado de la tarea
    public String toString() {               
        if(complete){
            return name + "  (completed)";
        }
        
        return name + "  (not completed)";

    }   
}
