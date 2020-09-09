/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularidad;

/**
 *
 * @author Wuicho
 */  
import java.util.Scanner;
public class Modularidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double l1, l2, l3;   //Declaramos 3 variables de tipo double por si contiene decimal, donde cada variable representa un lado del triangulo
        Scanner teclado = new Scanner(System.in); //Usamos Scanner para que pueda leer el teclado
        System.out.println("----TIPO DE TRIANGULO----"); //Linea de codigo que solo imprime
        System.out.println("Introduce sus medidas de los tres lados : "); //Linea de codigo que imprime
        System.out.println("Lado 1 : "); //Linea de codigo donde pide el lado 1
        l1=teclado.nextDouble(); //Lee el lado 1
        System.out.println("Lado 2 : "); //Linea de codigo donde pide el lado 2
        l2=teclado.nextDouble(); //Lee el lado 2
        System.out.println("Lado 3 : "); //Linea de codigo donde pide el lado 3
        l3=teclado.nextDouble(); //Lee el lado 3
        if (l1==l2 && l1==l3){ //Estamos diciendo que si l1 es igual a l2 y que si l1 es igual a l2
        trianguloequilatero(); // Imprima el modulo triangulo equilatero ya que sus tres lados son iguales
        } //Termina el primer if
        if(l1==l2 && l1!=l3){ //Estamos diciendo que si l1 es igual a l2 y l1 es diferente a l3
        trianguloisoceles(); //Imprima el modulo de triangulo isoceles ya que el triangulo tiene dos iguales y uno diferente
        } //Termina segundo if
        if (l1 != l2 && l1 !=l3){ //Estamos diciendo que si l1 es diferente de l2 y l1 es diferente de l3
        trianguloescaleno(); //Imprima el modulo de triangulo escaleno ya que todos sus lados son diferentes
        }  //Termina tercer if
    }
    public static void trianguloequilatero(){ //Modulo de triangulo equilatero
        System.out.println("Es un triangulo equilatero"); //Imprime que el triangulo es equilatero si se cumple el if
    }
    public static void trianguloisoceles(){ //Modulo de triangulo isoceles
        System.out.println("Es un triangulo isoceles"); //Imprime que el triangulo es isoceles si se cumple el if
    }
    public static void trianguloescaleno(){ //Modulo de triangulo escaleno
        System.out.println("Es un triangulo escaleno");//25Imprime que el triangulo es escaleno si se cumple el if
       
    }
    
}
