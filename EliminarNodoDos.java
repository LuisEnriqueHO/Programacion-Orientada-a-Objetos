/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eliminarnododos;

import java.util.Scanner;

/**
 *
 * @author Wuicho
 */
public class EliminarNodoDos {

    Scanner sc = new Scanner(System.in);

    static class Nodo {

        String dato;
        Nodo sig;
    }

    Nodo fin = null;

    public void agregar() {
        Nodo temp;
        String msg;
        System.out.println("Agrega el dato ");
        if (fin == null) {
            fin = new Nodo();
            fin.dato = sc.nextLine();
            fin.sig = null;
        } else {
            temp = new Nodo();
            temp.dato = sc.nextLine();
            temp.sig = fin;
            fin = temp;
        }
    }

    public void mostrar() {
        Nodo actual = new Nodo();
        actual = fin;
        if (fin != null) {
            while (actual != null) {
                System.out.print(" Dato " + "[" + actual.dato + "]");
                actual = actual.sig;
            }
        } else {
            System.out.println("\n La lista esta vacia\n");
        }
    }

    public void eliminar() {
        Nodo eliminar = new Nodo(); 
        eliminar = fin.sig; 
        fin = eliminar; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        String dato;
        EliminarNodoDos n = new EliminarNodoDos();
        do {
            System.out.println("1 add \n"
                    + "2 Mostrar \n"
                    + "3 Eliminar \n"
                    + "4 Salir");
            switch (opt = sc.nextInt()) {
                case 1:
                    n.agregar();
                    break;

                case 2:
                    n.mostrar();
                    break;

                case 3:
                    n.eliminar();
                    break;
            }
        } while (opt != 4);
    }

}
