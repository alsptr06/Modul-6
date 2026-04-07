package Rental;

public class Mobil extends Kendaraan {
    private int kapasitasPenumpang;

    public Mobil(String nama, double hargaSewaPerHari, int kapasitasPenumpang) {
        super(nama, hargaSewaPerHari);
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    @Override
    public double hitungHargaSewa(int hari) {
    
        double totalHarga = super.hitungHargaSewa(hari);

        totalHarga += 50000 * hari;
        
        if (kapasitasPenumpang > 5) {
            totalHarga += 50000;
        }

        return totalHarga;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas Penumpang: " + kapasitasPenumpang + " orang");
    }
}