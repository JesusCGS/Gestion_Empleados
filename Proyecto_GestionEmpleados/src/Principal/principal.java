/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Domino.Persona;

/**
 *
 * @author Alumno Mañana
 */
public class principal {
    public static int contador;
     
    
    public static void main(String[] args) {
        Persona p1 = new Persona ("GONZALO","MORAÑO");
        Persona p2 = new Persona ("NIKO","BELTREKE");
        
        System.out.println(p1);
        System.out.println(p2);
        
        
    }
    
}
