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
    
public Mecenas (String nom, int aNacimiento, int telf){
    nombre = nom;
    anyo_nacimiento = aNacimiento;
    telefono = telf;
    }

    //Creo un método para cambiar el teléfono
    void cambia_telefono (int nuevo_telefono){
        telefono = nuevo_telefono;
        }
    
    //Creo un método para calcular la edad de un mecenas
    int calcula_edad (int anyoActual){
        return anyoActual - anyo_nacimiento;
        }
        
    
    }
