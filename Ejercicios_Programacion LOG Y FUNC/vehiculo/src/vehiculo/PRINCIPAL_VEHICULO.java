/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo;

import vehiculos.aereo;
import vehiculos.avion;
import vehiculos.helicoptro;
import vehiculos.acuatico;
import vehiculos.barco;
import vehiculos.velero;
import vehiculos.vehiculos;

/**
 *
 * @author Carlos
 */
public class PRINCIPAL_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        aereo a = new aereo();
        avion v = new avion();
        helicoptro h = new helicoptro();
        acuatico c = new acuatico();
        barco b = new barco();
        velero z = new velero();
        vehiculos e = new vehiculos();
        
        e.setNombre("EMPRESA TRASNPORT");
        System.out.println(e.getNombre());
        e.transportar();
        System.out.println("\t");
        
        a.setNombre("VOLARIS");
        System.out.println(a.getNombre());
        v.bajar_tren_de_aterizaje();
        h.encender_helices();
        System.out.println("\t");

        c.setNombre("ocean");
        System.out.println(c.getNombre());
        b.prender_motor();
        z.deslizar_velas();

// TODO code application logic here
    }

}
