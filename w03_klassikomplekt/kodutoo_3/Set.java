import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;


public class Set {
    public static void main(String[] args) {

        HashSet<String> kylad = new HashSet<String>();
        kylad.add("Aasa");
        kylad.add("Tuuliku");
        kylad.add("Pulli");
        kylad.add("Jaagupi");
        kylad.add("Võidu");

        System.out.println(kylad.contains("Jaama"));
        System.out.println();
        kylad.remove("Pulli");

        java.util.Iterator<String> iterator = kylad.iterator();
        while (iterator.hasNext()) 
            System.out.println(iterator.next());

    }
}