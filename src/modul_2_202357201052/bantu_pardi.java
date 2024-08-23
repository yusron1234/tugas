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
public class bantu_pardi {
    public static double luasSegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }
    
    public static double luasSegiTiga(double alas, double tinggi) {
        return 0.5 * tinggi;
    }
    
    public static double luasLingkaran(double jarijari) {
        return Math.PI * Math.pow(jarijari, 2);
    }
    public static void main(String[] args) {
        
        double panjangSegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("masukan panjang persegi panjang"));
        double lebarSegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("masukan lebar panjang"));
        double luasSegiPanjang = luasSegiPanjang(panjangSegiPanjang, lebarSegiPanjang);
        JOptionPane.showMessageDialog(null, "luas persegi panjang : " + luasSegiPanjang);
        System.err.println("Luas Persegi Panjang : " + luasSegiPanjang);
        
        double alasSegitiga = Double.parseDouble(JOptionPane.showInputDialog("masukan alas segitiga : " ));
        double tinggiSegitiga = Double.parseDouble(JOptionPane.showInputDialog("masukan tinggi segitiga : " ));
    }
    }
    

