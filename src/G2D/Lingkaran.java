/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G2D;

/**
 *
 * @author Asus
 */
public class Lingkaran implements Kalkulasi2D{
    public double jarijari;
    
    public Lingkaran(double jarijari) {
    this.jarijari = jarijari;
    }

    @Override
    public double keliling() {
        return 2*Math.PI*jarijari;
    }

    @Override
    public double luas() {
        return Math.PI*jarijari*jarijari;
    }
}
