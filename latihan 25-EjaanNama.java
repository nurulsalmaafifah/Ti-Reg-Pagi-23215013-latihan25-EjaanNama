/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class EjaanNama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama dari user
        System.out.print("Masukkan nama depan anda untuk dieja: ");
        String nama = scanner.nextLine();

        // Menampilkan hasil ejaan
        System.out.println("Ejaan untuk \"" + nama + "\" adalah :");
        for (int i = 0; i < nama.length(); i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
        }

        scanner.close();
    }
}
