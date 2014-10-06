package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
	private ArrayList<Card> cards;

	public Deck() {

		//	Create an ArrayList of Cards, add each card
		ArrayList<Card> MakingDeck = new ArrayList<Card>();
		for (short i = 0; i <= 3; i++) {
			eSuit SuitValue = eSuit.values()[i];			
			for (short j = 0; j <= 12; j++) {
				eRank RankValue = eRank.values()[j];				
				Card NewCard = new Card(SuitValue, RankValue);
				MakingDeck.add(NewCard);
			}
		}
		
		
		
		//	Set the instance variable
		cards = MakingDeck;
		ShuffleCards();
	}
	
	public Deck (int NumberofJokers){
		this();
		
		for (short i = 1; i <= NumberofJokers; i++){
			cards.add(new Card(eSuit.JOKER, eRank.JOKER));
		}
		ShuffleCards();
	}
	
	public Deck (int NumberofJokers, ArrayList<Card> WildCards){
		this(NumberofJokers);
		
		for (Card deckCard: cards)
		{
			for (Card WildCard: WildCards)
			{
				if((deckCard.getSuit() == WildCard.getSuit()) &&
						(deckCard.getRank() == WildCard.getRank()))
								{
									deckCard.setWild();
								}
			}		
		}
		ShuffleCards();
	}
		
		private void ShuffleCards()
		{
		//	Shuffle the cards
		Collections.shuffle(cards);
		}

	public Card drawFromDeck() {
		// Removes the first card from the deck and return the card
		Card FirstCard = cards.get(0);
		cards.remove(0);
		return FirstCard;
	}

	public int getTotalCards() {
		// Returns the total number of cards still in the deck
		return cards.size();
	}
	
	public ArrayList<Card> getCards(){
		return this.cards;
	}
}