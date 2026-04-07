import game.Hero;
public class App {
    //No.5
    public static void main(String[] args) throws Exception {
        Hero hero1 = new Hero("Balmond", 100000, 100);
        Hero hero2 = new Hero("Alucard", 1000000, 100);
        hero1.displayInfo();
        System.out.println();
        hero1.berlatih();
        hero1.displayInfo();
        System.out.println();
        hero2.displayInfo();
        hero2.berlatih();
        hero2.displayInfo();
        System.out.println();

        hero1.terimaDamage(50000000);
        hero1.displayInfo();
        System.out.println();
        hero2.terimaDamage(50000000);
        hero2.displayInfo();
        System.out.println();
    }
}