/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematikaberaksi;

/**
 *
 * @author Administrator
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KonversiSuhu2 konversi = new KonversiSuhu2();
        
        double celcius = 100.0;
        double fahrenheit = 212.0;
        double hasilFahrenheit = konversi.celciusToFahrenheit(celcius);
        double hasilReamurDariCelcius = konversi.celciusToReamur(celcius);
        double hasilReamurDariFahrenheit = konversi.fahrenheitToReamur(fahrenheit);
        
        System.out.println(celcius + " derajat Celcius ke Fahrenheit: " + hasilFahrenheit + " F");
        System.out.println(celcius + " derajat Celcius ke Reamur: " + hasilReamurDariCelcius + " R");
        System.out.println(fahrenheit + " derajat Fahrenheit ke Reamur: " + hasilReamurDariFahrenheit + " R");
    }
    
}
