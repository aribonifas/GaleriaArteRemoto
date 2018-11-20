/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galeriaarte;

/**
 *
 * @author aribo
 */
public class Mecenas {
    //Creo variables de la clase Mecenas
    String nombre;
    int anyo_nacimiento;
    int telefono;
    
    //Creo un método para cambiar el teléfono
    void cambia_telefono (int nuevo_telefono){
        telefono = nuevo_telefono;
        }
    
    //Creo un método para calcular la edad de un mecenas
    int calcula_edad (int edad_mecenas){
       edad_mecenas = 2018 - anyo_nacimiento;
        return edad_mecenas;
        }
        
    
    }
