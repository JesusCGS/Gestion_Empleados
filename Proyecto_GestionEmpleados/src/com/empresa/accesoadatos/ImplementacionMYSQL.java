/*
 * estsa calse implementa las operaciones de datos con MYSQL
 */
package com.empresa.accesoadatos;

/**
 *
 * @author el novio de tu mama
 */
public class ImplementacionMYSQL implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("insertando desde MYSQL");
    }

    @Override
    public void listar() {
        System.out.println("listando desde MYSQL");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizando desde MYSQL"); 
    }

    @Override
    public void eliminar() {
        System.out.println("eliminando desde MYSQL");  
    }
    
    
    
}
