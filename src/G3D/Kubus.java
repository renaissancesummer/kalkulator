/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G3D;
import G2D.Persegi;
/**
 *
 * @author Lenovo
 */
public class Kubus extends Persegi implements Kalkulasi3D{
    
   public Kubus(double sisi){
       super(sisi);
   }
    
    public double volume(){
        return sisi*sisi*sisi;
    }
}
