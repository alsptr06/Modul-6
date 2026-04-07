package Rental;

public class Kendaraan {
    protected String nama;
    protected double hargaSewaPerHari;

    public Kendaraan(String nama, double hargaSewaPerHari) {
        this.nama = nama;
        this.hargaSewaPerHari = hargaSewaPerHari;
    }

    public double hitungHargaSewa(int hari) {
        return hargaSewaPerHari * hari;
    }

    public void displayInfo() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Harga Sewa Per Hari: Rp" + hargaSewaPerHari);
    }
}
