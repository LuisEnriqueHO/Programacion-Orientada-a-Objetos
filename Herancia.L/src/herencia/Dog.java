
package herencia;

import java.util.Scanner;

/**
 *
 * @author OHMASTER
 */
public class Dog {

    String name;
    double weight;
    String colour;

    void LlenarDatosPerro() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del perro");
        name = sc.nextLine();

        System.out.println("Ingresa el color del perro");
        colour = sc.nextLine();

        System.out.println("Ingresa el peso del perro");
        weight = sc.nextDouble();

    }

    void VerSalida() {
       
        System.out.println("Los datos del perro son: ");
        System.out.println("Nombre del perro: " + name);
        System.out.println("Color del perro: " + colour);
        System.out.println("Peso: " + weight);

    }
}
