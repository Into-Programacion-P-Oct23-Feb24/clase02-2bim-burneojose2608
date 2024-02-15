/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author LAB.ELECT
 */
public class Ejemplo02 {

    public static String obtenerTipo(int edad) {
        String cadena = "Devolver edad";

        if (edad >= 18) {
           cadena ="La edad ingresada pertence a mayor de edad";

        } else {
            if (edad >= 12 && edad < 18) {
                cadena = "la edad ingresada es de un adolecente";
            } else {
                cadena = "la edad es de un nino";
            }
        }
        return cadena;

    }
}
