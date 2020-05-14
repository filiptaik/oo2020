import java.util.List;

public interface WordGameMethods {

    public void newGame();
    public List<String> initialize();
    public String randomizeWords();
    public String showWord();
    public void compareGuess(String guess);
    public void startGame();

}
