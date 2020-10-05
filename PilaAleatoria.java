/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilaaleatoria;

import java.util.Scanner;

/**
 *
 * @author Wuicho
 */
public class PilaAleatoria {

    int num1 = 65;
    int num2 = 90;
    char pilabc[] = new char[26];
    int tope = 0;

    public void llenar() {

        for (int i = 0; i < 26; i++) {
            if (tope < 26) {
                int numAleatorio = (int) (Math.random() * (num2 - num1) + num1);
                pilabc[tope] = (char) numAleatorio;
                tope++;
            } else {
                System.out.println("pila llena");
                break;
            }
        } for( int z = 0; z<26; z++){
            for( int z2=0;z2<26; z2++){
                if(pilabc[z]==pilabc[z2] && z!= z2){
                    int numAleatorio = (int) (Math.random() * (num2 - num1) + num1);
                   pilabc[z2]= (char) numAleatorio;
                }
            }
        }

        System.out.println("valores agregados");
    }

    public void mostrar() {
        for (int i = tope - 1; i >= 0; i--) {
            System.out.print(" " + pilabc[i]);
        }
    }

    public void eliminar() {
        tope--;
        System.out.println("Dato eliminado...");
    }

    public void agregar(char w) {
        pilabc[tope] = w;
        tope++;
        System.out.println("Dato agregado..");
    }

    public void ordenar() {
        char aux;

        for (int i = 0; i < (26 - 1); i++) {
            for (int j = 0; j < (26 - 1); j++) {
                if (pilabc[j] > pilabc[j + 1]) {

                    aux = pilabc[j];
                    pilabc[j] = pilabc[j + 1];
                    pilabc[j + 1] = aux;
                }
            }

        }
        System.out.println("Datos ordenados...");
        for (int i = 0; i < 26; i++) {
            System.out.print(" " + pilabc[i]);
        }
    }

    public static void main(String[] args) {
        PilaAleatoria c = new PilaAleatoria();
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        do {
            System.out.println("\n1 llenar\n"
                    + "2 mostrar\n"
                    + "3 eliminar\n"
                    + "4 agregar\n"
                    + "5 Ordenar\n"
                    + "6 salir\n");
            switch (opt = sc.nextInt()) {
                case 1:
                    c.llenar();
                    break;
                case 2:
                    c.mostrar();
                    break;
                case 3:
                    c.eliminar();
                    break;
                case 4:
                    System.out.println("ingresa el dato");
                    char w = sc.next().charAt(0);
                    c.agregar(w);
                    break;

                case 5:
                    c.ordenar();

                    break;

            }
        } while (opt != 6);

    }

}
