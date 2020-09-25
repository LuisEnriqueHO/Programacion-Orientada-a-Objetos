/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaabcdario;

import java.util.Scanner;

/**
 *
 * @author Wuicho
 */
public class PilaAbcdario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char x = 'a';
        int tam = 0, opcion;

        char pila[] = new char[27];

        do {

            System.out.println("Ingrese lo que quiere realizar :");
            System.out.println("\n1-Llenar\n"
                    + "2-Mostrar\n"
                    + "3-Eliminar\n"
                    + "4-Agregar\n"
                    + "5-Salir \n");
            switch (opcion = sc.nextInt()) {

                case 1:
                    while (x <= 'z') {
                        pila[tam] = x;
                        System.out.println(pila[tam]);
                        tam++;
                        x++;
                    }
                    System.out.println("Pila llena\n");
                    break;

                case 2:
                    System.out.println("Elementos de la pila\n");
                    for (int i = tam - 1; i >= 0; i--) {
                        System.out.println(pila[i]);
                    }
                    break;

                case 3:
                    if (tam != 0) {
                        System.out.println("Letra eliminada");
                        tam--;
                    }
                    break;

                case 4:

                    System.out.println("Agregar letras, por favor introduce la nueva letra para la pila \n");
                    pila[tam] = sc.next().charAt(0);
                    tam++;
                    break;

            }
        } while (tam != 5);
    }

}
