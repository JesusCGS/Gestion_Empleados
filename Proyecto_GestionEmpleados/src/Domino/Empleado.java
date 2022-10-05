/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domino;

/**
 *
 * @author Alumno Mañana
 */
public class Empleado extends Persona{
        private int numss;
        private double salario;
    public Empleado(String nombre, String apellido) {
        super(nombre, apellido);
    }

   /* @Override
    public final void imprimir(){
        System.out.println("imprimiendo desde la clase padre ...");
    }*/

    public Empleado(int numss, double salario, String nombre, String apellido) {
        super(nombre, apellido);
        this.numss = numss;
        this.salario = salario;
    }

    
    
    
}
