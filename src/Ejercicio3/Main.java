/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Main {
    
    public static int factorial (int num){
        
        int resultado = 0;
        
        if(num == 0 || num == 1){
            
            resultado = 1;
            
        }else{
            
            resultado = num * factorial(num-1);
            
        }
                
        return resultado;
          
    }
    
    public static int coeficienteBinomial(int n, int k){
        
        int resultado = 0;
        
        resultado = factorial(n)/(factorial(k)*factorial(n-k));
        
        return resultado;
        
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int n = 0;
        int k = 0;
        
        do{
            
            System.out.println("Introduzca el valor de n: ");
            n = sc.nextInt();
            
            if (n < 0){
                System.out.println("El valor de n debe de ser >0");
            }
        
        }while(n < 0);
        
        do{
            
            System.out.println("Introduzca el valor de k: ");
            k = sc.nextInt();
            
            if (n < 0){
                System.out.println("El valor de k debe de ser >0");
            }
        
        }while(k < 0);
        
        System.out.println(coeficienteBinomial(n, k));
        
    }
    
}
