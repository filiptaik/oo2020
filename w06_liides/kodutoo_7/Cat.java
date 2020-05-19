
/**
 * Cat
 */
public class Cat implements IAnimal {

    public void speak() {
        System.out.println("kiisu ütleb mjäu");
    }


    public void sleep(int hours) {
        System.out.println("See kass magab "+ hours + " tundi");
    }



    public void attack(boolean doesKill) {

        if(doesKill == false){
            System.out.println("See kass ei tapa"); 
        } else {
            System.out.println("See kass on ohtlik");
        }
    }

    
}