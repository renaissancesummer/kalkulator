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
public class Ellips implements Kalkulasi2D{
    
    public double jarisatu;
    public double jaridua;
    
    public Ellips(double jarisatu, double jaridua) {
    this.jarisatu = jarisatu;
    this.jaridua = jaridua;
    }

    @Override
    public double keliling() {
        return Math.PI*((3*jarisatu)+(3*jaridua) - Math.sqrt((3*jarisatu+jaridua)*(3*jaridua+jarisatu)));
    }

    @Override
    public double luas() {
        return Math.PI*jarisatu*jaridua;
    }
    
}
