import java.util.*;
import java.util.stream.*; 
/**
 * Arrays
 */
public class Lists {

        public static <T> List<T> arrayToLinked(List<T> arrayL){ 
            List<T> linked = new LinkedList<>(); 

            for (T t : arrayL) { 
                linked.add(t); 
            }
            
            return linked; 
        } 

    public static void main(String[] args) {
        
        List<String> strList = new ArrayList<String>();
        for(int i = 0; i < 10; i++) {
            strList.add("nr: " + i);
        }

        System.out.println(strList);
        System.err.println();
        System.out.println(strList.get(0));
        System.err.println();
        Collections.sort(strList);
        for (String i : strList) {
            System.out.println(i);
        }        

        System.err.println();
        List<String> aL = Arrays.asList("yks", "kaks", "kolm"); 
  
        System.out.println("ArrayList: " + aL); 
  
        List<String> lL = arrayToLinked(aL); 
  
        System.out.println("LinkedList: " + lL); 



    }
}