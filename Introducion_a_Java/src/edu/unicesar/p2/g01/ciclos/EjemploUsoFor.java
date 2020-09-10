/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unicesar.p2.g01.ciclos;

/**
 * calcular la sumatoria de n numeros pares e impares - usa ciclo for
 * @author jairo
 * @version 10-09-2020
 */
public class EjemploUsoFor {
    
      public static void main(String arg[]){
          int n=3;
          int sPar=0;
          int sImpar=0;
          for(int i=0; i<n; i++){
              if(isPar(i)){
                  sPar=+i;
              }
              else{
                  sImpar=+i;
              }
          }
          
          System.out.println("Suma Par: " + sPar);
          System.out.println("Suma Impar: " + sImpar);
      }
      
      public static boolean isPar(int n){
          return (n%2==0);
      }
}
