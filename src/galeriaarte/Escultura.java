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
public class Escultura extends Obra{
    
    private String material;
    private Float peso;
    
    public Escultura (String nom, String aut, int an, Float prec, String mat, Float pes){
        super(nom, aut, an, prec);
        this.material = mat;
        this.peso = pes;
    }
}
