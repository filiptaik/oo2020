public class Drink {

    //nimetus, hind, kaal
    public DrinkName name;
    public static float price;
    public static float weight;

    public Drink(DrinkName name){
        this.name = name;
        if(name == DrinkName.FANTA){
            price = 2f;
            weight = 530.2f;
        } else if(name == DrinkName.SPRITE){
            price = 1.7f;
            weight = 570.7f;
        } else if(name == DrinkName.LIMPA){
            price = 1;
            weight = 490.1f;
        }
    }

    public static float getDrinkWeight(){
        return weight;
    }

    public static float getDrinkPrice(){
        return price;
    }
}
