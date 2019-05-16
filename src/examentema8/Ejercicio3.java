/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examentema8;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Alberto José Estévez
 */
public class Ejercicio3 {
     public static void main(String[] args) {
         Scanner s = new Scanner (System.in);
         Scanner t = new Scanner (System.in);
         
         
         int x;
         String salida = "salir";
         String teclado;
         
         int aleatorio = 0;
         int y = 0;
         
         System.out.println("¿Cuántos alumnos sois en el sorteo?");
         x = t.nextInt();
         y = x;
         System.out.println("Introduzca el nombre de los alumnos: ");
         String[] nombres = new String[x];
         char[] prueba = new char[x];
         
         
         for(int i = 0; i<x;i++){
             nombres[i] = s.nextLine();
         }
         
         
         System.out.println("Vamos a hacer un sorteo. Escriba 'salir' para abandonar, o cualquier tecla para continuar: ");
         teclado = s.nextLine();
         int[] aleatorio2 = new int [nombres.length];
         
         
         
         while(!teclado.equalsIgnoreCase(salida) || y==0){
         for(int i = 0; i<nombres.length;i++){
             aleatorio = (char)FuncionesExamen.FuncionExamen.generaAleatorio(x);
             prueba[i] = (char)aleatorio;
             
            if(prueba[i] == aleatorio){ 
             y--;
             aleatorio = (char)FuncionesExamen.FuncionExamen.generaAleatorio(x);
            }
            
             }
             
                System.out.println("El ganador ha sido: " + nombres[aleatorio]);
                
                System.out.println("Escriba 'salir' para abandonar, o cualquier tecla para continuar:");
                teclado = s.nextLine();
                 
             }
         
            
             
             
         
         
    }
}
