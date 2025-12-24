/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainlidia;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Mainlidia extends InputPenumpang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM PENUMPANG ===");
        System.out.print("Masukkan Nama Penumpang : ");
        String nama = input.nextLine();

        System.out.print("Masukkan No Tiket       : ");
        String noTiket = input.nextLine();

        System.out.print("Jenis Penumpang (1=Reguler, 2=VIP): ");
        int pilihan = input.nextInt();

        Penumpang p;

        if (pilihan == 1) {
            p = new PenumpangReguler(nama, noTiket);
            p.tampilkanData("Reguler");
        } else {
            p = new PenumpangVIP(nama, noTiket);
            p.tampilkanData("VIP");
        }
    }
}