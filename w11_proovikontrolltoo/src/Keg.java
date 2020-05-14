import java.nio.file.FileSystemNotFoundException;

public class Keg {
    public  float amount;

    public Keg(int amount){
        if(amount < 1500 || amount > 100000){
            System.out.println("Vaat peab sisaldama 1500-100000 ml jooki");
        } else {
            this.amount = amount;
        }
    }

    public float getAmount() {
        return amount;
    }

    public void fillBottle(Bottle bottle) {
        //bottle = new Bottle(BottleType.PLASTIC);
        if (bottle.type == BottleType.GLASS) {
            amount = amount - 150;
            System.out.println("Klaaspudel täidetud!");
            System.out.println("Järgi on: " + amount + "ml kogust jooki");
        } else if (bottle.type == BottleType.PLASTIC) {
            amount = amount - 500;
            System.out.println("Plastikpudel täidetud!");
            System.out.println("Järgi on: " + amount + "ml kogust jooki");
        } else if (bottle.type == BottleType.CAN) {
            amount = amount - 330;
            System.out.println("Purk täidetud!");
            System.out.println("Järgi on: " + amount + "ml kogust jooki");
        }
    }

    public void fillAllBottles(Bottle bottle){
        int counter = 0;
        float runningAmount = amount;
        for(int i = 0; i < amount; i++){
            if(runningAmount != 0){
                runningAmount = runningAmount - bottle.volume;
                counter++;
            } else if(runningAmount == 0) {
                System.out.println("Vaadis oli: " + amount + "ml jooki");
                System.out.println("Täideti " + counter + " " + bottle.type + " tüüpi anumat");
                break;
            }
        }
    }
}

