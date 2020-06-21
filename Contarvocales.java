/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contarvocales;

import java.util.Scanner;

/**
 *
 * @author Wuicho
 */
public class Contarvocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int consonante, vocal, otro;
        String palabra;
        Scanner ingreso = new Scanner(System.in);

        vocal = 0;
        consonante = 0;
        otro = 0;

        System.out.println("Ingresa la palabra:");
        palabra = ingreso.nextLine().toLowerCase();

        for (int cont = 0; cont < palabra.length(); cont++) {
            if (palabra.charAt(cont) < 'a' || palabra.charAt(cont) > 'z') {
                otro++;
            } else if ((palabra.charAt(cont) == 'a') || (palabra.charAt(cont) == 'e') || (palabra.charAt(cont) == 'i') || (palabra.charAt(cont) == 'o') || (palabra.charAt(cont) == 'u')) {
                vocal++;
            } else {
                consonante++;
            }

        }
        System.out.println("La palabra tiene: "+vocal+" Vocales"+" y "+consonante+" Consonantes");
        
    }

}
