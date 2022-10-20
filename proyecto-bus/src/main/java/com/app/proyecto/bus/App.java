/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.proyecto.bus;

/**
 *
 * @author ADSI
 */
public class App {
    
    public static void main(String[] args) {
        
        Bus bus1 = new Bus("thk-123", 10, 3000, 0, 0) ;
        System.err.println("SUBI 2");
        bus1.subirPasajeros(2); 
        System.err.println("BAJE 1");
        bus1.bajarPasajeros(1);         
        System.err.println("SUBI 10");
        bus1.subirPasajeros(10);        
        System.err.println("BAJE 5"); 
        bus1.bajarPasajeros(5);        
        System.err.println("SUBI 3");
        bus1.subirPasajeros(3); 
         
        System.out.println("hemos trasportado " + bus1.getTotalPasajeros()+ " en total hemos recogido " + bus1.getDineroAcumulado() + " en el bus van :"+bus1.getPasajerosActuales());
        
        
        
    } 
    
}
