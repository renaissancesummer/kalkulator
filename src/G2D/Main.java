/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G2D;
import java.util.*;
import G3D.*;
/**
 *
 * @author Lenovo
 */
public class Main {
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kembali;
        do{
        System.out.println("==KALKULATOR BANGUN==");
        System.out.println("1. Segitiga");
        System.out.println("2. Persegi");
        System.out.println("3. Persegi Panjang");
        System.out.println("4. Jajaran Genjang");
        System.out.println("5. Trapesium");
        System.out.println("6. Belah Ketupat");
        System.out.println("7. layang-layang");
        System.out.println("8. Ellips");
        System.out.println("9. Lingkaran");
        System.out.println("(1-9) > ");
        int input = scan.nextInt();
        switch (input){
            case 1:                
                System.out.println("Input sisi: "); 
                double sisi3 = scan.nextDouble();
                Segi3 segi3 = new Segi3(sisi3);
                double keliling3 = segi3.keliling();
                double luas3 = segi3.luas();
                System.out.println("Keliling: " + keliling3);
                System.out.println("Luas: " + luas3);
                System.out.println("==LIMAS==");
                System.out.println("Masukkan tinggi limas: ");
                double tinggiLimas = scan.nextDouble();
                Limas3 limas3 = new Limas3(sisi3, tinggiLimas);
                double volumeLimas = limas3.volume();
                System.out.println("Volume Limas: " + volumeLimas);
                System.out.println("==PRISMA==");
                System.out.println("Masukkan tinggi Prisma: ");
                double tinggiPrisma = scan.nextDouble();
                Prisma3 prisma3 = new Prisma3(sisi3, tinggiPrisma);
                double volumePrisma3 = prisma3.volume();
                System.out.println("Volume Limas: " + volumePrisma3);
                
                
            break;
            case 2:
            System.out.println("input sisi persegi: ");
            double sisi = scan.nextDouble();
            Persegi persegi = new Persegi(sisi);
            double keliling = persegi.keliling();
            double luas = persegi.luas();
                System.out.println("Luas : " + luas);
                System.out.println("Keliling: " + keliling);
                System.out.println("==KUBUS==");
            Kubus kubus = new Kubus(sisi);
            double volume = kubus.volume();
                System.out.println("Kubus : " + volume);
                System.out.println("==LIMAS PERSEGI==");
            System.out.println("Input Tinggi : ");
                double tinggiLimasPersegi = scan.nextDouble();
                LimasPersegi limaspersegi = new LimasPersegi(sisi, tinggiLimasPersegi);
                double volumelimaspersegi = limaspersegi.volume();
                System.out.println("Volume Limas Persegi : " + volumelimaspersegi);
                break;
     
            case 3:
                System.out.println("Input panjang Persegi Panjang: ");
                double panjang = scan.nextDouble();
                System.out.println("Input Lebar Persergi Panjang : ");
                double lebar = scan.nextDouble();
                PersegiPanjang persegipanjang = new PersegiPanjang(panjang, lebar);
                double keliling1 = persegipanjang.keliling();
                double luas1 = persegipanjang.luas();
                System.out.println("Keliling = " + keliling1);
                System.out.println("Luas = " + luas1);
                System.out.println("==BALOK==");
                System.out.println("Input Tinggi Balok : ");
                double tinggipersegipanjang = scan.nextDouble();
                Balok balok = new Balok(panjang, lebar, tinggipersegipanjang);
                double volumeBalok = balok.volume();
                System.out.println("Volume balok : " + volumeBalok);
                System.out.println("==LIMAS P.PANJANG==");
                LimasPersegiPanjang limaspersegipanjang = new LimasPersegiPanjang(panjang, lebar, tinggipersegipanjang);
                double volumelimaspersegipanjang = limaspersegipanjang.volume();
                System.out.println("Volume Limas Persegi Panjang : " + volumelimaspersegipanjang);
                break;
            case 4 :
                System.out.println("Input Sisi yang pertama : ");
                double sisi1 = scan.nextDouble();
                System.out.println("Input sisi yang kedua : ");
                double sisi2 = scan.nextDouble();
                System.out.println("Input Tinggi : ");
                double tinggi2 = scan.nextDouble();
                JajaranGenjang jajarangenjang = new JajaranGenjang(sisi1, sisi2, tinggi2);
                double keliling2 = jajarangenjang.keliling();
                double luas2 = jajarangenjang.luas();
                System.out.println("Keliling = " + keliling2);
                System.out.println("Luas = " + luas2);
                break;
             case 5 :
                System.out.println("Tinggi : ");
                double tinggitrape = scan.nextDouble();
                System.out.println("Sisi a (alas panjang) : ");
                double sisia = scan.nextDouble();
                System.out.println("Sisi b (alas pendek) : ");
                double sisib = scan.nextDouble();
                Trapesium trapesium = new Trapesium(tinggitrape, sisia, sisib);
                double kelilingtrape = trapesium.keliling();
                double luastrape = trapesium.luas();
                System.out.println("Keliling = " + kelilingtrape);
                System.out.println("Luas = " + luastrape);
                break;
                
            case 6 :
                System.out.println("Input diagonal pertama : ");
                double d1 = scan.nextDouble();
                System.out.println("Input diagonal kedua : ");
                double d2 = scan.nextDouble();
                BelahKetupat belahketupat = new BelahKetupat(d1, d2);
                double kelilingbelah = belahketupat.keliling();
                double luasbelah = belahketupat.luas();
                System.out.println("Keliling = " + kelilingbelah);
                System.out.println("Luas = " + luasbelah);
                break;
                
            case 7 :
                System.out.println("Terdapat 3 input");
                System.out.println("Diagonal 1 (diagonal pendek yang sama panjang ketika dipecah berdasarkan titik temu kedua diagonal)");
                System.out.println("Diagonal 2 pendek (diagonal panjang yang lebih pendek ketika dipecah berdasarkan titik temu kedua diagonal)");
                System.out.println("Diagonal 2 panjang (diagonal panjang yang lebih panjang ketika dipecah berdasarkan titik temu kedua diagonal)");
                System.out.println("Diagonal 1 : ");
                double dsatu = scan.nextDouble();
                System.out.println("Diagonal 2 pendek : ");
                double dpendek = scan.nextDouble();
                System.out.println("Diagonal 2 panjang : ");
                double dpanjang = scan.nextDouble();
                LayangLayang layanglayang = new LayangLayang(dsatu, dpendek, dpanjang);
                double kelilinglayang = layanglayang.keliling();
                double luaslayang = layanglayang.luas();
                System.out.println("Keliling = " + kelilinglayang);
                System.out.println("Luas = " + luaslayang);
                break;
                
            case 8 :
                System.out.println("Jari-jari 1 : ");
                double jarisatu = scan.nextDouble();
                System.out.println("Jari-jari 2 : ");
                double jaridua = scan.nextDouble();
                Ellips ellips = new Ellips (jarisatu, jaridua);
                double kelilingelips = ellips.keliling();
                double luaselips = ellips.luas();
                System.out.println("Keliling = " + kelilingelips);
                System.out.println("Luas = " + luaselips);
                System.out.println("==ELLIPSOID==");
                System.out.println("Input jari jari ketiga : ");
                double jaritiga = scan.nextDouble();
                Ellipsoid ellipsoid = new Ellipsoid(jarisatu, jaridua, jaritiga);
                double volumeEllipsoid = ellipsoid.volume();
                System.out.println("Volume ellips : " + volumeEllipsoid);
                break;
            case 9 :
               System.out.println("Input jari-jari");
               double jarijari = scan.nextDouble();
               Lingkaran lingkaran = new Lingkaran(jarijari);
               double kelilinglingkaran = lingkaran.keliling();
               double luaslingkaran = lingkaran.luas();
               Bola bola = new Bola(jarijari);
               double volumebola = bola.volume();
               System.out.println("Keliling = " + kelilinglingkaran);
               System.out.println("Luas = " + luaslingkaran);
               System.out.println("1. Bola");
               System.out.println("2. Tabung");
                System.out.println("3. Kerucut");
                System.out.println("4. Juring");
               System.out.println("Pilih : ");
               
        int input2 = scan.nextInt();
               switch(input2) {
                   case 1 :
                       System.out.println("Volume bola dengan jari-jari " + jarijari + " adalah : " + volumebola);
                       break;
                   
                   case 2 :
                       System.out.println("Input tinggi tabung : ");
                       double tinggitabung = scan.nextDouble();
                       Tabung tabung = new Tabung(jarijari, tinggitabung);
                       double volumeTabung = tabung.volume();
                       System.out.println("Volume tabung : " + volumeTabung);
                       break;
                      
                   case 3 : 
                       System.out.println("Input tinggi kerucut : ");
                       double tinggikerucut = scan.nextDouble();
                       Kerucut kerucut = new Kerucut(jarijari, tinggikerucut);
                       double volumeKerucut = kerucut.volume();
                       System.out.println("Volume Kerucut : " + volumeKerucut);
                       System.out.println("==KERUCUT TERPANCUNG==");
                       System.out.println("Masukkan tinggi: ");
                       double tinggiTerpancung = scan.nextDouble();
                       System.out.println("Masukkan jari-jari atas(harus lebih kecil dari jari jari lingkaran/alas): ");
                       double radiusAtas = scan.nextDouble();
                       if (radiusAtas<jarijari){
                           KerucutTerpancung kerucutP = new KerucutTerpancung(jarijari, radiusAtas, tinggiTerpancung);
                           double volumeKerucutP = kerucutP.volume();
                           System.out.println("Volume Kerucut Terpancung: "+ volumeKerucutP);
                           
                       }
                       else{
                           System.out.println("Harus lebih kecil dari pada jari-jari lingkaran/alas");
                       }
                       break;
                   case 4 :
                       System.out.println("Input besar sudut juring (dari titik pusat lingkaran) 0-360 : ");
                       double sudut = scan.nextDouble();
                       if (sudut>=0 && sudut<=360){
                       Juring juring = new Juring(jarijari, sudut);
                       double kelilingJuring = juring.keliling();
                       System.out.println("Keliling juring : " + kelilingJuring);
                       double luasJuring = juring.luas();
                       System.out.println("Luas juring : " + luasJuring);}
                       else
                           System.out.println("Harus dari 0-360");
                       break;    
               }
             break;
            default :
                System.out.println("Pilihan Tidak Valid.");
}
            System.out.println("Kembali ke Menu? (1 untuk ya, 0 untuk tidak)");
            kembali = scan.nextInt();
        } while (kembali == 1);
    }
}