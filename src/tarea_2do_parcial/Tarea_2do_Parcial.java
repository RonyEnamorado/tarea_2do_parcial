/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_2do_parcial;

/**
 *
 * @author JERSON
 */
public class Tarea_2do_Parcial {

   
    public static void main(String[] args) {
        Hospital hospital1=new Hospital();
        hospital1=new Hospital(5, "Rojo", "Col.Mayac", 3, "Hospital Herrera");
        hospital1.hospital();
        
        System.out.println("");
        System.out.println("");
        Farmacia farmacia =new Farmacia("Pedro picapiedra", 5, 8, "Col. Palmira", "Blanco", "El Ahorro");
        farmacia.farmacia();
        System.out.println("");
        System.out.println("");
        Laboratorio laboratorio = new Laboratorio("Francisco", 14, "Enfrente del Hospital Escuela", "Morado", "Durom");
        laboratorio.laboratorio();
               
        
    }
    
}
