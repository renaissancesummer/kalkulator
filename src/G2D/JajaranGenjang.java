/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G2D;

/**
 *
 * @author Asus
 */
public class JajaranGenjang implements Kalkulasi2D{
    
    public double sisi1;
    public double sisi2;
    public double tinggi;
    
    public JajaranGenjang(double tinggi, double sisi1, double sisi2){
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.tinggi = tinggi;
    }
    @Override
    public double keliling() {
        return 2*sisi1 + 2*sisi2;
    }

    @Override
    public double luas() {
        return sisi1 * tinggi;
    }
    
}
