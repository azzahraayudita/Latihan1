package Enkapsulasi;

public class Tampil {
    public static void main(String[] args) {
        Siswa s = new Siswa();
        s.setnama("Hanung");
        System.out.println(s.getNama());
        System.out.println("Umur: " +s.usia);
        System.out.println("Nama :" +s.namaTemanKomitmen);

    }
}
