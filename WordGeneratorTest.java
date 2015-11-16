import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;


public class WordGeneratorTest {

	@Test
	public void testGetWordCount() throws FileNotFoundException {
		WordGenerator w1 = new WordGenerator("src/text.txt");
		for (int i = 0; i < 3; i++)
			w1.next();
		assertEquals("Word count = 3", 3, w1.getWordCount());
	}
	
	@Test
	public void testGetSentenceCount() throws FileNotFoundException {
		WordGenerator w2 = new WordGenerator("src/text.txt");
		for (int i = 0; i < 30; i++)
			w2.next();
		assertEquals("Sentence count = 1", 1, w2.getSentenceCount());
	}
}
