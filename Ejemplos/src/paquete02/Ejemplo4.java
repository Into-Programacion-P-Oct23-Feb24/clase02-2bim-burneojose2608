/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;
import paquete02.Ejemplo02;
/**
 *
 * @author LAB.ELECT
 */
public class Ejemplo4 {

    public static void main(String[] args) {
        int [] edades = {10,9,20,17,18,19,15};
        for (int i = 0; i < edades.length; i++) {
            int edad = edades[i];
             String mensaje = Ejemplo02.obtenerTipo(edad);  
                System.out.printf(" Edad : %d %s\n",edad,mensaje);
        }
     
        
     
       
    }
}
