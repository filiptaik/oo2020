package homework;

public class Main {
    public static void fight(Warrior warrior, Wizard wizard){

    }
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        Wizard wizard = new Wizard();
        Enemy enemy = new Enemy();

        warrior.doDamage(enemy);
        warrior.doDamage(enemy);
        wizard.doDamage(enemy);
        wizard.doDamage(enemy);
        wizard.doDamage(enemy);
        wizard.doDamage(enemy);
        wizard.doDamage(enemy);
        
    }
}
