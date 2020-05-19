
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 1) Luua 2 olukorda koodis, mis viskaks exceptioni ning try-catch blokiga
 * kinni püüda ja loggida tulemus faili 2) Luua 3 List tüüpi muutujat, milles
 * ühe sees on stringid, teise sees integer arvud ja forEachiga välja printida
 * 3) Kasutada filter/map/skip/min/max/count/collect funktsioone ja näidata
 * midagi huvitavat nende andmetega 4) IntStream.of ja IntStream.range -iga
 * näidata toimivust mingisugusest kogumikust välja filtreerida paaris ja
 * paaritud arvud ning kasutada allMatch/anyMatch funktsioone ka, et leida
 * esinevus
 */
public class Tunnitöö2 {
    public static void main(String[] args) throws IOException {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<String> strList = Arrays.asList("esimene", "teine", "kolmas", "neljas", "viies", "Kuues");

        /*
        strList.forEach(System.out::println);
        intList.forEach(System.out::println);
        */


        List<String> strList2 = strList.stream()
                                        .filter(word -> !"kolmas".equals(word) && !"Kuues".equals(word))
                                        .collect(Collectors.toList());
        strList2.forEach(System.out::println);

        System.out.println();
       
        List<String> strList3 =strList.stream()
                                        .map(element -> element.toUpperCase())
                                        .peek(System.out::println)
                                        .collect(Collectors.toList());
                                        System.out.println();

        /*
        // Tahaks nii et ta mapib mulle need elemendid mis sisaldavad suuri tähti
        List<String> strList4 =strList.stream()
                                        .map(element -> element.())
                                        .peek(System.out::println)
                                        .collect(Collectors.toList());

         */

        
        //List<Integer> intList1 = intList.stream().count();

        PrintWriter pw = new PrintWriter(new FileWriter("output_ordered.txt"));

        Files.readAllLines(Paths.get("output.txt")).stream()
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList())
                    .forEach(pw::println);
        pw.close();

        IntStream intS = IntStream.of(1,2,5,34,9,11,23,8,234);

        intS.filter(c -> c %2 == 0)
            .forEach(System.out::println);

        IntStream intS2 = IntStream.range(1,10);

        intS2.filter(c -> c %2 == 0)
                .forEach(System.out::println);    }

} 