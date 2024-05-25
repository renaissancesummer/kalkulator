/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G2D;

/**
 *
 * @author ACER
 */
public class Trapesium implements Kalkulasi2D{
    
    public double tinggi;
    public double sisi1;
    public double sisi2;
    
    public Trapesium (double tinggi, double sisi1, double sisi2){
    this.tinggi = tinggi;
    this.sisi1 = sisi1;
    this.sisi2 = sisi2;
    }

    @Override
    public double keliling() {
        return sisi1 + sisi2 + 2*(Math.sqrt((0.25*(sisi1-sisi2)*(sisi1-sisi2)) + (tinggi*tinggi)));
    }

    @Override
    public double luas() {
        return 0.5*(sisi1+sisi2)*tinggi;
    }
    
}
