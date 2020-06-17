/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auto;

import java.util.Scanner;

public class mainAutoImpl extends mainAuto {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String modelo;
        int llantas, puertas, kilometros;
        System.out.println("Ingrese el numero de llantas:");
        llantas = entrada.nextInt();

        System.out.println("Ingrese el numero de puertas");
        puertas = entrada.nextInt();

        System.out.println("Ingrese el kilometraje:");
        kilometros = entrada.nextInt();

        System.out.println("Ingrese el modelo:");
        modelo = entrada.nextLine();

        Auto e;

        e = new Auto(llantas, puertas, modelo, kilometros);
        e.presentarAuto();

    }

}
