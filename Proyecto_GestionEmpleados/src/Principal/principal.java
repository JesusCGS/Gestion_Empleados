/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Domino.Empleado;
import Domino.Persona;

/**
 *
 * @author Alumno Mañana
 */
public class principal {
    public static int contador;
     
    
    
    public static void main(String[] args) {
        Empleado formulario [] = new Empleado[2];
        Empleado e1 = new Empleado("gonzalo","moraño");
        Empleado e2 = new Empleado("niko","beltreke");
        
        /*
        //crear una apersona
        
        Persona p1 = new Persona ("GONZALO","MORAÑO");
        Persona p2 = new Persona ("NIKO","BELTREKE");
        
        //visualizar la persona
        System.out.println(p1);
        System.out.println(p2);
        */
        formulario[0]=e1;
        formulario[1]=e2;
        
        for (int i = 0; i < formulario.length; i++) {
            System.out.println(formulario[i]);
        }
        
        
    }
    
}
