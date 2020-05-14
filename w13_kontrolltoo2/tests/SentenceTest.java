import org.junit.Test;

import static org.junit.Assert.*;

public class SentenceTest {

    @Test
    public void letterFinder() {
        Sentence sentence = new Sentence("Mulle meeldib apelsin");
        assertEquals(sentence.letterFinder('a'), 1);
    }
}