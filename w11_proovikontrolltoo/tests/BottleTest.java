import org.junit.Test;

import static org.junit.Assert.*;

public class BottleTest {

    @Test
    public void getWeight() {
        Bottle bottle = new Bottle(BottleType.GLASS);
        assertEquals("Peaks 200 olema",200, bottle.getWeight(),0);
    }

    @Test
    public void getPrice() {
        Drink drink = new Drink(DrinkName.FANTA);
        Bottle bottle = new Bottle(drink, BottleType.GLASS);
        assertEquals("Peaks 1.5 olema", 1.5, bottle.getPrice(),0);
    }
}