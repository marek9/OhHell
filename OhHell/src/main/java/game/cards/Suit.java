package game.cards;

import java.util.List;
import java.util.Arrays;

public enum Suit {

	SPADES("Spades","S"),
	HEARTS("Hearts","H"),
	CLUBS("Clubs","C"),
	DIAMONDS("Diamonds","D");
	
	public String suitName;
	public String suitAbbr;
	
	private Suit(String suitName, String suitAbbr)
	{
		this.suitName = suitName;
		this.suitAbbr = suitAbbr;
	}

	public static List<Suit> allSuits() {
		return Arrays.asList(Suit.SPADES,Suit.HEARTS,Suit.DIAMONDS,Suit.CLUBS);
	}
	
	public String toString()
	{
		return suitName;
	}
	
	public String getName()
	{
		return suitName;
	}

	public String getAbbr() {
		return suitAbbr;
	}
	
	
}
