package WarClasses;

public class App {
	
	public static void main(String[] args) {
		
		Deck playingDeck = new Deck();
		Player player1 = new Player("Frank the Tank");
		Player player2 = new Player("Tom the Bomb");
		
		playingDeck.shuffle();
		dealCardsToPlayers(playingDeck, player1, player2);
		playWar(player1, player2);
		displayFinalScore(player1, player2);		
	}

	private static void displayFinalScore(Player player1, Player player2) {
		if(player1.getScore() == player2.getScore()) {
			System.out.println("Draw!");
		} else if (player1.getScore() > player2.getScore()) {
			System.out.println("The winner is : " + player1.getName() + " with a score of " + player1.getScore() + "!");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("The winner is : " + player2.getName() + " with a score of " + player2.getScore() + "!");
		}
	}

	private static void playWar(Player player1, Player player2) {
		for(int i = 0; i < 26; i++) {			
			Card tempCard1 = player1.flip();
			Card tempCard2 = player2.flip();
			if(tempCard1.getValue() > tempCard2.getValue()) {
				player1.incrementScore();
			} else if (tempCard1.getValue() < tempCard2.getValue()) {
				player2.incrementScore();
			} 
		}
	}

	private static void dealCardsToPlayers(Deck playingDeck, Player player1, Player player2) {
		for(int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(playingDeck);
			} else if (i % 2 != 0) {
				player2.draw(playingDeck);
			}
		}
	}
				
}


