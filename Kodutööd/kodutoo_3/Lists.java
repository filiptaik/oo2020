import java.util.*;
import java.util.Collection;
/**
 * Arrays
 */
public class Lists {

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



    }
}