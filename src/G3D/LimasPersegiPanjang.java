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
public class LimasPersegiPanjang extends PersegiPanjang implements Kalkulasi3D{
    
    double tinggi;
    
    public LimasPersegiPanjang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return 0.333*super.luas()*tinggi;
        }
    
}