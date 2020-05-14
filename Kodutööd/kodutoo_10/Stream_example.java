

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
    String lname;
    float salary;
    int years;

    public Employee(String lname, float salary, int years) {
        this.lname = lname;
        this.salary = salary;
        this.years = years;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lname='" + lname + '\'' +
                ", salary=" + salary +
                ", years=" + years +
                '}';
    }
}

public class Stream_example {

    public static void main(String[] args) {
        Employee[] payroll = new Employee[10];
        String[] names = {"John", "Smith", "Ford", "Ferrari", "Audi", "Lamp", "Pencil", "Drink", "Mouse" , "Cup"};
        int[] years = {2, 3 ,4 ,3 ,2 ,5 ,5 ,3 ,2, 1};
        for (int i = 0; i < 10; i++){
            payroll[i] = new Employee(names[i],(float)Math.random() * 1000, years[i]);
        }
        //System.out.println(Arrays.toString(payroll));

        Stream.of(payroll).filter(e -> e.years >= 4)
                            .map(e ->  e.salary + 150)
                            .sorted(Comparator.reverseOrder())
                            .collect(Collectors.toList())
                            .forEach(System.out::println);


    }
}
