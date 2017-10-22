/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscarnumero;

import java.util.Scanner;

/**
 *
 * @author dci
 */
public class Buscarnumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 10;
        int [] numeros = new int [n];
        int i;
        int esta = 0; /*esta = 0 significa que supodremos que el numero que deseas buscar el usuario no esta en el arreglo*/
        int NumBuscar;
        Scanner intro = new Scanner(System.in);
        
        //primero ingresamos los numeros
        for ( i = 0;  i< n; i++) {
        System.out.println("ingrese los numeros para la celda n " + i + ": ");
            numeros[i]= intro.nextInt();     
        }
        // despues el usuario ingresa el numero que desea buscar
        System.out.println("ingrese el numero que desea buscar");
        NumBuscar = intro.nextInt();
        
        //despues buscamos el numero ingresado en el arreglo
        for ( i = 0; i < n; i++) {
            if (NumBuscar == numeros[i]){
                //cambiamos la variable esta a 1, que significa verdadero
                esta = 1;
                break;
            }
            
        }
        if (esta == 0 ){ //si mantuvo  el valor cero quiere decir que el numero no esta
            System.out.println("El " + NumBuscar + " No esta en el arreglo");     
        }else
            System.out.println("El " + NumBuscar + " Si esta en el arreglo");
    }
    
}
