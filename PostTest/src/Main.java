import Rental.Kendaraan;
import Rental.Mobil;
import Rental.Motor;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Declare array list
        ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();

        // Menambahkan 4 objek 
        daftarKendaraan.add(new Mobil("Toyota Avanza", 2020, 500000));
        daftarKendaraan.add(new Mobil("Honda Brio", 2019, 450000));
        daftarKendaraan.add(new Motor("Yamaha NMAX", 2021, 150000));
        daftarKendaraan.add(new Motor("Honda Vario", 2020, 120000));

        // Looping untuk menampilkan info dan total sewa 5 hari
        System.out.println("=== SISTEM PENYEWAAN KENDARAAN ===\n");

        for (Kendaraan k : daftarKendaraan) {
            k.displayInfo();
            System.out.println("Total Biaya Sewa (5 hari): Rp" + k.hitungHargaSewa(5));
            System.out.println("----------------------------------------\n");
        }
    }
}