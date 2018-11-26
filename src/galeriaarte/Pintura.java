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
public class Pintura extends Obra{
    
    private String tecnica;
    
    public Pintura (String nom, String aut, int an, Float prec, String tec){
        super(nom, aut, an, prec);
        this.tecnica = tec;
               
    }
   
         
}
