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
public abstract class Vehicle{
    public void function(){
        System.out.println("Transportation Tools");
    }
    public void walk(){
       System.out.println("Walk");
    }
    public abstract void fuel();
    
}

