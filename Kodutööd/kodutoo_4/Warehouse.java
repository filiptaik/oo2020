import java.util.*;

/**
 * Warehouse
 */
public class Warehouse {

    static List<Fridge> warehouse = new ArrayList<>();
    private int maxCapacity = 30;

    public static void doesFit(Fridge fridge){
        if (fridge.height > 200){
            System.out.println("Liiga kõrge");
        } else if (fridge.height < 200){
            System.out.println("Mahub");
        } else if(fridge.width > 50){
            System.out.println("Liiga lai");
        } else {
            System.out.println("Mahub");
        }
    }
    
    public void addFridge(Fridge fridge){
        if (warehouse.size() <= maxCapacity){
            warehouse.add(fridge);
            System.out.println("lisati lattu, laos ruumi " + (maxCapacity - warehouse.size()) + " külmikule");
        } else {
            System.out.println("ei lisatud lattu");
        }
    }

    public void removeFridge(Fridge fridge){
        for(int i = 0; i < warehouse.size(); i++){
            if(warehouse.get(i) == fridge){
                warehouse.remove(i);
                System.out.println("Külmik eemaldatud");
            }
            break;
        }
    }

    public void showInventory(){
        System.out.println("Laos on " + warehouse.size() + " külmikut");
    }
}