/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.g01.sentenciaocondicional;

/**
 *  aplicativo que calcula salari semanal de empleado a partir de horas laboradas implementando if
 * @author jairo
 * @version  10-09-2020
 */
public class EjemploUsoIf {
    
      public static void main(String[] arg){
          
          int n = 40;
          int ne = nHorasExtras(n);
          double sSemanal = (ne * 25) + (n-ne) * 20;
          System.out.printf("PAGO=%.0f%n", sSemanal);
      }
      
      public static int nHorasExtras(int n){
          if(n > 40){
              return n-40;
          }
          else
              return 0;
      }
    
}
