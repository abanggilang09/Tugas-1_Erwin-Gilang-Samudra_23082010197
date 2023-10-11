/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasperulangan;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Dowhile {
    public static void main(String [] args){
        Scanner s = new Scanner (System.in);
        int ganjil;
        System.out.println("Masukkan Angka = ");
        ganjil = s.nextInt();
        int i = 1;      
        do{
            System.out.println(""+i);
            i +=2;
        } while (i<= ganjil);
    }                  
}
