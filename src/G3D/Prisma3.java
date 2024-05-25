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
public class Prisma3 extends Segi3 implements Kalkulasi3D {
    public double tinggi;
    
    public Prisma3(double sisi, double tinggi){
        super(sisi);
        this.tinggi = tinggi;
    }
    
    public double volume(){
        return super.luas()*tinggi;
    }
}
