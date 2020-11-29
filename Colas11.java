/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas.pkg1.pkg1;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Wuicho
 */
public class Colas11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner mc = new Scanner(System.in);
        int a, top = 0, b;

        System.out.println("ingresa el tamaño de la pila");
        int[] pila = new int[b = mc.nextInt()];
        {

            do {
                System.out.println("\n1 - agregar\n"
                        + "2 - mostrar\n"
                        + "3 - eliminar\n"
                        + "5 - salir\n");
                switch (a = mc.nextInt()) {
                    case 1:
                        if (top < b) {
                            System.out.println("ingresa un valor");
                            pila[top] = mc.nextInt();
                            top++;
                        } else {
                            System.out.println("la pila esta llena..");
                        }
                        break;
                    case 2:
                        if (top > 0) {
                            for (int i = top - 1; i >= 0; i--) {
                                System.out.print(" " + pila[i]);
                            }
                        } else {
                            System.out.println("la pila esta vacia..");
                        }
                        break;
                    case 3:
                        if (top > 0) {
                            System.out.println("el dato ha eliminado..");
                            top--;
                        } else {
                            System.out.println("la pila esta vacia..");
                        }
                        break;
                }
            } while (a
                    != 5);

        }

        public static class Pila2 {

        char pilabc[] = new char[26];
        int tope = 0;

        public void llenar() {
            char letra = 'A';
            for (int i = 0; i < 26; i++) {
                if (tope < 26) {
                    pilabc[tope] = letra;
                    letra++;
                    tope++;
                } else {
                    System.out.println("pila llena");
                    break;
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
            System.out.println("dato eliminado...");
        }

        public void agregar(char w) {
            pilabc[tope] = w; //$ *
            tope++;
            System.out.println("dato agregado..");
        }

        public static void main(String[] args) {
            Pila2 c = new Pila2();

            Scanner sc = new Scanner(System.in);
            int opt = 0;
            do {
                System.out.println("\n1 llenar\n"
                        + "2 mostrar\n"
                        + "3 eliminar\n"
                        + "4 agregar"
                        + "5 Ordenar\n"
                        + "5 salir\n");
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
                }
            } while (opt != 5);
        }
        int pila1[] = new int[10];
        int pila2[] = new int[10];
        int pila3[] = new int[10];
        int Tope = 0;

        public void llenar1() {
            int letra = '1';
            for (int i = 0; i < 10; i++) {
                if (tope < 10) {
                    pila1[tope] = letra;
                    letra++;
                    tope++;
                } else {
                    System.out.println("pila llena");
                    break;
                }
            }
            System.out.println("valores agregados");
        }

        public void llenar1() {
            int letra = '1';
            for (int j = 0; j < 10; j++) {
                if (tope < 10) {
                    pila2[tope] = letra;
                    letra++;
                    tope++;
                } else {
                    System.out.println("pila llena");
                    break;
                }
            }
            System.out.println("valores agregados");
        }

        public void mostrar1() {
            for (int i = tope - 1; i >= 0; i--) {
                System.out.print(" " + pila1[i]);
            }
        }

        public void mostrar11() {
            for (int j = tope - 1; j >= 0; j--) {
                System.out.print(" " + pila2[j]);
            }
        }

        public void eliminar1() {
            tope--;
            System.out.println("datos eliminados...");
        }

        public static int sumaPilaEnteros(Stack pila) {

            if (pila.empty()) {
                return 0;
            } else {
                return ((Integer) pila.pop()) + sumaPilaEnteros(pila);
            }
        }

        public static String sumaPilaCadenas(Stack pila) {
            if (pila.empty())//utilizas un if 
            {
                return "";
            } else {
                return (String) pila.pop() + sumaPilaCadenas(pila);
            }
        }

        public void mostrarsuma() {
            for (int j = tope - 1; j >= 0; j--) {
                System.out.print(" " + pila3[j]);
            }
        }

        public static void main2(String[] args) {
            Pila3 c = new Pila3();

            Scanner mc = new Scanner(System.in);
            int opt = 0;
            do {
                System.out.println("\n1 llenar\n"
                        + "2 mostrar\n"
                        + "3 eliminar\n"
                        + "4 agregar"
                        + "5 unir pilas\n"
                        + "6mostrar\n");
                switch (opt = mc.nextInt()) {
                    case 1:
                        c.llenar();
                        c.llenar1();
                        break;
                    case 2:
                        c.mostrar();
                        System.out.println("");
                        c.mostrar1();
                        break;
                    case 3:
                        c.eliminar();
                        break;
                    case 4:
                        c.mostrarsuma();
                        break;
                    case 5:
                        c.mostrarsuma();
                        break;
                }
            } while (opt != 6);
        