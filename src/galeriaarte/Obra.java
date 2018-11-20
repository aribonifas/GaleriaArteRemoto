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
public class Obra {
        //Creo las variables de la clase Obra
    String titulo;
    String autor;
    int anyo;
    Float precio;
    
    //Creo un método para calcular el valor de las obras según la fama de su autor.
    //Pudiendo ser de fama A (el precio aumenaría) o fama B (el precio se mantiene)
    float calcula_valor (String fama_autor){
        if (fama_autor.equals("A")){
            return precio*10;
            }
        else{
            return precio;
            }
        }
    
    //Creo un método para cambiar el título de las obras
    void cambia_titulo(String nuevo_titulo){
        titulo = nuevo_titulo;
        }
    
}
