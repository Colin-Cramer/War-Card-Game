package WarClasses;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	private ArrayList<Card> cards = new ArrayList<>();
		
		Deck() {
					
			//Club
			Card twoClub = new Card();
			twoClub.setValue(2);
			twoClub.setName("Two of Clubs");
			
			Card threeClub = new Card();
			threeClub.setValue(3);
			threeClub.setName("Three of Clubs");
			
			Card fourClub = new Card();
			fourClub.setValue(4);
			fourClub.setName("Four of Clubs");
			
			Card fiveClub = new Card();
			fiveClub.setValue(5);
			fiveClub.setName("Five of Clubs");
			
			Card sixClub = new Card();
			sixClub.setValue(6);
			sixClub.setName("Six of Clubs");
			
			Card sevenClub = new Card();
			sevenClub.setValue(7);
			sevenClub.setName("Seven of Clubs");
			
			Card eightClub = new Card();
			eightClub.setValue(8);
			eightClub.setName("Eight of Clubs");
			
			Card nineClub = new Card();
			nineClub.setValue(9);
			nineClub.setName("Nine of Clubs");
			
			Card tenClub = new Card();
			tenClub.setValue(10);
			tenClub.setName("Ten of Clubs");
			
			Card jackClub = new Card();
			jackClub.setValue(11);
			jackClub.setName("Jack of Clubs");
			
			Card queenClub = new Card();
			queenClub.setValue(12);
			queenClub.setName("Queen of Clubs");
			
			Card kingClub = new Card();
			kingClub.setValue(13);
			kingClub.setName("King of Clubs");
			
			Card aceClub = new Card();
			aceClub.setValue(14);
			aceClub.setName("Ace of Clubs");
			
			//Heart
			Card twoHeart = new Card();
			twoHeart.setValue(2);
			twoHeart.setName("Two of Hearts");
			
			Card threeHeart = new Card();
			threeHeart.setValue(3);
			threeHeart.setName("Three of Hearts");
			
			Card fourHeart = new Card();
			fourHeart.setValue(4);
			fourHeart.setName("Four of Hearts");
			
			Card fiveHeart = new Card();
			fiveHeart.setValue(5);
			fiveHeart.setName("Five of Hearts");
			
			Card sixHeart = new Card();
			sixHeart.setValue(6);
			sixHeart.setName("Six of Hearts");
			
			Card sevenHeart = new Card();
			sevenHeart.setValue(7);
			sevenHeart.setName("Seven of Hearts");
			
			Card eightHeart = new Card();
			eightHeart.setValue(8);
			eightHeart.setName("Eight of Hearts");
			
			Card nineHeart = new Card();
			nineHeart.setValue(9);
			nineHeart.setName("Nine of Hearts");
			
			Card tenHeart = new Card();
			tenHeart.setValue(10);
			tenHeart.setName("Ten of Hearts");
			
			Card jackHeart = new Card();
			jackHeart.setValue(11);
			jackHeart.setName("Jack of Hearts");
			
			Card queenHeart = new Card();
			queenHeart.setValue(12);
			queenHeart.setName("Queen of Hearts");
			
			Card kingHeart = new Card();
			kingHeart.setValue(13);
			kingHeart.setName("King of Hearts");
			
			Card aceHeart = new Card();
			aceHeart.setValue(14);
			aceHeart.setName("Ace of Hearts");
			
			//Diamond
			Card twoDiamond = new Card();
			twoDiamond.setValue(2);
			twoDiamond.setName("Two of Diamonds");
			
			Card threeDiamond = new Card();
			threeDiamond.setValue(3);
			threeDiamond.setName("Three of Diamonds");
			
			Card fourDiamond = new Card();
			fourDiamond.setValue(4);
			fourDiamond.setName("Four of Diamonds");
			
			Card fiveDiamond = new Card();
			fiveDiamond.setValue(5);
			fiveDiamond.setName("Five of Diamonds");
			
			Card sixDiamond = new Card();
			sixDiamond.setValue(6);
			sixDiamond.setName("Six of Diamonds");
			
			Card sevenDiamond = new Card();
			sevenDiamond.setValue(7);
			sevenDiamond.setName("Seven of Diamonds");
			
			Card eightDiamond = new Card();
			eightDiamond.setValue(8);
			eightDiamond.setName("Eight of Diamonds");
			
			Card nineDiamond = new Card();
			nineDiamond.setValue(9);
			nineDiamond.setName("Nine of Diamonds");
			
			Card tenDiamond = new Card();
			tenDiamond.setValue(10);
			tenDiamond.setName("Ten of Diamonds");
			
			Card jackDiamond = new Card();
			jackDiamond.setValue(11);
			jackDiamond.setName("Jack of Diamonds");
			
			Card queenDiamond = new Card();
			queenDiamond.setValue(12);
			queenDiamond.setName("Queen of Diamonds");
			
			Card kingDiamond = new Card();
			kingDiamond.setValue(13);
			kingDiamond.setName("King of Diamonds");
			
			Card aceDiamond = new Card();
			aceDiamond.setValue(14);
			aceDiamond.setName("Ace of Hearts");
			
			//Spades
			Card twoSpade = new Card();
			twoSpade.setValue(2);
			twoSpade.setName("Two of Spades");
			
			Card threeSpade = new Card();
			threeSpade.setValue(3);
			threeSpade.setName("Three of Spades");
			
			Card fourSpade = new Card();
			fourSpade.setValue(4);
			fourSpade.setName("Four of Spades");
			
			Card fiveSpade = new Card();
			fiveSpade.setValue(5);
			fiveSpade.setName("Five of Diamonds");
			
			Card sixSpade = new Card();
			sixSpade.setValue(6);
			sixSpade.setName("Six of Spades");
			
			Card sevenSpade = new Card();
			sevenSpade.setValue(7);
			sevenSpade.setName("Seven of Spades");
			
			Card eightSpade = new Card();
			eightSpade.setValue(8);
			eightSpade.setName("Eight of Spades");
			
			Card nineSpade = new Card();
			nineSpade.setValue(9);
			nineSpade.setName("Nine of Spades");
			
			Card tenSpade = new Card();
			tenSpade.setValue(10);
			tenSpade.setName("Ten of Spades");
			
			Card jackSpade = new Card();
			jackSpade.setValue(11);
			jackSpade.setName("Jack of Spades");
			
			Card queenSpade = new Card();
			queenSpade.setValue(12);
			queenSpade.setName("Queen of Spades");
			
			Card kingSpade = new Card();
			kingSpade.setValue(13);
			kingSpade.setName("King of Spades");
			
			Card aceSpade = new Card();
			aceSpade.setValue(14);
			aceSpade.setName("Ace of Spades");
			
			cards.add(twoClub);
			cards.add(threeClub);
			cards.add(fourClub);
			cards.add(fiveClub);
			cards.add(sixClub);
			cards.add(sevenClub);
			cards.add(eightClub);
			cards.add(nineClub);
			cards.add(tenClub);
			cards.add(jackClub);
			cards.add(queenClub);
			cards.add(kingClub);
			cards.add(aceClub);
			cards.add(twoSpade);
			cards.add(threeSpade);
			cards.add(fourSpade);
			cards.add(fiveSpade);
			cards.add(sixSpade);
			cards.add(sevenSpade);
			cards.add(eightSpade);
			cards.add(nineSpade);
			cards.add(tenSpade);
			cards.add(jackSpade);
			cards.add(queenSpade);
			cards.add(kingSpade);
			cards.add(aceSpade);
			cards.add(twoDiamond);
			cards.add(threeDiamond);
			cards.add(fourDiamond);
			cards.add(fiveDiamond);
			cards.add(sixDiamond);
			cards.add(sevenDiamond);
			cards.add(eightDiamond);
			cards.add(nineDiamond);
			cards.add(tenDiamond);
			cards.add(jackDiamond);
			cards.add(queenDiamond);
			cards.add(kingDiamond);
			cards.add(aceDiamond);
			cards.add(twoHeart);
			cards.add(threeHeart);
			cards.add(fourHeart);
			cards.add(fiveHeart);
			cards.add(sixHeart);
			cards.add(sevenHeart);
			cards.add(eightHeart);
			cards.add(nineHeart);
			cards.add(tenHeart);
			cards.add(jackHeart);
			cards.add(queenHeart);
			cards.add(kingHeart);
			cards.add(aceHeart);
		}
			
		public void shuffle() {
			Collections.shuffle(cards);
		}
		
		public Card draw() {
			return cards.remove(0);
		}
}
