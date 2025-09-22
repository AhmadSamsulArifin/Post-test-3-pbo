/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author Ahmad samuel
 */
import model.Ruangan;
import java.util.ArrayList;
import java.util.Scanner;

public class RuanganService {
    private ArrayList<Ruangan> daftarRuangan = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

   
    public void tambahRuangan() {
        System.out.print("Masukkan Nomor Ruangan: ");
        String nomor = scanner.nextLine();

      
        String[] tipeValid = {"VIP", "Kelas 1", "Kelas 2", "ICU", "Isolasi"};
        String tipe;
        while (true) {
            System.out.print("Masukkan Tipe Ruangan (VIP/Kelas 1/Kelas 2/ICU/Isolasi): ");
            tipe = scanner.nextLine();
            boolean valid = false;
            for (String t : tipeValid) {
                if (t.equalsIgnoreCase(tipe)) {
                    valid = true;
                    break;
                }
            }
            if (valid) {
                break;
            } else {
                System.out.println("Tipe ruangan tidak valid! Pilih dari: VIP, Kelas 1, Kelas 2, ICU, Isolasi.");
            }
        }

     
        String status;
        while (true) {
            System.out.print("Masukkan Status Ruangan (Kosong/Terisi): ");
            status = scanner.nextLine();
            if (status.equalsIgnoreCase("Kosong") || status.equalsIgnoreCase("Terisi")) {
                break;
            } else {
                System.out.println("Status hanya boleh 'Kosong' atau 'Terisi'!");
            }
        }

        Ruangan ruangan = new Ruangan(nomor, tipe, status);
        daftarRuangan.add(ruangan);
        System.out.println("Ruangan berhasil ditambahkan!");
    }

   
    public void tampilkanRuangan() {
        if (daftarRuangan.isEmpty()) {
            System.out.println("Belum ada data ruangan.");
        } else {
            for (Ruangan r : daftarRuangan) {
                System.out.println(r);
            }
        }
    }

   
    public void updateRuangan() {
        System.out.print("Masukkan Nomor Ruangan yang ingin diupdate: ");
        String nomor = scanner.nextLine();

        for (Ruangan r : daftarRuangan) {
            if (r.getNomor().equalsIgnoreCase(nomor)) {
                
                String[] tipeValid = {"VIP", "Kelas 1", "Kelas 2", "ICU", "Isolasi"};
                String tipe;
                while (true) {
                    System.out.print("Masukkan Tipe Ruangan baru (VIP/Kelas 1/Kelas 2/ICU/Isolasi): ");
                    tipe = scanner.nextLine();
                    boolean valid = false;
                    for (String t : tipeValid) {
                        if (t.equalsIgnoreCase(tipe)) {
                            valid = true;
                            break;
                        }
                    }
                    if (valid) {
                        break;
                    } else {
                        System.out.println("Tipe ruangan tidak valid! Pilih dari: VIP, Kelas 1, Kelas 2, ICU, Isolasi.");
                    }
                }

                // Update status dengan validasi
                String status;
                while (true) {
                    System.out.print("Masukkan Status Ruangan baru (Kosong/Terisi): ");
                    status = scanner.nextLine();
                    if (status.equalsIgnoreCase("Kosong") || status.equalsIgnoreCase("Terisi")) {
                        break;
                    } else {
                        System.out.println("Status hanya boleh 'Kosong' atau 'Terisi'!");
                    }
                }

                r.setTipe(tipe);
                r.setStatus(status);
                System.out.println("Data ruangan berhasil diupdate!");
                return;
            }
        }
        System.out.println("Ruangan tidak ditemukan!");
    }

 
    public void hapusRuangan() {
        System.out.print("Masukkan Nomor Ruangan yang ingin dihapus: ");
        String nomor = scanner.nextLine();

        for (Ruangan r : daftarRuangan) {
            if (r.getNomor().equalsIgnoreCase(nomor)) {
                daftarRuangan.remove(r);
                System.out.println("Ruangan berhasil dihapus!");
                return;
            }
        }
        System.out.println("Ruangan tidak ditemukan!");
    }

    
    public void cariRuangan() {
        System.out.print("Masukkan Nomor Ruangan yang dicari: ");
        String nomor = scanner.nextLine();

        for (Ruangan r : daftarRuangan) {
            if (r.getNomor().equalsIgnoreCase(nomor)) {
                System.out.println("Ditemukan: " + r);
                return;
            }
        }
        System.out.println("Ruangan tidak ditemukan!");
    }

    public void cariRuanganByTipe() {
    System.out.print("Masukkan Tipe Ruangan yang dicari (VIP/Kelas 1/Kelas 2/ICU/Isolasi): ");
    String tipeCari = scanner.nextLine();

  
    for (Ruangan r : daftarRuangan) {
        if (r.getTipe().equalsIgnoreCase(tipeCari)) {
            System.out.println("Ditemukan: " + r);
            return;
        }
    }
        System.out.println("Tidak ada ruangan dengan tipe!" );
    }
}

    
