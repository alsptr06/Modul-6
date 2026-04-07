package game;
// no.3
public class HeroStraingh extends Hero {
    String tipe;
    public HeroStraingh(String name, int health, int attackPower) {
        super(name, health, attackPower);
        this.tipe = "Straingh";
    }

//No.4
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tipe: " + tipe);
    }
    public void terimaDamage(double damage) {
        super.terimaDamage(damage);
        double damageDiterima = damage * 0.2; 
        System.out.println(Nama + " menerima damage sebesar " + damageDiterima + ". HP sekarang: " + HP);

        HP -= damageDiterima;
        if (HP < 0) {
            HP = 0;
        }

        System.out.println( "sisa HP " + Nama + " sekarang: " + HP);

        if (HP == 0) {
            System.out.println(Nama + " telah mati.");
        }
    }

    

}