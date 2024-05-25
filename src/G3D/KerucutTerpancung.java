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
public class KerucutTerpancung extends Lingkaran implements Kalkulasi3D {
    public double radiusAtas;
    public double tinggi;
    
    public KerucutTerpancung(double jarijari, double radiusAtas, double tinggi){
        super(jarijari);
        this.radiusAtas = radiusAtas;
        this.tinggi = tinggi;
    }

    public double volume() {
        return 0.33*Math.PI*tinggi*(jarijari*radiusAtas+radiusAtas*radiusAtas+jarijari*jarijari);
    }
}
