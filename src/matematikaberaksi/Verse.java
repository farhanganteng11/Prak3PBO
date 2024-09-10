/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematikaberaksi;

/**
 *
 * @author Administrator
 */
public class Verse {
    private int clapCount;
    public Verse(int clapCount) {
        this.clapCount = clapCount;
    }
    
    public void printVerse() {
        String[] bingo = {"B", "I", "N", "G", "O"};
        
        for (int i = 0; i < clapCount; i++) {
            bingo[i] = "(clap)";
        }

        String bingoLine = String.join("-", bingo);
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");
        System.out.println(bingoLine);
        System.out.println(bingoLine);
        System.out.println(bingoLine);
        System.out.println("And Bingo was his name-o.");
        System.out.println(); 
    }
}
