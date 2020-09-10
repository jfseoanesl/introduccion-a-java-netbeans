/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.g01.tipoDato;

/**
 * ejemplo dle uso de tipo de datos primitivos y conversiones entre tipos
 * @author jairo
 * @version 10-09-2020
 */
public class TipoPrimitivo {
    
    public static void main(String[] arg){
    
        int x = 20;
        Integer y = new Integer(20);
        int z = x + y;
        System.out.println("suma = " + z);
        
        System.out.println("Max value Tipo Int: " + Integer.MAX_VALUE);
        System.out.println("Min value Tipo Int: " + Integer.MIN_VALUE);
        System.out.println("Max value Tipo Shor: " + Short.MAX_VALUE);
        System.out.println("Min value Tipo Shor: " + Short.MIN_VALUE);
        
        
        String s = "123456";
        String n = "654321";
        System.out.println("Suma= " + suma(s,n));
        System.out.println("Division= " + divide(5,2));
    }
    
    public static int suma(String a, String b){
        int na = Integer.valueOf(a);
        int nb = Integer.parseInt(b);
        return na + nb;
    }
    
    public static double divide(int a, int b){
        double da = (double)a;
        //double db = (double)b;
        return da/b;
    }
    
    
    
}
