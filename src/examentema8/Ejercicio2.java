/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examentema8;

import java.util.Scanner;

/**
 *
 * @author Alberto José Estévez
 */
public class Ejercicio2 {
     public static void main(String[] args) {
         Scanner s = new Scanner (System.in);
         
         String j1;
         String j2 = "";
         String vacio = "";
         char res;
         
         System.out.println("Jugador 1, introduzca una frase: ");
         j1 = s.nextLine();
         
         
             
             while(j1.equals(vacio)){
                 
                 System.out.println("No puedes introducir una cadena de texto vacía: ");
                 j1 = s.nextLine();
                 
             }

             
                for(int i = j1.length(); i>0; i--){
                 res = j1.charAt(i-1);
                 
             }
                
                System.out.println("Jugador 2, adivine la palabra: ");
                j2 = s.nextLine();
                
                
             while(!(j2.equalsIgnoreCase(j1))){
                 
                 System.out.println("Incorrecto, prueba otra vez: ");
                 j2 = s.nextLine();
                 
             }
             
             System.out.println("Correcto.");
         
    }
}
