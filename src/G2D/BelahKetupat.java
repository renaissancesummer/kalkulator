/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G2D;

/**
 *
 * @author Asus
 */
public class BelahKetupat implements Kalkulasi2D{
    
    public double d1;
    public double d2;
    
    
    public BelahKetupat (double d1, double d2){
    this.d1 = d1;
    this.d2 = d2;
    }

    @Override
    public double keliling() {
        return 4*Math.sqrt((0.25*d1*d1)+(0.25*d2*d2)); 
    }

    @Override
    public double luas() {
        return 0.5*d1*d2;
    }
    
}
