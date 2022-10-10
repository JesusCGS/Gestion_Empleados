/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.empresa.accesoadatos;

/**
 *
 * @author el novio de tu mama
 */
public class ImpMongo implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("insertando desde mongoBD");
    }

    @Override
    public void listar() {
        System.out.println("listando desde mongoBD"); 
    }

    @Override
    public void actualizar() {
        System.out.println("actualizando desde mongoBD"); 
    }

    @Override
    public void eliminar() {
        System.out.println("eliminando desde mongoBD"); 
    }
    
}
