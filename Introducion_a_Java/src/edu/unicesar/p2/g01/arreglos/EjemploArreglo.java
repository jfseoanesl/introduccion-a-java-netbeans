/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.g01.arreglos;

/**
 * calcula la sumatoria y promedio de los elementos de un arreglo
 * @author jairo
 * @version 10-09-2020
 */
public class EjemploArreglo {
    
     public static void main(String arg[]){
         
         int a[] = {2,6,4,5,8,7,2,9,0};
         int sumaElementos = sumatoria(a);
         double prom = (double)sumaElementos/a.length;
         System.out.println("Suma E: " + sumaElementos);
         System.out.println("Prom E: " + prom);
         
     }
     
     public static int sumatoria(int[] a){
         int suma=0;
         for(int i=0; i<a.length;i++){
             suma+=a[i];
         }
         return suma;
     }
     
}
