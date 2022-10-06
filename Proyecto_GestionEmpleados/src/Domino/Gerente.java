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
   private int N_estudios;
//constructor

    public Gerente( String nombre, String apellido,int departamento, int N_estudios, int numss, double salario) {
        super(nombre, apellido,numss, salario);
        this.departamento = departamento;
        this.N_estudios = N_estudios;
    }

    public int getDepartamento() {
        return departamento;
    }
    
    //toString

    @Override
    public String toString() {
        return "Gerente{"+super.toString() + "departamento=" + departamento + ", N_estudios=" + N_estudios + '}';
    }
    
    

   
   
   
}
