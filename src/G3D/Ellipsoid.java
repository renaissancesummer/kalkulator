/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G3D;
import G2D.Ellips;
/**
 *
 * @author ACER
 */
public class Ellipsoid extends Ellips implements Kalkulasi3D{
    
    double jaritiga;
    public Ellipsoid(double jarisatu, double jaridua, double jaritiga){
        super(jarisatu, jaridua);
        this.jaritiga = jaritiga;
    }
    
    @Override
    public double volume() {
        return 1.333*Math.PI*jarisatu*jaridua*jaritiga;
    }
    
}