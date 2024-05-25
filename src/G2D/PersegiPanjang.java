/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G2D;

/**
 *
 * @author Asus
 */
public class PersegiPanjang implements Kalkulasi2D{

    public double panjang;
    public double lebar;
    
    
    public PersegiPanjang (double panjang, double lebar){
    this.panjang = panjang;
    this.lebar = lebar;
    }
    @Override
    public double keliling() {
        return 2*panjang+2*lebar;
    }

    @Override
    public double luas() {
        return panjang*lebar;
    }
    
}
