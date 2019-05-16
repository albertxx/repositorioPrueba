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
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String patata;
        String javalin = "Javalin, javalon";
        String javalen= "javalen, len, len";
        String frase;
        
        System.out.println("Escriba una frase: ");
        frase = s.nextLine();
        
        if(frase.endsWith(javalen)){
            
            System.out.println("Usted habla Javalandia.");
            
            System.out.println("Traductor: ");
            System.out.println(frase.replace(javalen, "").trim());
            
        }else if(frase.startsWith(javalin)){
            
            System.out.println("Usted habla Javalandia.");
            
            System.out.println("Traductor: ");
            System.out.println(frase.replace(javalin, "").trim());
            
        }else{
            
            System.out.println("No es idioma de javalandia.");
            
        }
        
        
        
    }
    
}
