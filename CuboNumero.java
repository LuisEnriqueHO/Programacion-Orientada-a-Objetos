/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubonumero;

import java.util.Scanner;

/**
 *
 * @author Wuicho
 */
public class CuboNumero {

    /**
     * @param args the command line arguments
     */
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int cifra, rc;

        System.out.println("Ingresa un numero: ");
        cifra = entrada.nextInt();

        rc = (int) Math.pow(cifra, (double) 1.0 / 3.0);

        if (rc * rc * rc == cifra) {
            System.out.println("El numero si representa un cubo");
        } else {
            System.out.println("El numero no es un cubo");
        }

    }

}
