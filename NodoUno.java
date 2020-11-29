/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodouno;

import java.util.Scanner;

/**
 *
 * @author Wuicho
 */
public class NodoUno {

    public class nodo {

        String dato;
        nodo sig;

        /**
         * @param args the command line arguments
         */
        public void main(String[] args) {

            System.out.println("Que desea ocupar\n"
                    + "1. Pila\n"
                    + "2. colas");
            Scanner mc = new Scanner(System.in);
            int op = mc.nextInt();
            switch (op) {

                case 1:
                    nodo fin = null;
                    fin = new nodo();
                    fin.dato = "A";
                    fin.sig = null;
                    mostrar("caso 1", fin);
                    nodo temp;
                    temp = new nodo();
                    temp.dato = "B";
                    temp.sig = fin;
                    fin = temp;
                    mostrar("caso 2", fin);
                    break;
                case 2:
                    fin = null;
                    temp = new nodo();
                    temp.dato = "C";
                    temp.sig = null;
                    nodo temp2;
                    temp2 = fin;
                    while (temp2.sig != null) {
                        temp2 = temp2.sig;
                    }
                    temp2.sig = temp;
                    mostrar("case 3", fin);

                    break;
            }
        }

        public void mostrar(String dato, nodo actual) {
            System.out.println(dato + " ");
            while (actual != null) {
                System.out.println(actual.dato + " ");
                actual = actual.sig;
            }
        }

        public void ingresar(String dato, nodo actual) {
            System.out.println(dato + " ");
            while (actual != null) {
                System.out.println(actual.dato + " ");
                actual = actual.sig;
            }

        }

    }
}
