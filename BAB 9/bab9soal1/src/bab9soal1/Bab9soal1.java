/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab9soal1;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Bab9soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Tahun Akhir ? : ");
        int tahunAkhir = scanner.nextInt();
        
        System.out.print("Tahun Awal ? : ");
        int tahunAwal = scanner.nextInt();
        
        System.out.print("Hasilnya : ");
        for (int i = tahunAkhir; 1 >= tahunAwal; i--) {
            System.out.println(i);
        }
        
        }
    }

