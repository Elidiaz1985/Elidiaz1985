/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author eliseo
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String nombre;
        System.out.println("ingresa tu nombre");   
        nombre = leer.next();
        
        String apellido;
        System.out.println("ingresa tu apellido");   
        apellido = leer.next();
        
        System.out.println("nombre: " + nombre);
        System.out.println("apellido: " + apellido);
        
        
        
    }
    
}
