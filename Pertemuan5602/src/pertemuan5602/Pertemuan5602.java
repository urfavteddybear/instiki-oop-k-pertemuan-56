/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5602;

import java.util.Scanner;

/**
 *
 * @author Wahyu Putra
 * 26/04/2025
 */
public class Pertemuan5602 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LuasSegitiga Segitiga01 = new LuasSegitiga();
        
        int alas = 0;
        int tinggi = 0;
        
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Hitung luas bangun segitiga");
        System.out.print("Input nilai alas: ");
        alas = Integer.parseInt(inp.nextLine());

        System.out.print("Input nilai tinggi: ");
        tinggi = Integer.parseInt(inp.nextLine());

        Segitiga01.alas = alas;
        Segitiga01.tinggi = tinggi;
        System.out.println("Luas Segitiga: " +Segitiga01.HitungLuas());
    }
    
}
