import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        
        /*for(Integer i : intList){
            System.out.println(i);
        }
        // Lambda () -> ...
        intList.forEach((i) -> System.out.println(i));
        intList.forEach(System.out::println);*/



        List<Integer> intList2 = intList.stream()
                                        .filter(element -> element < 5)
                                        //.peek(System.out::println)
                                        .collect(Collectors.toList());

      // intList2.forEach(System.out::println);
        System.out.println();
      List<Integer> intList3 = intList.stream()
                                        .filter(element -> element < 3 )
                                        .map(element -> element * 2)
                                        //.peek(System.out::println)
                                        .map(element -> element * 2)
                                        //.peek(System.out::println)
                                        .collect(Collectors.toList());

        /*System.out.println(intList.stream().count());

        System.out.println(intList.stream().skip(3).count());*/


        //IntStream.rangeClosed(1, 5).forEach(System.out::println);
        
        /*IntStream.of(1,2,4,8)
                .map(e -> e * e)
                .filter(e -> e < 50)
                .forEach(System.out::println);*/


        /*IntStream.iterate(1, i -> i * 2)
                .limit(10)
                .forEach(System.out::println);*/


        /*IntStream.range(1, 10)
                .filter(e -> e % 2 == 0)
                .mapToDouble(e-> Math.pow(e, 2))
                .forEach(System.out::println);


        System.out.println(IntStream.of(2, 4, 6, 8)
                                    .allMatch(e -> e % 2 == 0));

        System.out.println(IntStream.of(2,4,6)
                .anyMatch(e -> e % 2 != 0));*/
        

        /*System.out.println(IntStream.of(1, 5, 10)
                                    .filter(e -> e > 4)
                                    .findFirst().getAsInt());*/
        /*System.out.println(IntStream.of(1, 5, 10)
                                    .filter(e -> e > 4)
                                    .max().getAsInt());*/
        
        
                               
                                                        
    }
}