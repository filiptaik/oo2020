import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        /*
        System.out.println("Sisesta üks sõna");
        String input = sc.nextLine();
        Word word1 = new Word(input);
        */


        System.out.println("Sisesta üks lause");
        //String input2 = sc.nextLine();
        Sentence sen1 = new Sentence("Mulle meeldib apelsin");




        //word1.letterFinder('p');

        //System.out.println(word1.toString());

        sen1.getWords();
        sen1.letterFinder('a');

        //sc.close();
    }
}
