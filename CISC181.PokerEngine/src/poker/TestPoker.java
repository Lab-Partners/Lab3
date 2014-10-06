package poker;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPoker {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		
	}
	
	@AfterClass
	public static void tearnDownAfterClass() throws Exception{
		
	}
	
	@Before
	public static void setUp() throws Exception{
		
	}
	
	@After
	public static void tearDown() throws Exception{
		
	}

	@Test
	public final void TesoneJokerFiveKind(){
		
		ArrayList<Card> testHand = new ArrayList<Card>();
		testHand.add(new Card(eSuit.HEARTS,eRank.FIVE));
		testHand.add(new Card(eSuit.DIAMONDS,eRank.FIVE));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		testHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		Hand h = Hand.EvalHand(testHand);
		
		assertEquals("should be rf:",eHandStrength.FiveOfAKind.getHandStrength(),h.getHandStrength());
		assertEquals("should not be natural:",0,h.getNatural());


	}
	
	@Test
	public final void TesttwoJokerFiveKind(){
		
		ArrayList<Card> testHand = new ArrayList<Card>();
		testHand.add(new Card(eSuit.HEARTS,eRank.FIVE));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		testHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		testHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		Hand h = Hand.EvalHand(testHand);
		
		assertEquals("should be rf:",eHandStrength.FiveOfAKind.getHandStrength(),h.getHandStrength());
		assertEquals("should not be natural:",0,h.getNatural());


	}
	
	@Test
	public final void TestnaturalRoyalFlush(){
		
		ArrayList<Card> testHand = new ArrayList<Card>();
		testHand.add(new Card(eSuit.SPADES,eRank.QUEEN));
		testHand.add(new Card(eSuit.SPADES,eRank.JACK));
		testHand.add(new Card(eSuit.SPADES,eRank.TEN));
		testHand.add(new Card(eSuit.SPADES,eRank.KING));
		testHand.add(new Card(eSuit.SPADES,eRank.ACE));
		Hand h = Hand.EvalHand(testHand);
		
		assertEquals("should be rf:",eHandStrength.RoyalFlush.getHandStrength(),h.getHandStrength());
		assertEquals("should be natural:",1,h.getNatural());


	}
	
	@Test
	public final void TestoneJokerRoyalFlush(){
		
		ArrayList<Card> testHand = new ArrayList<Card>();
		testHand.add(new Card(eSuit.SPADES,eRank.QUEEN));
		testHand.add(new Card(eSuit.SPADES,eRank.JACK));
		testHand.add(new Card(eSuit.SPADES,eRank.TEN));
		testHand.add(new Card(eSuit.SPADES,eRank.KING));
		testHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		Hand h = Hand.EvalHand(testHand);
		
		assertEquals("should be rf:",eHandStrength.RoyalFlush.getHandStrength(),h.getHandStrength());
		assertEquals("should not be natural:",0,h.getNatural());

	}
	
	@Test
	public final void TesttwoJokerRoyalFlush(){
		
		ArrayList<Card> testHand = new ArrayList<Card>();
		testHand.add(new Card(eSuit.SPADES,eRank.QUEEN));
		testHand.add(new Card(eSuit.SPADES,eRank.JACK));
		testHand.add(new Card(eSuit.SPADES,eRank.TEN));
		testHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		testHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		Hand h = Hand.EvalHand(testHand);
		
		assertEquals("should be rf:",eHandStrength.RoyalFlush.getHandStrength(),h.getHandStrength());
		assertEquals("should not be natural:",0,h.getNatural());


	}
	
	@Test
	public final void TestnaturalStraightFlush(){
		
		ArrayList<Card> testHand = new ArrayList<Card>();
		testHand.add(new Card(eSuit.SPADES,eRank.NINE));
		testHand.add(new Card(eSuit.SPADES,eRank.EIGHT));
		testHand.add(new Card(eSuit.SPADES,eRank.SEVEN));
		testHand.add(new Card(eSuit.SPADES,eRank.SIX));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		Hand h = Hand.EvalHand(testHand);
		
		assertEquals("should be rf:",eHandStrength.StraightFlush.getHandStrength(),h.getHandStrength());
		assertEquals("should be natural:",1,h.getNatural());


	}
	
	@Test
	public final void TestoneJokerStraightFlush(){
		
		ArrayList<Card> testHand = new ArrayList<Card>();
		testHand.add(new Card(eSuit.SPADES,eRank.EIGHT));
		testHand.add(new Card(eSuit.SPADES,eRank.SEVEN));
		testHand.add(new Card(eSuit.SPADES,eRank.SIX));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		Hand h = Hand.EvalHand(testHand);
		
		assertEquals("should be rf:",eHandStrength.StraightFlush.getHandStrength(),h.getHandStrength());
		assertEquals("should not be natural:",0,h.getNatural());

	}
	
	@Test
	public final void TesttwoJokerStraightFlush(){
		
		ArrayList<Card> testHand = new ArrayList<Card>();
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.SPADES,eRank.SIX));
		testHand.add(new Card(eSuit.SPADES,eRank.SEVEN));
		testHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		testHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		Hand h = Hand.EvalHand(testHand);
		
		assertEquals("should be rf:",eHandStrength.StraightFlush.getHandStrength(),h.getHandStrength());
		assertEquals("should not be natural:",0,h.getNatural());


	}
	
	@Test
	public final void TestnaturalFourKind(){
		
		ArrayList<Card> testHand = new ArrayList<Card>();
		testHand.add(new Card(eSuit.SPADES,eRank.ACE));
		testHand.add(new Card(eSuit.HEARTS,eRank.FIVE));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		Hand h = Hand.EvalHand(testHand);
		
		assertEquals("should be rf:",eHandStrength.FourOfAKind.getHandStrength(),h.getHandStrength());
		assertEquals("should be natural:",1,h.getNatural());


	}
	
	@Test
	public final void TestoneJokerFourKind(){
		
		ArrayList<Card> testHand = new ArrayList<Card>();
		testHand.add(new Card(eSuit.SPADES,eRank.ACE));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.HEARTS,eRank.FIVE));
		testHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		Hand h = Hand.EvalHand(testHand);
		
		assertEquals("should be rf:",eHandStrength.FourOfAKind.getHandStrength(),h.getHandStrength());
		assertEquals("should not be natural:",0,h.getNatural());

	}
	
	@Test
	public final void TesttwoJokerFourKind(){
		
		ArrayList<Card> testHand = new ArrayList<Card>();
		testHand.add(new Card(eSuit.HEARTS,eRank.ACE));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		testHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		Hand h = Hand.EvalHand(testHand);
		
		assertEquals("should be rf:",eHandStrength.FourOfAKind.getHandStrength(),h.getHandStrength());
		assertEquals("should not be natural:",0,h.getNatural());


	}
	
	@Test
	public final void TestnaturalFullHouse(){
		
		ArrayList<Card> testHand = new ArrayList<Card>();
		testHand.add(new Card(eSuit.HEARTS,eRank.TWO));
		testHand.add(new Card(eSuit.SPADES,eRank.TWO));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		Hand h = Hand.EvalHand(testHand);
		
		assertEquals("should be rf:",eHandStrength.FullHouse.getHandStrength(),h.getHandStrength());
		assertEquals("should be natural:",1,h.getNatural());


	}
	
	@Test
	public final void TestoneJokerFullHouse(){
		
		ArrayList<Card> testHand = new ArrayList<Card>();
		testHand.add(new Card(eSuit.HEARTS,eRank.TWO));
		testHand.add(new Card(eSuit.SPADES,eRank.TWO));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		Hand h = Hand.EvalHand(testHand);
		
		assertEquals("should be rf:",eHandStrength.FullHouse.getHandStrength(),h.getHandStrength());
		assertEquals("should not be natural:",0,h.getNatural());


	}
	
	@Test
	public final void TestnaturalFlush(){
		
		ArrayList<Card> testHand = new ArrayList<Card>();
		testHand.add(new Card(eSuit.SPADES,eRank.EIGHT));
		testHand.add(new Card(eSuit.SPADES,eRank.FOUR));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.SPADES,eRank.TWO));
		testHand.add(new Card(eSuit.SPADES,eRank.SIX));
		Hand h = Hand.EvalHand(testHand);
		
		assertEquals("should be rf:",eHandStrength.Flush.getHandStrength(),h.getHandStrength());
		assertEquals("should be natural:",1,h.getNatural());


	}
	
	@Test
	public final void TestoneJokerFlush(){
		
		ArrayList<Card> testHand = new ArrayList<Card>();
		testHand.add(new Card(eSuit.SPADES,eRank.NINE));
		testHand.add(new Card(eSuit.SPADES,eRank.TWO));
		testHand.add(new Card(eSuit.SPADES,eRank.FOUR));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		Hand h = Hand.EvalHand(testHand);
		
		assertEquals("should be rf:",eHandStrength.Flush.getHandStrength(),h.getHandStrength());
		assertEquals("should not be natural:",0,h.getNatural());


	}
	
	@Test
	public final void TesttwoJokerFlush(){
		
		ArrayList<Card> testHand = new ArrayList<Card>();
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		testHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		Hand h = Hand.EvalHand(testHand);
		
		assertEquals("should be rf:",eHandStrength.Flush.getHandStrength(),h.getHandStrength());
		assertEquals("should not be natural:",0,h.getNatural());


	}
	
	@Test
	public final void TestnaturalStraight(){
		
		ArrayList<Card> testHand = new ArrayList<Card>();
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.SPADES,eRank.SIX));
		testHand.add(new Card(eSuit.SPADES,eRank.SEVEN));
		testHand.add(new Card(eSuit.SPADES,eRank.EIGHT));
		testHand.add(new Card(eSuit.SPADES,eRank.NINE));
		Hand h = Hand.EvalHand(testHand);
		
		assertEquals("should be rf:",eHandStrength.Straight.getHandStrength(),h.getHandStrength());
		assertEquals("should be natural:",1,h.getNatural());


	}
	
	@Test
	public final void TestoneJokerStraight(){
		
		ArrayList<Card> testHand = new ArrayList<Card>();
		testHand.add(new Card(eSuit.SPADES,eRank.EIGHT));
		testHand.add(new Card(eSuit.SPADES,eRank.SEVEN));
		testHand.add(new Card(eSuit.SPADES,eRank.SIX));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		Hand h = Hand.EvalHand(testHand);
		
		assertEquals("should be rf:",eHandStrength.Straight.getHandStrength(),h.getHandStrength());
		assertEquals("should not be natural:",0,h.getNatural());


	}
	
	@Test
	public final void TesttwoJokerStraight(){
		
		ArrayList<Card> testHand = new ArrayList<Card>();
		testHand.add(new Card(eSuit.CLUBS,eRank.FOUR));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.SPADES,eRank.THREE));
		testHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		testHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		Hand h = Hand.EvalHand(testHand);
		
		assertEquals("should be rf:",eHandStrength.Straight.getHandStrength(),h.getHandStrength());
		assertEquals("should not be natural:",0,h.getNatural());


	}
	
	@Test
	public final void TestnaturalThreeKind(){
		
		ArrayList<Card> testHand = new ArrayList<Card>();
		testHand.add(new Card(eSuit.HEARTS,eRank.SEVEN));
		testHand.add(new Card(eSuit.SPADES,eRank.SIX));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		Hand h = Hand.EvalHand(testHand);
		
		assertEquals("should be rf:",eHandStrength.ThreeOfAKind.getHandStrength(),h.getHandStrength());
		assertEquals("should be natural:",1,h.getNatural());


	}
	
	@Test
	public final void TestoneJokerThreeKind(){
		
		ArrayList<Card> testHand = new ArrayList<Card>();
		testHand.add(new Card(eSuit.SPADES,eRank.ACE));
		testHand.add(new Card(eSuit.SPADES,eRank.EIGHT));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		testHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		Hand h = Hand.EvalHand(testHand);
		
		assertEquals("should be rf:",eHandStrength.ThreeOfAKind.getHandStrength(),h.getHandStrength());
		assertEquals("should not be natural:",0,h.getNatural());


	}
	
	@Test
	public final void TestNaturalTwoPair(){
		
		ArrayList<Card> testHand = new ArrayList<Card>();
		testHand.add(new Card(eSuit.SPADES,eRank.SEVEN));
		testHand.add(new Card(eSuit.CLUBS,eRank.SIX));
		testHand.add(new Card(eSuit.SPADES,eRank.SIX));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		Hand h = Hand.EvalHand(testHand);
		
		assertEquals("should be rf:",eHandStrength.TwoPair.getHandStrength(),h.getHandStrength());
		assertEquals("should be natural:",1,h.getNatural());


	}
	
	@Test
	public final void TestnaturalOnePair(){
		
		ArrayList<Card> testHand = new ArrayList<Card>();
		testHand.add(new Card(eSuit.SPADES,eRank.SEVEN));
		testHand.add(new Card(eSuit.SPADES,eRank.SIX));
		testHand.add(new Card(eSuit.SPADES,eRank.FIVE));
		testHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		testHand.add(new Card(eSuit.SPADES,eRank.TWO));
		Hand h = Hand.EvalHand(testHand);
		
		assertEquals("should be rf:",eHandStrength.Pair.getHandStrength(),h.getHandStrength());
		assertEquals("should be natural:",1,h.getNatural());


	}
	
	@Test
	public final void TestoneJokerOnePair(){
		
		ArrayList<Card> testHand = new ArrayList<Card>();
		testHand.add(new Card(eSuit.JOKER,eRank.JOKER));
		testHand.add(new Card(eSuit.SPADES,eRank.NINE));
		testHand.add(new Card(eSuit.SPADES,eRank.SEVEN));
		testHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		testHand.add(new Card(eSuit.SPADES,eRank.TWO));
		Hand h = Hand.EvalHand(testHand);
		
		assertEquals("should be rf:",eHandStrength.Pair.getHandStrength(),h.getHandStrength());
		assertEquals("should not be natural:",0,h.getNatural());


	}
	


}
