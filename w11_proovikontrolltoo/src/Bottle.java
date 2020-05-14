public class Bottle {

    public BottleType type;
    public float volume;
    private float bottlePrice;
    private float bottleWeight;
    //private Drink drink = new Drink();

    public Bottle(BottleType type){
        this.type = type;
        if(type == BottleType.GLASS){
            volume = 150;
            bottlePrice = 0.3f;
            bottleWeight = 200;
        } else if (type == BottleType.PLASTIC){
            volume = 500;
            bottlePrice = 0.2f;
            bottleWeight = 100;
        } else if (type == BottleType.CAN){
            volume = 330;
            bottlePrice = 0.1f;
            bottleWeight = 50;
        }
    }

    public Bottle(Drink drink, BottleType type){
        this.type = type;
        if(type == BottleType.GLASS){
            volume = 150;
            bottlePrice = 0.3f;
            bottleWeight = 200;
        } else if (type == BottleType.PLASTIC){
            volume = 500;
            bottlePrice = 0.2f;
            bottleWeight = 100;
        } else if (type == BottleType.CAN){
            volume = 330;
            bottlePrice = 0.1f;
            bottleWeight = 50;
        }
    }

    public float getWeight(){
        return Math.round((bottleWeight + Drink.getDrinkWeight()) * 100.0f) / 100.0f;
    }

    public float getPrice(){
        return Math.round((bottlePrice + Drink.getDrinkPrice()) * 100.0f) / 100.0f;

    }
}
