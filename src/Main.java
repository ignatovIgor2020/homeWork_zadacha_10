public class Main {
    public static void main(String[] args) {
        Mage mage = new Mage("fire",12, 23, "fire");
        Mage mage2 = new Mage("ice",12, 23, "ice");
        Mage mage3 = new Mage("earth12",12, 23, "earth");
        Mage mage4 = new Mage("earth13",13, 23, "earth");
        Mage mage5 = new Mage("earth13_20",13, 20, "earth");

        System.out.println(mage.fight(mage2));
        System.out.println(mage.fight(mage3));
        System.out.println(mage2.fight(mage3));
        System.out.println(mage3.fight(mage4));
        System.out.println(mage4.fight(mage5));


    }


}
