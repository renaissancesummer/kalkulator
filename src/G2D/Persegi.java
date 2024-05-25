/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G2D;

/**
 *
 * @author Lenovo
 */
public class Persegi implements Kalkulasi2D{
    public double sisi;
    
    public Persegi(double sisi){
        this.sisi = sisi;
    }

    
    
    public double keliling(){
        return 4*sisi;
    }
    public double luas(){
        return sisi*sisi;
    }


    
}
