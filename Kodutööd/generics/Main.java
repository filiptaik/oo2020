import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





public class Main {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("one", "two", "three");
        List<Integer> integers = Arrays.asList(1, 2, 3);
        List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0);
        List<String> strings2 = new ArrayList<>();

        SimplePair<String, String> pair = new SimplePair<>("name", "Filip");


        Car car = new Car();
        Vehicle car2 = new Car();
        Vehicle vehicle = new Vehicle();
        Bike bike = new Bike();

        System.out.println(
            pair.getKey() + " " +
            pair.getValue()
        );

        System.out.println(
            Generics.getFirst(strings) + ", " +
            Generics.getFirst(integers) + ", " +
            Generics.getFirst(doubles) + " " +
            Generics.getFirst(strings2)
        );

        System.out.println(
            Generics.getWheels(car) + " " +
            Generics.getWheels(car2) + " " +
            Generics.getWheels(vehicle) 

        );

        SimplePair<String, SimplePair<String, String>> pair2 = new SimplePair<>("data", new SimplePair<>("info", "Filip"));
    
        System.out.println(
            pair2.getKey() + " \n\t" +
            pair2.getValue().getKey() + ": " + pair2.getValue().getValue()
        );

        System.out.println(
            Generics.getType(1) + " " +
            Generics.getType("Filip") + " " +
            Generics.getType(1.0) + " " +
            Generics.getType(strings) + " " +
            Generics.getType((byte) 5) + " " +
            Generics.getType((long) 6)
        );
    
    }

}