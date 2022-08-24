/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche1;

/**
 *
 * @author jenva
 */
public class Coche1 {

    
    public static void main(String[] args) {        
        
        //4. Crear un Objeto miCoche en el main y añadirle una puerta
        
        Coche miCoche=new Coche();
        miCoche.agregarP();
        miCoche.agregarP();
        miCoche.agregarP();
        miCoche.agregarP();
               
        
        //5. Mostrar el nùmero de puertas que tiene el objeto
        
        miCoche.mostrarP();
        
        
        
    }
    
}
