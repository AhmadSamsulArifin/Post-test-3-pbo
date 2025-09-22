package model;

public class Kelas extends Ruangan {
    private String mataKuliah;

    public Kelas(String nomor, String tipe, String status, String mataKuliah) {
        super(nomor, tipe, status);    
        this.mataKuliah = mataKuliah;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

   
    @Override
    public String toString() {
        return super.toString() + ", Mata Kuliah='" + mataKuliah + "'";
    }
}
