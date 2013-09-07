package game.score;

import java.util.ArrayList;
import java.util.List;

public class ScoreCard {

	private List<HandRecord> scoreTable;
	
	public ScoreCard(int numPlayers)
	{
		scoreTable = new ArrayList<HandRecord>(13);
	}
	
	public HandRecord getHandRecord(int hand)
	{
		return scoreTable.get(hand);
	}
	
}
