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
       /* Lo comento para crear una colección y no me moleste lo creado anteriormente
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
    */
        //String datosObra;
        Obra[] coleccion;
        
        coleccion = new Obra[20];
        coleccion[0] = new Obra ("El jardín de las delicias", "El Bosco", 1515, 789.23f);
        coleccion[1] = new Obra ("La maja desnuda", "Goya", 1800, 954.00f);
        coleccion[2] = new Obra ("Las tres gracias", "Rubens", 1635, 457.47f);
        coleccion[3] = new Obra ("Venus y Adonis", "Tiziano", 1554, 475.38f);
        coleccion[4] = new Obra ("Niños en la playa", "Sorolla", 1910, 745.21f);
            
        //Creo un mecenas
        Mecenas m01 = new Mecenas();
            m01.nombre = "Ariadna";
            m01.anyo_nacimiento = 1996;
            m01.telefono = 697560597;
            
        //Cambio el numero de teléfono del mecenas
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuál es el nuevo teléfono del mecenas?");
        int nuevo_telefono = teclado.nextInt();
        m01.cambia_telefono(nuevo_telefono);
        
        //Calculo la edad del mecenas
        System.out.println(m01.calcula_edad(m01.anyo_nacimiento));
    }
    
}
