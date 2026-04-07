package Minimarket;

public class Produk {
    String namaProduk;
    double hargaProduk;

    public Produk(String namaProduk, double hargaProduk) {
        this.namaProduk = namaProduk;
        this.hargaProduk = hargaProduk;
    }

    public void tampilkanDetailProduk() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga Produk: " + hargaProduk);
    }
}


class MakananRingan extends Produk {
    String rasa;

    public MakananRingan(String namaProduk, double hargaProduk, String rasa) {
        super(namaProduk, hargaProduk);
        this.rasa = rasa;
    }

    @Override
    public void tampilkanDetailProduk() {
        super.tampilkanDetailProduk();
        System.out.println("Rasa: " + rasa);
    }
}