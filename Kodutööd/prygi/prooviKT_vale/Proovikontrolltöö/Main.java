
public class Main {
    public static void main(String[] args) {
        Drink drink1 = new Drink(DrinkName.FANTA);
        Bottle bottle1 = new Bottle(drink1, BottleType.CAN);
        Keg keg1 = new Keg();

        keg1.fillBottle(bottle1);

        System.out.println(bottle1.getPrice());
        
    }
}