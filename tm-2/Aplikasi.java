import entitas.Mahasiswa;

public class Aplikasi {

    public static void main(String[] args) {
        // System.out.println("Selamat datang di OOP 1");
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNama("tamami");
        // mhs.nama = "tamami";
        // System.out.println(mhs.nama);

        Mahasiswa mhs22 = new Mahasiswa(
            "19001", "ami", "C"
        );
        // mhs22.nama = "ami woy";
        // Mahasiswa.nama = "tester";
        System.out.println(mhs22.getNama());
        // System.out.println(mhs.nama);

        System.out.println(Math.abs(-38));
    }

}