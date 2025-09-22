/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Ahmad samuel
 */
import service.RuanganService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RuanganService service = new RuanganService();
        int pilihan;

        do {
            System.out.println("\n=== MENU RUANGAN ===");
            System.out.println("1. Tambah Ruangan");
            System.out.println("2. Tampilkan Semua Ruangan");
            System.out.println("3. Update Ruangan");
            System.out.println("4. Hapus Ruangan");
            System.out.println("5. Cari Ruangan berdasarkan Nomor");
            System.out.println("6. Cari Ruangan berdasarkan Tipe");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> service.tambahRuangan();
                case 2 -> service.tampilkanRuangan();
                case 3 -> service.updateRuangan();
                case 4 -> service.hapusRuangan();
                case 5 -> service.cariRuangan();
                case 6 -> service.cariRuanganByTipe();
                case 7 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 7);
       
System.out.println("main");
model.Kelas kelas = new model.Kelas("K101", "Kelas 1", "Kosong", "Pemrograman Java");
model.Laboratorium lab = new model.Laboratorium("L201", "VIP", "Terisi", "Komputer");

System.out.println(kelas);   
System.out.println(lab);

    }
}
