/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Domino.Empleado;
import Domino.Gerente;
import Domino.Persona;
import com.empresa.accesoadatos.IAccesoDatos;
import com.empresa.accesoadatos.ImpMongo;
import com.empresa.accesoadatos.ImplementacionMYSQL;

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
        
        System.out.println("\n\n====================\n\n");
        System.out.println("matriz de personas");
        matriz_de_personas();
        System.out.println("=====================");
        //metodo de imprimir variables
        System.out.println("primera llamada");
        imprimir_metodo_variable(1,2,3);
        System.out.println("segunda llamada");
        imprimir_metodo_variable(253,1);
        
        imprimir_todo_jesus();
        
        
        
    }
    
    
    public static void matriz_de_personas(){
        
        
    Integer numeros[]={12,2,43};
       
        Persona e1 = new Empleado("Loken","swift");
        Persona e2 = new Empleado("LUIS","morado");
        Persona e3 = new Empleado("Loken","swift");
        Persona e4 = new Empleado("LUIS","morado");
        
        Persona empleado[]= {e1,e2};
        
        Persona matri[][]=new Persona [2][2];
        matri[0][0]=e1;
        matri[0][1]=e2;
        matri[1][0]=e3;
        matri[1][1]=e4;
        
      /* for (int i = 0; i < empleado.length; i++) {
          
        }*/
        for (int i = 0; i < matri.length; i++) {
            if (i==0) System.out.println("socios: ");
            else System.out.println("Directores: ");
            for (int j = 0; j < matri[i].length; j++) {
                System.out.println(matri[i][j]);
            }
                
        }
        //llamamos al metodo imprimir para imprimir tanto mi lista de empleados como la de los numeros
        System.out.println("imprimiendo numero");
        imprimir(numeros);
        System.out.println("imprimiendo empleados");
        imprimir(empleado);
        
        
        
    }
    
    public static void imprimir(Object lista[]){
        System.out.println("imprimir");
        for (int i = 0; i < lista.length; i++) {
            System.out.println("lista"+i+" = "+lista[i]);
        }
    }
    public static void imprimir_metodo_variable(int...numeros){
        System.out.println("imprimir_metodo_variable");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("EL numero "+i+" = "+numeros[i]);
        }
        
    }
    // Demostración Argumentos Variables en Java

    //ejercicio de imprimir todo
    
   public static void imprimir_todo_jesus(){
       
       
       
       Persona p1 = new Persona  ("GONZAÑO ","MORAÑO  ");
       Persona p2 = new Persona  ("LUIS    ","MORADO  ");
       Empleado e3 = new Empleado("NIKO    ","BELTREKE",33,32.5){};
       Empleado e4 = new Empleado("JOSE    ","LUIS    ",34,1132.5){};
       Gerente g5 = new Gerente  ("SERGIO  ","MALLOR  ",5,5,65,2093.65){};
       Gerente g6 = new Gerente  ("SANTIAGO","LOREIN  ",6,6,66,2189.05){};
       
       System.out.println("santi metodo detalles");
        mostrarDetallesSanti(g6);
         //instando de la interfaz con la impl de mongo
        IAccesoDatos datosMong = new ImpMongo();
         //instando de la interfaz con la impl de mysql
        IAccesoDatos datosMYSQL = new ImplementacionMYSQL();
       
        datosMong.listar();
                
        datosMYSQL.listar();
        
        imprimirDatos(datosMong);
       
      /* Persona matriz[][]=new Persona [3][2];
        matriz[0][0]=p1;
        matriz[0][1]=p2;
        matriz[1][0]=e3;
        matriz[1][1]=e4;
        matriz[2][0]=g5;
        matriz[2][1]=g5;
  
        //visualizar la tabla
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<5;j++){
                System.out.print("\t"+matriz[i][j]);
            }
            System.out.println("");
        }
    
        /*
         for (int i = 0; i < matriz.length; i++) {
            if (i==0) System.out.println("socios: ");
            else  System.out.println("Directores: ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }
                
        }*/
       
   }
   
   public static void mostrarDetallesSanti(Persona persona){
       //OBJETOS
       Persona p1 = new Persona  ("GONZAÑO ","MORAÑO  ");
       Persona p2 = new Persona  ("LUIS    ","MORADO  ");
       Empleado e3 = new Empleado("NIKO    ","BELTREKE",33,32.5){};
       Empleado e4 = new Empleado("JOSE    ","LUIS    ",34,1132.5){};
       Gerente g5 = new Gerente  ("SERGIO  ","MALLOR  ",5,5,655,2093.65){};
       Gerente g6 = new Gerente  ("SANTIAGO","LOREIN  ",6,6,666,2189.05){};
       
       
       //METODO
       if(persona instanceof Persona){
           System.out.println("ES UN PERSONA");
           
       }
       if(persona instanceof Empleado){
           System.out.println("ES UN EMPLEADO");
           System.out.println(((Empleado)persona).getNumss());
       }
       if(persona instanceof Gerente){
           System.out.println("ES UN GERENTE");
           System.out.println(((Gerente)persona).getDepartamento());
       }
       
   }
   public static void imprimirDatos(IAccesoDatos datos){
       datos.listar();
   }
}
