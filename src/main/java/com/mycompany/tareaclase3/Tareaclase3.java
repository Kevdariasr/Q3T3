package com.mycompany.tareaclase3;
/**
 *
 * @author kevda
 */

public class Tareaclase3 {

    public static void main(String[] args) {
        System.out.println("Kevin Arias");
        
        palaprincipal a1 = new palaprincipal(); //cambio para la tarea 4
        palaprincipal b1 = new palaprincipal(); //cambio para la tarea 4
        Helicoptero llamar = new Helicoptero(a1,b1); //cambio para la tarea 4
        
        llamar.m.encendido();
        
        
        String vueltas = llamar.H.vueltas;
        llamar.H.encender();
        llamar.R.vueltas = 100;
    }
}
