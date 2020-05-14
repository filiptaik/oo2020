import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Word implements LetterFinder {
    private String word;
    //List<Word> wordList = new ArrayList<Word>();

    public Word(String word) {
        this.word = word;
    }


    public int letterFinder(char letter) {
        char letterUpper = Character.toUpperCase(letter);
        int count = 0;
        int i;
        for (i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            } else if (word.charAt(i) == letterUpper) {
                count++;
            }
        }
        System.out.println("Tähte: " + letter + " oli " + count);
        return count;
    }


    /*
    public void addToList(){
        wordList.add(new Word(toString()));
    }
     */
}
