package Buku;
public class Buku {
    private int id;
    private String judul;
    private String penulis;
    private int jumlahHalaman;
    private boolean harga;

    public void pinjam() {
        System.out.println("Ini method untuk meminjam buku");
    }

    public void kembali() {
        System.out.println("Ini method untuk mengembalikan buku");
    }

    public void sumbang() {
        System.out.println("Ini method untuk menyumbang buku");
    }

    public void beli() {
        System.out.println("Ini method untuk membeli buku");
    }

    public void naikkanHarga() {
        System.out.println("Ini method untuk menaikkan harga");
    }

    public void naikkanHarga(double kenaikan) {
        System.out.println("Ini method untuk kenaikan harga");
    }

    public int getId() {
        return this.id;
    }

    public String getJudul() {
        return this.judul;
    }

    public String getPenulis() {
        return this.penulis;
    }

    public int getJumlahHalaman() {
        return this.jumlahHalaman;
    }

    public boolean getHarga() {
        return this.harga;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public void setJumlahHalaman(int jumlahHalaman) {
        this.jumlahHalaman = jumlahHalaman;
    }

    public void setHarga(boolean harga) {
        this.harga = harga;
    }

    public Buku() {
        System.out.println("Object telah diciptakan, constructor berjalan");
    }
}
