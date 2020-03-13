package entitas;

public class Mahasiswa {

    // field
    private String nim;
    private String nama; // protected field
    private String kelas;

    // constructor
    public Mahasiswa(String nim, String nama, 
            String kelas) {
        this.nim = nim;
        // this.nama = nama;
        this.kelas = kelas;
    }

    public Mahasiswa() {}

    // method
    public String info() {
        return nim + ":" + nama + ":" + kelas;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public String getKelas() {
        return kelas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNama(String first, String last) {
        this.nama = first + " " + last;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

}