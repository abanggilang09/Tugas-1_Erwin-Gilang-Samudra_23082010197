/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasperulangan;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class TugasPerulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int ganjil;
        System.out.print("Masukan Angka : ");
        ganjil=s.nextInt();
        for (int i = 1 ; i<= ganjil; i+=2) {
            System.out.println(""+i);
            
                     
           
        } 
        // TODO code application logic here
    }
    
}
