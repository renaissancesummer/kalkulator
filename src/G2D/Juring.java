/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G2D;
import G2D.Lingkaran;
/**
 *
 * @author ACER
 */
public class Juring extends Lingkaran implements Kalkulasi2D {
    
    double sudut;
    public Juring (double jarijari, double sudut){
        super(jarijari);
        this.sudut = sudut;
    }
    
    @Override
    public double keliling() {
        return (2*jarijari) + ((sudut/360)*Math.PI*2*jarijari);
    }

    @Override
    public double luas() {
        return (sudut/360)*Math.PI*jarijari*jarijari;
    }
    
    
    
}