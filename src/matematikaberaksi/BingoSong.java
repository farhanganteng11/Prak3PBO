/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matematikaberaksi;

/**
 *
 * @author Administrator
 */
public class BingoSong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int clapCount = 0; clapCount <= 5; clapCount++) {
            Verse verse = new Verse(clapCount); 
            verse.printVerse(); 
        }
    }
    }
    
