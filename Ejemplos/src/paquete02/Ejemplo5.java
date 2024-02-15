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
public class Ejemplo5 {

    public static void main(String[] args) {
        int [] edades = {10,9,20,17,18,19,15};
        String cadenaFinal= "";
        for (int i = 0; i < edades.length; i++) {
            int edad = edades[i];
             String mensaje = Ejemplo02.obtenerTipo(edad);  
                cadenaFinal=String.format("%s Edad : %d %s\n",cadenaFinal,edad,mensaje);
        }
     
        System.out.printf("%s\n",cadenaFinal);
     
       
    }
}
/*
en este codigo tenemos un arreglo donde hacemos un ciclo repetitvo para que recorra
los lugares del arreglo y de ahi enviamos un numero entero  a otra clase donde donde estase vera si es mayoro menor yde ahi acomulamos en una cadena y presentamos al final
*/

