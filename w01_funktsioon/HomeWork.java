import java.util.Scanner;
public class HomeWork {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in); 
        System.out.println("Sisesta number");
        int num =myNum.nextInt();
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
    }
}