/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.g01.salidaenpantalla;

/**
 *  muestra las principales funciones el objeto System.out para imprimir datos
 * @author jairo
 * @version 10-09-2020
 */
public class EjemploSalidaPorPantalla {
    
    public static void main(String[] arg ){
        
        // imprime datos y se mantiene en la misma linea
        System.out.print("Imprime una linea y se mantiene______");
        // imprime una linea y slta a la siguinete line
        System.out.println("Imprime nueva linea y salta  ala siguiente");
        // impresion con formato
        System.out.printf("%s%n", "Imprime una linea con formato");
        System.out.println("Linea final");
        
    }
}
