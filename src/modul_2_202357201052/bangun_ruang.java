/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_2_202357201052;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class bangun_ruang {
    
    public double volum_tabung(double diameter, double tinggi) {
        double luas = luas_lingkaran(diameter);
        double volume = luas * tinggi;
        return volume;

    }
     public double volum_kerucut(double diameter, double tinggi, double luas) {
        double jari2 = luas_lingkaran(diameter);
        double volume = (luas * tinggi) / 3.0;
        return volume;
    }
      public double volum_bola(double diameter) {
        double jari2 = diameter / 2;
        double volume = (4.0 / 3.0 ) *Math.PI * Math.pow(jari2, 3) ;
        return volume;
      }
      
    

    private double luas_lingkaran(double diameter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public static void main(String[] args) {
    
    }
    
}
