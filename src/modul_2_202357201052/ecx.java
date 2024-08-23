/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul_2_202357201052;

/**
 *
 * @author Admin
 */
public class ecx {
    public static void main(String[] args) {
        int bil =10;
        String b[] = {"a", "b", "b"};
        try {
            System.err.println(bil / 0);
            System.err.println(b[3]);
        }catch (ArithmeticException ai) {
            System.err.println("error Arrimetik");
            System.err.println(ai.getMessage());
        }catch (ArrayIndexOutOfBoundsException n) {
            System.err.println("error karena kelebihan kapaitas array");
            System.err.println(n.getMessage());
        }catch (Exception e) {
            System.err.println("ada error");
            System.err.println(e.getMessage());
        }
    }
    
}
