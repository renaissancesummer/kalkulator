/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G3D;
import G2D.Lingkaran;
/**
 *
 * @author ACER
 */
public class Tabung extends Lingkaran implements Kalkulasi3D{
    
    double tinggitabung;
    public Tabung(double jarijari, double tinggitabung){
        super(jarijari);
        this.tinggitabung = tinggitabung;
    }

    @Override
    public double volume() {
        return Math.PI*jarijari*jarijari*tinggitabung;
    }
    
}