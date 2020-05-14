import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class WordTest {

    @org.junit.Test
    public void letterFinderTest() {
        Word word1 = new Word("pere");
        assertEquals(word1.letterFinder('a'), 0);
        assertEquals(word1.letterFinder('p'), 1);
        assertEquals(word1.letterFinder('e'), 2);

    }
}