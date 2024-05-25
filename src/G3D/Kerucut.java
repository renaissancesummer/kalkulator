/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G3D;
import G2D.Lingkaran;

/**
 *
 * @author Lenovo
 */
public class Kerucut extends Lingkaran implements Kalkulasi3D{
    public double tinggi;
    
    public Kerucut(double jarijari, double tinggi){
    super(jarijari);
    this.tinggi = tinggi;
    }
    
    public double volume(){
        return 0.33*super.luas()*tinggi;
    }
}
