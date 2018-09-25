/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio5;

/**
 *
 * @author daw
 */
public class Main {

    public static String cifradoCesar(String cadenaACifrar) {

        String resultado = "";

        for (int i = 0; i < cadenaACifrar.length(); i++) {

            switch (cadenaACifrar.charAt(i)) {
                case 'X':

                    resultado = resultado + Character.toString('A');

                    break;
                    
                case 'Y':

                    resultado = resultado + Character.toString('B');

                    break;
                    
                case 'Z':

                    resultado = resultado + Character.toString('C');

                    break;
                default:

                    resultado = resultado + Character.toString((char)(cadenaACifrar.charAt(i)+3));

                    break;
            }

        }

        return resultado;

    }

    public static void main(String[] args) {

        String cadena = "zapatilla";
        System.out.println(cifradoCesar(cadena.toUpperCase()));

    }

}
