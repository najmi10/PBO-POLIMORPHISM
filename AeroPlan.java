/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat_01;

/**
 *
 * @author ica
 */
public class AeroPlan extends Vehicle {
    @Override
    public void fuel(){
        System.out.println("Aeroplan fuels is full");
    }
    public static void main(String[] args) {
        AeroPlan garuda = new AeroPlan();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
    
}