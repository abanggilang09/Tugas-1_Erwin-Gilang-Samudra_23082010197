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
public class SegitigaSiku {
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);       
        System.out.println("Program Segitiga Atas :");
        System.out.print("Masukkan N : ");
        int j, N = s.nextInt();
        int i = N;
        while(i >= 1){
            j=1;
            do{
                System.out.print(j);
                j++;
            }while (j<=N - i + 1);
            System.out.println("");
            i--;
        }
    }  
}
