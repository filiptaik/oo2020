/**
 * Dog
 */
public class Dog implements IAnimal {

    @Override
    public void speak() {
        System.out.println("kutsu ütleb auh");
    }

    /*@Override
    public void eat() {
        // TODO Auto-generated method stub

    }*/

    @Override
    public void sleep(int hours) {
        System.out.println("See koer magab "+ hours + " tundi");

    }


    @Override
    public void attack(boolean doesKill) {
        if(doesKill = false){
            System.out.println("See koer ei tapa"); 
        } else {
            System.out.println("See koer on ohtlik");
        }
    }

    
}