/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.proyecto.bus;

/**
 *
 * @author ADSI
 */
public class Bus {
    
    private String placa;
    private int capacidadPasajeros;
    private double preciosPasaje;
    private int pasajerosActuales;
    private int totalPasajeros;

    public Bus() {
    }

    public Bus(String placa, int capacidadPasajeros, double preciosPasaje, int pasajerosActuales, int totalPasajeros) {
        this.placa = placa;
        this.capacidadPasajeros = capacidadPasajeros;
        this.preciosPasaje = preciosPasaje;
        this.pasajerosActuales = pasajerosActuales;
        this.totalPasajeros = totalPasajeros;
    }

    public String getPlaca() {
        return placa;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public double getPreciosPasaje() {
        return preciosPasaje;
    }

    public int getPasajerosActuales() {
        return pasajerosActuales;
    }

    public int getTotalPasajeros() {
        return totalPasajeros;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public void setPreciosPasaje(double preciosPasaje) {
        this.preciosPasaje = preciosPasaje;
    }

    public void setPasajerosActuales(int pasajerosActuales) {
        this.pasajerosActuales = pasajerosActuales;
    }

    public void setTotalPasajeros(int totalPasajeros) {
        this.totalPasajeros = totalPasajeros;
    }

    public void subirPasajeros(int pasajeros){
        
        int maximo = this.capacidadPasajeros - this.pasajerosActuales;
        
        if(pasajeros <= maximo){
          this.pasajerosActuales = this.pasajerosActuales + pasajeros;
          this.totalPasajeros = this.totalPasajeros + pasajeros;
        } else {
            this.pasajerosActuales = this.pasajerosActuales + maximo;
          this.totalPasajeros = this.totalPasajeros + maximo;
        }
        
        
    }
    
    public double getDineroAcumulado(){
        return this.preciosPasaje * this.totalPasajeros;
    }
    
    
    public void bajarPasajeros(int pasajeros){
        if (pasajeros <= this.pasajerosActuales){
             this.pasajerosActuales = this.pasajerosActuales - pasajeros;
        }else{
            this.pasajerosActuales = 0;
        }
      
        
    }
}
