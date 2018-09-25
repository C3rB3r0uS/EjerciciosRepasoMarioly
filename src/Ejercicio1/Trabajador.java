/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;

/**
 *
 * @author daw
 */
public class Trabajador {

    private String nombre;
    private int edad;
    private int categoria;
    private int antiguedad;

    public Trabajador(String nombre, int edad, int categoria, int antiguedad) {

        this.nombre = nombre;

        if (edad < 0) {

            throw new IllegalArgumentException();

        } else {

            this.edad = edad;

        }

        if (categoria < 0 || categoria > 2) {

            throw new IllegalArgumentException();

        } else {

            this.categoria = categoria;

        }

        if (antiguedad < 0 || antiguedad > 2) {

            throw new IllegalArgumentException();

        } else {

            this.antiguedad = antiguedad;

        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {

        if (edad < 0) {

            throw new IllegalArgumentException();

        } else {

            this.edad = edad;

        }
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {

        if (categoria < 0 || categoria > 2) {

            throw new IllegalArgumentException();

        } else {

            this.categoria = categoria;

        }

    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {

        if (antiguedad < 0 || antiguedad > 2) {

            throw new IllegalArgumentException();

        } else {

            this.antiguedad = antiguedad;

        }

    }

    public double CalcularSueldo() {

        double sueldo = 607;

        switch (categoria) {

            case 0:

                sueldo = sueldo + (sueldo * 0.15);
                break;

            case 1:

                sueldo = sueldo + (sueldo * 0.35);
                break;

            case 2:

                sueldo = sueldo + (sueldo * 0.65);
                break;

        }

        switch (antiguedad) {

            case 0:

                sueldo = sueldo + 150;
                break;

            case 1:

                sueldo = sueldo + 300;
                break;

            case 2:

                sueldo = sueldo + 600;
                break;

        }

        return sueldo;

    }

}
