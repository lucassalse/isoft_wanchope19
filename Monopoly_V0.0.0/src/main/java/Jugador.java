/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class Jugador {
    
    String nombre ; //Nombre del jugador
    String color ;  //Color de la pieza del jugador
    int saldo ;     //Monto actual del jugador
    
    public Jugador(String nombre, String color ){ //constructor de la clase jugador
        this.nombre = nombre  ;
        this.color = color ;
        saldo = 10000 ; //Saldo inicial
            
    }
    public String getNombre(){
        return nombre ;
    }
    public String getColor(){
        return color ;
    }
    public int getSaldo(){
        return saldo ;
    }
    
    
}