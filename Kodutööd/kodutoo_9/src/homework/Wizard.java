package homework;

public class Wizard extends Player {
    public int health = 100;
    public int strength = 10;
    public String sound = "Im a wizard";


    @Override
    public void makeNoise() {
        System.out.println(sound);
    }

    @Override
    public void doDamage(Enemy enemy) {
        int lives = enemy.health;
        int remaining =  lives - strength;
        enemy.health = remaining;
        if (enemy.health >= 0){
            System.out.println("Enemy heatlh left: " + remaining);
        } else {
            super.kill();
        }
    }
}
