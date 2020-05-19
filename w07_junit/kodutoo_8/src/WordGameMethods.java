import java.util.List;

public interface WordGameMethods {

    public List<String> initialize();
    public void newGame();
    public void startGame();
    public String randomizeWords();
    public String showWord();
    public void compareGuess(String guess);

}
