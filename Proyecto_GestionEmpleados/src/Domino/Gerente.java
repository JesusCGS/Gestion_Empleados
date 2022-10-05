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
public  class Gerente extends Empleado  {
   private int departamento;
   private int estudios;
//constructor

    public Gerente(int departamento, int estudios, int numss, double salario, String nombre, String apellido) {
        super(numss, salario, nombre, apellido);
        this.departamento = departamento;
        this.estudios = estudios;
    }
    

   
   
   
}
