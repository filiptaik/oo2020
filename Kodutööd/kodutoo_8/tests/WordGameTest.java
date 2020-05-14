import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.List;

public class WordGameTest extends TestCase {
    WordGame wg = new WordGame();
    public String [] list1 = {"green", "phone", "books", "mouse"};
    public List<String> list2 = new ArrayList<String>();

    public void testNewGame() {
        assertEquals("_____", "_____");
    }

    public void testInitialize() throws Exception {
        list2.add("green");
        list2.add("phone");
        list2.add("books");
        list2.add("mouse");
        assertEquals(wg.initialize(), list2);
        list2.clear();
    }

    public void testShowWord() {
        wg.initialize();
        wg.newGame();
        assertEquals(wg.showWord(), "_ _ _ _ _");
    }
}