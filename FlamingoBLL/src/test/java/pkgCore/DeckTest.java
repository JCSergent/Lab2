package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeckTest {

	@Test
	public void TestDeck() {
		
		Deck d = new Deck(1);
		assertEquals(d.SizeOfDeck(),52);
		
		Deck e = new Deck(6);
		assertEquals(e.SizeOfDeck(),312);
		
	}

}
