/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapersona;

/**
 *
 * @author Alumno
 */

import javax.swing.JOptionPane;

public class DAOEstudiante {
    
    
    Estudiante obj[] =new Estudiante[10];
    int x = 0;
    void menu(){
    String var = "si";
    String mensaje = "";
    
    while(var.equalsIgnoreCase("si")){
            int op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion deseada : \n" + "1.- Dar de alta a nuevo estudiante. \n" + "2.-Mostrar los datos de todos los estudiantes \n"));
            
            switch (op) {
                case 1:
                    pedirEstudiante();
                    break;
                    
                case 2:
                    mostrarEstudiante();
                default:
                    JOptionPane.showInputDialog(null, "Opcion invalida");
                    
            
            }
            mensaje = JOptionPane.showInputDialog("¿Desseas repetir el rograma?");
            
        }
    }
    public void pedirEstudiante(){
        int numboleta = Integer.parseInt(
                JOptionPane.showInputDialog("")
        );
        String nom = JOpPane
                
        obj[x] = new Estudiante (numboleta, nom, edad, gen);
        x++;
    }
    
    public void mostrarEstudiante(){
        for(int i = 0; i < x; i++){
            JOptionPane.showMessageDialog(null, "La boleta DEL ESTUDIANTE es: " + obj[i].getnumboleta() + "\n" + "El nom,bre del estudainte es: " + obj[i].getNombre() + "\n" + "Laedad del estudiante es: " + obj[i].getEdad() + "\n" + "El genero del estudiante es: " + obj[i].getGenero() + "\n");        }
    }
    
}
