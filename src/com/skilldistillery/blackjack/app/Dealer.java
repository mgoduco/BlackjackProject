package com.skilldistillery.blackjack.app;

import com.skilldistillery.blackjack.entitites.Card;
import com.skilldistillery.blackjack.entitites.Deck;

public class Dealer extends Player {

	private Deck dealerDeck = new Deck();

	public Dealer() {
		super();
	}

	public Card dealCard() {
		return dealerDeck.dealCard();
	}

	public void shuffleDeck() {
		dealerDeck.shuffle();
	}

	@Override
	public void showHand() {
		System.out.println("Dealer " + hand.toString());

	}

}
