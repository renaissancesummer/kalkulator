/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G3D;
import G2D.Segi3;

/**
 *
 * @author Lenovo
 */
public class Limas3 extends Segi3 implements Kalkulasi3D {
    
    
    public double tinggiLimas;
    


    public Limas3(double sisi, double tinggiLimas) {
        super(sisi);
        this.tinggiLimas = tinggiLimas;
    }


    
    public double volume(){
        return 0.3*super.luas()*tinggiLimas;
    }
}
