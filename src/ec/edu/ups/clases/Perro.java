/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;

/**
 *
 * @author ASUS
 */
public class Perro extends Animal implements Acciones
{

    @Override
    public void comer() 
    {
        System.out.println("El perro "+this.getNombre());
    }

    @Override
    public void dormir() 
    {
        System.out.println("");
    }

    @Override
    public void moverse() 
    {
       
    }

    @Override
    public void jugar() 
    {
       
    }

    @Override
    public void reproducirse() 
    {
       
    }
    
}
