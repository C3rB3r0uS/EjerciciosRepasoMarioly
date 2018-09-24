/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author daw
 */
public class Main {

    public static int getParteEntera(double numero) {

        int parteEntera = 0;
        String aux = Double.toString(numero);

        String entera = aux.substring(0, aux.indexOf("."));
        parteEntera = Integer.parseInt(entera);

        return parteEntera;

    }

    public static int getParteDecimal(double numero) {

        int parteDecimal = 0;
        String aux = Double.toString(numero);

        String decimal = aux.substring(aux.indexOf(".") + 1, aux.length());
        parteDecimal = Integer.parseInt(decimal);

        return parteDecimal;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int respuesta = 0;

        do {

            System.out.println("Introduzca un número: ");
            double num = sc.nextDouble();

            System.out.println("¿ Qué desea hacer ?");
            System.out.println("1 - Parte entera");
            System.out.println("2 - Parte decimal");
            System.out.println("3 - Salir del programa");

            respuesta = sc.nextInt();
            System.out.println(" ");

            switch (respuesta) {

                case 1:

                    System.out.println(getParteEntera(num));
                    break;

                case 2:

                    System.out.println(getParteDecimal(num));
                    break;

                case 3:

                    System.exit(0);

            }

        } while (respuesta < 3);
        
    }

}
