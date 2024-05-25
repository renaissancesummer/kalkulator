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
public class Bola extends Lingkaran implements Kalkulasi3D{
    
    public Bola (double jarijari){
        super(jarijari);
    }

    @Override
    public double volume() {
        return 1.33*Math.PI*jarijari*jarijari*jarijari;
    }
    
}