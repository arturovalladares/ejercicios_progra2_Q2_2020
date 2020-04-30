/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prograii;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dvall
 */
public class PrograII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ArrayList <String> coleccion = new ArrayList<>();
    /*Arraylist <Integer> coleccionI = new ArrayList<>();
    ArrayList <Double> coleccionD = new Arraylist<>();
    ArrayList <Character> coleccionC = new Arraylist<>();
*/
    //Agregar valores

    coleccion.add("Maria");
    coleccion.add("Juan");
    coleccion.add("Pedro");

    //Utilizar un valor de la coleccion
    System.out.println("[0]: " + coleccion.get(0));

    //recorrer
    for (String cadena: coleccion){
        System.out.println(" - " + cadena);
    }
    
    //tamanio

    System.out.println("Tamanio: " + coleccion.size());

    //eliminar

    coleccion.remove(1);
    System.out.println("Luego de remove el 1: ");
        for(String cadena: coleccion){
        System.out.println(" - " + cadena);
        }
    //guardar un valor en una posicion especifica
    coleccion.add(0,"Rana");
    System.out.println("Luego de agregar en la posicion 0: ");
        for(String cadena: coleccion){
        System.out.println(" - " + cadena);
        }

    //sustituir un valor en una posicion especifica
    coleccion.set(1,"Feder");
    System.out.println("Luego de modificar en la posicion 1: ");
        for(String cadena: coleccion){
        System.out.println(" - " + cadena);
        }

 //buscar un valor en una posicion especifica
    coleccion.contains("Monica");
    System.out.println("Si tiene a Monica en la: " + coleccion.indexOf("Monica"));
      
}

}
