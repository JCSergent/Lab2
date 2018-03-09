package pkgCore;

import java.util.ArrayList;
import java.util.Collections;
import pkgEnum.*;

public class Deck {

	private ArrayList<Card> cards = new ArrayList<Card>(); 
	
	public Deck(int nOfDecks) {
		
		for(int i=0; i<nOfDecks;i++) {
			for(eRank eRank: eRank.values()) {
				
				for(eSuit eSuit: eSuit.values()) {
					
					cards.add(new Card(eRank,eSuit));
				}
			}
		}
		Collections.shuffle(cards);	
	}
				
	public Card draw() {
		Card c = cards.get(0);
		cards.remove(c);
		return c;
	}
	
	public int SizeOfDeck() {
		return cards.size();
	}
}
