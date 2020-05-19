public class Main {
    public static void main(String[] args) {
        Drink drink1 = new Drink(DrinkName.FANTA);
        Bottle bottle1 = new Bottle(drink1, BottleType.CAN);
        Bottle bottle2 = new Bottle(drink1, BottleType.PLASTIC);
        Bottle bottle3 = new Bottle(BottleType.PLASTIC);

        System.out.println(bottle1.getPrice());  
        /*
        Keg keg1 = new Keg(10000);
        keg1.fillBottle(bottle2);

        keg1.fillAllBottles(bottle3);
        System.out.println();
        System.out.println("Pudel maksab: " + bottle1.getPrice());
        */
    }
}
