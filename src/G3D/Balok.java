/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G3D;
import G2D.PersegiPanjang;
/**
 *
 * @author Asus
 */
public class Balok extends PersegiPanjang implements Kalkulasi3D {

    double tinggi;
    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return super.luas()*tinggi;
    }
    
}
