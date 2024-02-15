/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author LAB.ELECT
 */
public class Ejemplo01 {

    public static void main(String[] args) {
        int edad = 18;
        if (edad >= 18) {
            System.out.println("La edad ingresada pertence a mayor de edad");

        } else {
            if (edad >= 12 && edad < 18) {
                System.out.println("la edad ingresada es de un adolecente");
            } else {
                System.out.println("la edad es de un nino");
            }
        }
    }
}
