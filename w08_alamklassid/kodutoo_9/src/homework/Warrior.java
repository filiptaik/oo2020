package homework;

public class Warrior extends Player {
    public int health = 50;
    public int strength = 5;
    public String sound = "Im a warrior";

    @Override
    public void makeNoise() {
        System.out.println(sound);
    }

    @Override
    public void doDamage(Enemy enemy) {
        int lives = enemy.health;
        int remaining = lives - strength;
        enemy.health = remaining;
        System.out.println("Enemy heatlh left: " + remaining);
        if (enemy.health >= 0){
            System.out.println("Enemy heatlh left: " + remaining);
        } else {
            super.kill();
        }
    }
}
