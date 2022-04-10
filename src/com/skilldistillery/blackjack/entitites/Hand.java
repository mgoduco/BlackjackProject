package com.skilldistillery.blackjack.entitites;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	
	protected List<Card> hand = new ArrayList<>();

	public Hand() {

	}

	public abstract int getHandValue();

	// TODO
	public void addCard(Card card) {
		hand.add(card);
	}

	public void clearHand() {
		hand.clear();
	}

	@Override
	public String toString() {
		return " " + hand;
	}

}
