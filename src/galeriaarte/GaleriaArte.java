/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galeriaarte;

import java.util.Scanner;

/**
 *
 * @author aribo
 */
public class GaleriaArte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo una obra
        Obra o01 = new Obra();
            o01.titulo = "Las meninas";
            o01.autor = "Velazquez";
            o01.anyo = 1656;
            o01.precio = 598.52f;
            
        //Calculo el precio de la Obra o01 si esta fuese de fama A
        System.out.println(o01.calcula_valor("A"));
        
        //Cambio el título de la Obra o01 a través del teclado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuál es el nuevo título de la obra?");
        String nuevo_titulo = teclado.nextLine();
        o01.cambia_titulo(nuevo_titulo);
        
    }
    
}
