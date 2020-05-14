package homework;

public abstract class Player {
    public abstract void makeNoise();
    public abstract void doDamage(Enemy enemy);
    public void kill(){
        System.out.println("Enemy killed");
    }
}
