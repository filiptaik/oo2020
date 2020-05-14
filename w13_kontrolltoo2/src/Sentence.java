import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentence implements LetterFinder {
    private String subject;

    public Sentence(String subject){
        this.subject = subject;
    }


    public int letterFinder(char letter) {
        char letterUpper = Character.toUpperCase(letter);
        int count = 0;
        int count2;
        int i;
        for (i = 0; i < subject.length(); i++) {
            if (subject.charAt(i) == letter) {
                count++;
            } else if (subject.charAt(i) == letterUpper){
                count++;
            }
        }
        System.out.println("Tähte: " + letter + " oli lauses " + count);

        //count = 0;
        count2 = 0;
        int[] letterCount = new int[100];

        String[] words = subject.split("\\s+");
        System.out.println("Vaata "+Arrays.asList(words));
        System.out.println("words.length() : " + words.length);
        for (int q = 0; q < words.length; q++) {
            for (int d = 0; d < words[q].length(); d++) {
                if (words[q].charAt(d) == letter) {
                    count2++;
                    letterCount[q] = count2;
                }
            }
            System.out.println("Sõnas " + words[q] + " oli " + letter + " tähte " + letterCount[q] + " tükki");
            System.out.println();
            count2 = 0;
        }

        return count;
    }

    public void getWords(){
         if (subject == null || subject.isEmpty()) {
             System.out.println("Tekst puudub!");
         }
         String[] words = subject.split("\\s+");
        System.out.println("Sõnu oli: " + words.length);

    }

}
