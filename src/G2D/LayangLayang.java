package G2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class LayangLayang implements Kalkulasi2D{
    
    public double dsatu;
    public double dpendek;
    public double dpanjang;
    
    
    public LayangLayang (double dsatu, double dpendek, double dpanjang){
    this.dsatu = dsatu;
    this.dpendek = dpendek;
    this.dpanjang = dpanjang;
    }

    @Override
    public double keliling() {
        return 2*Math.sqrt((0.25*dsatu*dsatu)+(0.25*dpendek*dpendek)) + 2*Math.sqrt((0.25*dsatu*dsatu)+(0.25*dpanjang*dpanjang)); 
    }

    @Override
    public double luas() {
        return 0.5*dsatu*(dpendek+dpanjang);
    }
    
}
