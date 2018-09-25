/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Main {

    public static void main(String[] args) {

        int valor = 0;

        do {

            System.out.println("Introduzca un valor > 0: ");
            Scanner sc = new Scanner(System.in);
            valor = sc.nextInt();
            
            if(valor < 0){
                System.out.println("El valor introducido debe ser >0");
            }
            
        } while (valor < 0);

        do{
            
            if(valor%2 == 0){
                
                valor = valor/2;
                System.out.print(valor + " ");
                
            }else{
                
                valor = valor * 3 + 1;
                System.out.print(valor + " ");
                
            }
            
        }while(valor > 1);
        
        System.out.println(" ");

    }

}
