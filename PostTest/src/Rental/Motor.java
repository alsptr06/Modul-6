package Rental;

public class Motor extends Kendaraan {
    private int kapasitasMesin; // dalam CC

    public Motor(String nama, double hargaSewaPerHari, int kapasitasMesin) {
        super(nama, hargaSewaPerHari);
        this.kapasitasMesin = kapasitasMesin;
    }

    @Override
    public double hitungHargaSewa(int hari) {
    
        double totalHarga = super.hitungHargaSewa(hari);

        
        if (kapasitasMesin >= 250) {
            totalHarga += 25000 * hari;
        }

        return totalHarga;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas Mesin: " + kapasitasMesin + " CC");
    }
}