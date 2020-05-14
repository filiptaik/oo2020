import java.util.*;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TTT test1 = new TTT();

        System.out.println("Sisesta: rida, veerg");
        //test1.showBoard();
        do
        {
            test1.showBoard();
            int row;
            int col;
            do
            {
                System.out.println(test1.getPlayerMark() + ", sisesta veerg ja rida");
                row = scanner.nextInt()-1;
                col = scanner.nextInt()-1;
            }
            while (!test1.placeMark(row, col));
            test1.changePlayer();
        }
        while(!test1.isWinner() && !test1.isFull());
        if (test1.isFull() && !test1.isWinner())
        {
            System.out.println("Viik");
        }
        else
        {

            test1.showBoard();
            test1.changePlayer();
            System.out.println(Character.toUpperCase(test1.getPlayerMark()) + " võitis");
        }

        scanner.close();
    }
}