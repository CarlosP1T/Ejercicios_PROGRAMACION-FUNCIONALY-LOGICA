/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;

/**
 *
 * @author Carlos
 */
public class acuatico extends vehiculos {
     protected String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

 
  public void navergar(){
System.out.println("Vehuculos listos para navegar");
}   
  
}
