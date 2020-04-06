package ordenarray;

import java.util.Scanner;

/**
 *
 * @author Wuicho
 */
public class OrdenArray {

    static int[] arreglo = new int[10];
    static Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        insertarDatosArray();
        OrdenArray();

    }

    private static void insertarDatosArray() {

        Scanner lector = new Scanner(System.in);
        int limite, i, j, aux;
        System.out.println("Ingrese tamaño de la lista menor o igual a 10  : ");
        limite = lector.nextInt();

        for (i = 0; i < limite; i++) {
            System.out.print("\n[" + (i + 1) + "]= ");
            arreglo[i] = lector.nextInt();
        }

        for (i = 0; i < limite; i++) {
            for (j = i + 1; j < limite; j++) {
                if (arreglo[i] > arreglo[j]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
    }

    private static void OrdenArray() {
        System.out.print("\nOrden:  {");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + ",");
        }
        System.out.println("} ");

    }

}
