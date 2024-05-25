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
public class Segi3 implements Kalkulasi2D {
    public double sisi;
    
    
    public Segi3(double sisi) {
    this.sisi = sisi;
    }

   
    
    
    public double keliling(){
    return 3*sisi;
    
}

    
    public double luas() {
    return 0.5*sisi*Math.sqrt(sisi*sisi - 0.5*sisi*0.5*sisi);    
    }
    
}

        
