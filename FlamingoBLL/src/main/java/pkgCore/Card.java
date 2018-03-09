package pkgCore;
import pkgEnum.*;
public class Card implements Comparable {

	private eRank eRank;
	private eSuit eSuit;
	
	public Card(eRank eRank, eSuit eSuit) {
		this.eRank = eRank;
		this.eSuit = eSuit;
	}
	
	public eRank geteRank() {
		return eRank;
	}
	
	public eSuit geteSuit() {
		return eSuit;
	}
	
	private void setRank(eRank eRank) {
		this.eRank = eRank;
	}
	
	private void setSuit(eSuit eSuit) {
		this.eSuit = eSuit;
	}
		
	@Override
	public int compareTo(Object o) {
		Card c = (Card) o;
		return c.geteRank().compareTo(this.geteRank());

}
	
}
