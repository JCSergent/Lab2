package pkgCore;

import java.util.ArrayList;
import java.util.Collections;

import pkgEnum.*;

public class Hand {

	private int iScore;
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public Hand()
	{
		
	}
	
	public int[] ScoreHand()
	{
		int [] iScore = new int[2];
		
		iScore[0] = 0;
		iScore[1] = 0;
		
		Collections.sort(cards);
		
		
		
		for (Card c: cards)
		{
			if((c.geteRank().getiRankNbr()==11) || (c.geteRank().getiRankNbr()==12) || (c.geteRank().getiRankNbr()==13)) {
				iScore[0] += 10;
				iScore[1] += 10;
			}
			else if(c.geteRank().getiRankNbr()==14) {
				iScore[0] += 1;
				if(iScore[1] > 10) {
					iScore[1] += 1;
				}
				else {
					iScore[1] += 11;
				}
			}
			else {
				iScore[0] += c.geteRank().getiRankNbr();
				iScore[1] += c.geteRank().getiRankNbr();
			}
		}
		return iScore;
	}
	
	public void Draw(Deck d)
	{
		cards.add(d.draw());
	}
	
	private void AddCard(Card c)
	{
		cards.add(c);
	}
	
}
