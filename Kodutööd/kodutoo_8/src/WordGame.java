import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class WordGame implements WordGameMethods {
    public List<String> result = null;
    public int errors;
    public String hiddenWord;
    public char[] board;
    public char c;
    private final int maxErrors = 8;
    private ArrayList <String> letters = new ArrayList<>();
    public String randomWord;

    public boolean board() {
        return hiddenWord.contentEquals(new String(board));
    }

    @Override
    public void newGame() {
        errors = 0;
        hiddenWord = randomizeWords();
        board = new char[hiddenWord.length()];
        Arrays.fill(board, '_');
    }

    public List<String> initialize() {
        result = null;
        try (Stream<String> lines = Files.lines(Paths.get("input/words.txt"))) {
            result = lines.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public String randomizeWords() {
        Random rand = new Random();
        randomWord =  result.get(rand.nextInt(result.size()));
        return randomWord;
    }

    @Override
    public String showWord() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < board.length; i++) {
            builder.append(board[i]);

            if (i < board.length - 1) {
                builder.append(" ");
            }
        }

        return builder.toString();
    }

    @Override
    public void compareGuess(String guess) {
        if (!letters.contains(guess)) {
            if (hiddenWord.contains(guess)) {
                int index = hiddenWord.indexOf(guess);

                while (index >= 0) {
                    board[index] = guess.charAt(0);
                    index = hiddenWord.indexOf(guess, index + 1);
                }
            } else {
                errors++;
            }
            letters.add(guess);
        }

    }

    @Override
    public void startGame() {
        Scanner sc = new Scanner(System.in);
        while(errors < maxErrors){
            System.out.println("Sisesta täht: ");
            String str = sc.next();
            compareGuess(str);
            System.out.println("\n" + showWord());
            if(board()){
                System.out.println("Võitja");
                break;
            } else {
                System.out.println("Katseid järgi: " + (maxErrors - errors));
            }
            if(errors == maxErrors){
                System.out.println("Kaotasid :(");
                System.out.println("Sõna oli: " + hiddenWord);
            }
        }
    }
}
