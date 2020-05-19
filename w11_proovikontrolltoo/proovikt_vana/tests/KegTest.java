import org.junit.Test;

import static org.junit.Assert.*;

public class KegTest {

    @Test
    public void getAmount(){
        Keg keg1 = new Keg(5000);
        assertEquals(5000, 5000);
    }

    @Test
    public void fillBottle() {
        Bottle bottle1 = new Bottle(BottleType.GLASS);
        Keg keg1 = new Keg(100000);
    }

    @Test
    public void fillAllBottles() {
    }
}