/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galeriaarte;

import java.util.ArrayList;
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
        
        int numObras = 0 ;
        String tittle;
        String author;
        int year;
        float prize;
        
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
        //Creación de una colección con vectores
        Obra[] coleccion;
        
        coleccion = new Obra[20];
        coleccion[0] = new Obra ("El jardín de las delicias", "El Bosco", 1515, 789.23f);
        coleccion[1] = new Obra ("La maja desnuda", "Goya", 1800, 954.00f);
        coleccion[2] = new Obra ("Las tres gracias", "Rubens", 1635, 457.47f);
        coleccion[3] = new Obra ("Venus y Adonis", "Tiziano", 1554, 475.38f);
        coleccion[4] = new Obra ("Niños en la playa", "Sorolla", 1910, 745.21f);
        numObras = 5;
        /*
        //Prueba para ver el título de la obra [2] de la coleccion
        System.out.println(coleccion[2].titulo);
            
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
        System.out.println(m01.calcula_edad(m01.anyo_nacimiento)); */
        
        //creo un ArrayList de mecenas
        ArrayList<Mecenas> listaMecenas = new ArrayList<Mecenas>();
        listaMecenas.add(new Mecenas ("Ariadna Bonifás", 1996, 610570593));
        listaMecenas.add(new Mecenas ("Marta Roig", 1976, 665573689));
        listaMecenas.add(new Mecenas ("Nerea Sospedra", 2004, 612345678));
        listaMecenas.add(new Mecenas ("Vicenta Montull", 1942, 687654321));
        listaMecenas.add(new Mecenas ("Lidia Roig", 1972, 612345789));
        
        /*listaMecenas.add("Ariadna Bonifas");
        listaMecenas.add("Lara Carreño");
        listaMecenas.add("Begoña Cerda");
        listaMecenas.add("Laura Cabrera");
        listaMecenas.add("Naldo Bonifas");*/
        
        //Creación del menú
        
        int opcion = 0;
        while (opcion != 5){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Menú");
        System.out.println("Pulse 1 para introducir una obra");
        System.out.println("Pulse 2 para listar las obras");
        System.out.println("Pulse 3 para introducir un mecenas");
        System.out.println("Pulse 4 para listar los mecenas");
        System.out.println("Pulse 5 para salir");
        opcion = teclado.nextInt();
                switch (opcion){
            case 1:
                opcion = 1;
                
                System.out.println("Introduzca título ");
                tittle = teclado.next();
                System.out.println("Introduzca autor ");
                author = teclado.next();
                System.out.println("Introduzca año ");
                year = teclado.nextInt();
                System.out.println("Introduzca precio ");
                prize = teclado.nextFloat();
                
                
                coleccion[numObras] = new Obra (tittle, author, year, prize);
                numObras ++;
                                
                break;
                
            case 2:
                opcion = 2;
                               
                for (int i=0; i<numObras; i++){
                System.out.println(" - " + coleccion[i].titulo);}
                break;
                
            case 3:
                opcion = 3;
                               
                System.out.println("Cómo se llama el nuevo mecenas?");
                String nom = teclado.next();
                System.out.println("Que año nació? ");
                int aNacimiento = teclado.nextInt();
                System.out.println("Cuál es su número de telefono? ");
                int telf = teclado.nextInt();
                
                listaMecenas.add(new Mecenas(nom, aNacimiento, telf));
                
                
                break;
                
            case 4: 
                opcion = 4;
                
                for (int i=0; i<listaMecenas.size(); i++){
                    System.out.println(" - " + listaMecenas.get(i));
                    }
                break;
                
            case 5: 
                opcion = 5;
                
                System.out.println("Hasta luego");
                System.exit(0);
                
                
            default:
                
                System.out.println("Introduzca un número del 1 al 5");
                
                
        }
        
    }
}
}

