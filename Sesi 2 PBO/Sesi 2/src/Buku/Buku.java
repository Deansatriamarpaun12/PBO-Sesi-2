package Buku;

public class Buku {
    // Atribut
    
    public String penulis;
    public String judul;
    public double harga;
    public int nomorPenerbit;

    // Konstruktor
    public Buku(String penulis, String judul, double harga, int nomorPenerbit) {
        this.penulis = penulis;
        this.judul = judul;
        this.harga = harga;
        this.nomorPenerbit = nomorPenerbit;
    }

    // Getter untuk mendapatkan harga buku
    public double getHarga() {
        return harga;
    }
}