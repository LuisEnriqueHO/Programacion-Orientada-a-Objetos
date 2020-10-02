/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumapilas;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Wuicho
 */
public class SumaPilas {
    int pila1[], pila2[],pila3[];
   
public void llenarpilas(int resultado){
     pila1 = new int [resultado];
     for  (int i=0; i<resultado; i++){
         pila1[i]= (int)(Math.random()*(100));
        }
     
     pila2 = new int[resultado];
     for (int j=0; j<resultado; j++){
         pila2[j]=(int)(Math.random()*(200)+100);
     }
     System.out.println("Pilas llenadas...");
}

public void mostrarpilas(int resultado){
    System.out.print("Pila 1");
        for (int i=0;  i<resultado; i++){
            System.out.print(" " +pila1[i]);
        }
    System.out.print("Pila 2");
        for (int j=0; j<resultado; j++){
            System.out.println(" " +pila2[j]);
    }
}

public void eliminarpilas(int resultado){
    for (int i=0; i<resultado; i++){
        pila1[i]=0;
    }
    for (int j=0; j<resultado; j++){
        pila2[j]=0;
    }
    System.out.println("Los datos se eliminaron...");
}

public void sumarpilas(int resultado){
    pila3= new int [resultado];
        System.out.print("Pila 1\n");
    for (int i=0; i<resultado; i++){
        int total1= pila1[i];
        int total2= pila2[i];
        int suma = total1 + total2;
        pila3[i]= suma;
    }
    System.out.println("Pilas sumadas");
}
public void mostrar(int resultado){
    System.out.println("Pila 1\n");
        for (int i=0; i<resultado; i++){
            System.out.print(" "+ pila1[i]);
        }
        System.out.print("Pila 2");
        for (int j=0; j<resultado; j++){
            System.out.println(" "+pila2[j]);
        }
        System.out.println("Pila 3");
        for(int z=0; z<resultado; z++){
            System.out.println(" "+ pila3[z]);
        }
}

    public static void main(String[] args)throws IOException {
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println(" Ingrese el tamaño de las pilas: \n");
    String numero =br.readLine();
    int pilaresultado = Integer.parseInt(numero);
    SumaPilas p = new SumaPilas();
    Scanner sc = new Scanner (System.in);
    int opt = 0;
    do{
        System.out.println("\n1 Llenar pilas\n"
                  + "2 Mostrar pilas\n"
                  + "3 Vaciar pilas\n"
                  + "4 Unir pilas\n"
                  + "5 Mostrar pila C\n"
                  + "6 Salir");
          switch(opt=sc.nextInt()){
              case 1:
                  p.llenarpilas(pilaresultado);
                  break;
              case 2:
                  p.mostrarpilas(pilaresultado);
                  break;
              case 3:
                  p.eliminarpilas(pilaresultado);
                  break;
              case 4:
                  p.sumarpilas(pilaresultado);
                  break;
              case 5:
                  p.mostrar(pilaresultado);
                  break;
      }
    
    
       }while(opt!=6);
    }
    
}
