package com.skilldistillery.blackjack.app;

public class Player {

	protected BlackJackHand hand = new BlackJackHand();

	public Player() {
	}

	public void addCardToHand() {
		// TODO
	}

	public void showHand() {
		System.out.println("Player " + hand.toString());
	}

	public void foldHand() {
		// TODO
	}

	public int handValue() {
		return 0;
	}

	public boolean playerBust() {
		return false;
	}

	public boolean playerBlackJack() {
		return false;
	}

}
