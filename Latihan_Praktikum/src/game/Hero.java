package game;
//No.1
public class Hero {
    String Nama;
    double HP;
    double AttackPower;
    public Hero(String Nama, double HP, double AttackPower) {
        this.Nama = Nama;
        this.HP = HP;
        this.AttackPower = AttackPower;
    }
    public void displayInfo() {
        System.out.println("Nama: " + Nama);
        System.out.println("HP: " + HP);
        System.out.println("Attack Power: " + AttackPower);
    }

    //No.2
    public void berlatih() {
        AttackPower += 10;
        System.out.println(Nama + " sedang berlatih. Attack Power meningkat menjadi " + AttackPower);
    }

    public void terimaDamage(double damage) {
        HP -= damage;
        System.out.println(Nama + " menerima damage sebesar " + damage + ". HP sekarang: " + HP);
    }

}
