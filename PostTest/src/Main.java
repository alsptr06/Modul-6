import Rental.Mobil;
import Rental.Motor;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEM SEWA KENDARAAN ===\n");

        
        System.out.println("--- MOBIL AVANZA (7 penumpang) ---");
        Mobil avanza = new Mobil("Toyota Avanza", 300000, 7);
        avanza.displayInfo();
        System.out.println("Total harga sewa (3 hari): Rp" + avanza.hitungHargaSewa(3));
        System.out.println();

        
        System.out.println("--- MOBIL BEBAS (4 penumpang) ---");
        Mobil bebas = new Mobil("Daihatsu Ayla", 250000, 4);
        bebas.displayInfo();
        System.out.println("Total harga sewa (3 hari): Rp" + bebas.hitungHargaSewa(3));
        System.out.println();

        
        System.out.println("--- MOTOR BEAT (110 CC) ---");
        Motor beat = new Motor("Honda Beat", 70000, 110);
        beat.displayInfo();
        System.out.println("Total harga sewa (3 hari): Rp" + beat.hitungHargaSewa(3));
        System.out.println();

        
        System.out.println("--- MOTOR NINJA (250 CC) ---");
        Motor ninja = new Motor("Kawasaki Ninja", 150000, 250);
        ninja.displayInfo();
        System.out.println("Total harga sewa (3 hari): Rp" + ninja.hitungHargaSewa(3));
        System.out.println();

        
        System.out.println("--- MOTOR CBR (600 CC) ---");
        Motor cbr = new Motor("Honda CBR", 200000, 600);
        cbr.displayInfo();
        System.out.println("Total harga sewa (3 hari): Rp" + cbr.hitungHargaSewa(3));
    }
}