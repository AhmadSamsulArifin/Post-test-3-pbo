package model;

public class Laboratorium extends Ruangan {
    private String jenisLab;

    public Laboratorium(String nomor, String tipe, String status, String jenisLab) {
        super(nomor, tipe, status);    
        this.jenisLab = jenisLab;
    }

    public String getJenisLab() {
        return jenisLab;
    }

    public void setJenisLab(String jenisLab) {
        this.jenisLab = jenisLab;
    }

  
    @Override
    public String toString() {
        return super.toString() + ", Jenis Lab='" + jenisLab + "'";
    }
}
