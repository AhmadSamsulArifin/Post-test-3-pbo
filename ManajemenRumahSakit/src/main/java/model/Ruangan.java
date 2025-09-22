/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Ahmad samuel
 */
public class Ruangan {
    private String nomor;
    private String tipe;
    private String status;

    // Constructor
    public Ruangan(String nomor, String tipe, String status) {
        this.nomor = nomor;
        this.tipe = tipe;
        this.status = status;
    }

    // Getter & Setter
    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    @Override
    public String toString() {
        return "Ruangan{" +
                "Nomor='" + nomor + '\'' +
                ", Tipe='" + tipe + '\'' +
                ", Status='" + status + '\'' +
                '}';
    }
}
