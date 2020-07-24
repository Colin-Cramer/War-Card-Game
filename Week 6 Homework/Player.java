package WarClasses;

import java.util.ArrayList;

public class Player {
	private ArrayList<Card> hand = new ArrayList<>();
	private int score;
	private String name;
	
	public Player(String name) {
		this.name = name;
	}

	public void describe() {
		System.out.println(name + ": ");
		
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		score++;
	}
	
// Getters
	public ArrayList<Card> getHand() {
		return hand;
	}
	
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return name;
	}
}
