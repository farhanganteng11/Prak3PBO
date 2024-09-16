/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematikaberaksi;

/**
 *
 * @author Administrator
 */
public class MatematikaInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matematika2 math = new Matematika2();
       
        int penjumlahan = math.pertambahan(10,5);
        int pengurangan = math.pengurangan(10, 5);
        int perkalian = math.perkalian(10, 5);
        int pembagian = math.pembagian(10, 5);
        int modulus = math.modulus(10, 5);
        
        System.out.println("Penjumlahan: " + penjumlahan);
        System.out.println("Pengurangan: " + pengurangan);
        System.out.println("Perkalian: " + perkalian);
        System.out.println("Pembagian: " + pembagian);
        System.out.println("Modulus: " + modulus);
    }
    
}
