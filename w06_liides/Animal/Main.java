import java.util.*;


/**
 * Main
 */
public class Main {
    
    public static void main(String[] args) {
        boolean xd;
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kas su loom on agro?");
        String input = scanner.next();

        if(input.equals("jah")){
            xd = true;
        } else {
            xd = false;
        }

        //System.out.println(xd);

        cat1.sleep(22);
        cat1.attack(xd);
        cat1.speak();
        System.out.println();
        dog1.sleep(10);
        dog1.attack(xd);
        dog1.speak();
        


        System.out.println("Sisesta oma isikukood");

        Scanner sc2 = new Scanner(System.in);
        ESTCode test = new ESTCode();
        String personalCode = sc2.next();
        test.getGender(personalCode);
        test.getYear(personalCode);
        test.getBirthday(personalCode);


        scanner.close();
        sc2.close();
    }
    
}