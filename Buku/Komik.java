package Buku;

public class Komik extends Buku {
    
    private int volume;


    public void getVolume(int volume){

        this.volume = volume;

    }

    public void naikkanHarga(){

        System.out.println("Ini method untuk menaikkan harga");

    }

}