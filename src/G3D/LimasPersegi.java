/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G3D;
import G2D.Persegi;
/**
 *
 * @author Asus
 */
public class LimasPersegi extends Persegi implements Kalkulasi3D {
    
    double tinggi;
    
    public LimasPersegi(double sisi, double tinggi) {
        super(sisi);
        this.tinggi = tinggi;
    }

  

    @Override
    public double volume() {
        return 0.333*super.luas()*tinggi;

    }
    
}
