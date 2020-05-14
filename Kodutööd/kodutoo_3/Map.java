import java.util.HashMap;
/**
 * Hashmap
 */
public class Map {
    public  HashMap<String, String> hm = new HashMap<String, String>();

    public Map(String maakond, String keskus){
        hm.put("Harjumaa", "Tallinn");
        hm.put("Ida-Virumaa", "Narva");
        hm.put("Saaremaa", "Kuressaare");
        hm.put("Lääne-Virumaa", "Rakvere");
        hm.put(maakond, keskus);
    }
    
    public void getKeskus(String maakond){
        System.out.println(hm.get(maakond));
    }
    

    public static void main(String[] args) {
        Map grr = new Map("Hiiumaa", "Kärdla");
        

        grr.getKeskus("Saaremaa"); 
    }

}
