
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.logging.FileHandler;
import java.util.logging.Logger;


/**
 * 1) Luua 2 olukorda koodis, mis viskaks exceptioni ning try-catch blokiga kinni püüda ja loggida tulemus faili
2) Luua 3 List tüüpi muutujat, milles ühe sees on stringid, teise sees integer arvud ja forEachiga välja printida
3) Kasutada filter/map/skip/min/max/count/collect funktsioone ja näidata midagi huvitavat nende andmetega
4) IntStream.of ja IntStream.range -iga näidata toimivust mingisugusest kogumikust välja filtreerida
     paaris ja paaritud arvud ning kasutada allMatch/anyMatch funktsioone ka, et leida esinevus
 */


public class Tunnitöö {
    public static void main(String[] args) {
        Logger log1 =  Logger.getLogger(Tunnitöö.class.getName());
        FileHandler fh;
        File file1 = new File("C://fail.txt");  //try/fail.txt

       

        try {
            fh = new FileHandler("mylogTT.xml");
            log1.addHandler(fh);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Logger ei tööta");
        }

        System.out.println();

        try {
            FileReader fr = new FileReader(file1);
        } catch (FileNotFoundException e) {
            log1.warning(e.getMessage());
            log1.info("Faili pole olemas");

        }

        System.out.println();

        try {
            buyProduct(1000);
        } catch (Exception e) {
            System.out.println(e);
            log1.warning(e.getMessage());
            log1.info("Lappab?");
        }
        //fh.close();
    }

    

    public static void buyProduct(int amount){
        int totalAmount = 100;
        final int price = 2;
            float totalF = amount * price;
            totalAmount = totalAmount - amount;
            System.out.println("Maksma läks, " + totalF + " , järgi on " + totalAmount + " toodet");
    }

}