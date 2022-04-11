package com.skilldistillery.blackjack.app;

import com.skilldistillery.blackjack.entitites.Card;

public class Player {

	protected BlackJackHand hand = new BlackJackHand();

	public Player() {
	}

	public void addCardToHand(Card c) {
		hand.addCard(c);
	}

	public void showHand() {
		System.out.println("Player " + hand.toString());
	}

	public void foldHand() {
		hand.clearHand();
	}

	public int handValue() {
		return hand.getHandValue();
	}

	public boolean playerBust() {
		return hand.handIsBust();
	}

	public boolean playerBlackJack() {
		return hand.handIsBlackJack();
	}

	public boolean playerTwentyOne() {
		if (hand.getHandValue() == BlackJackHand.BLACKJACK) {
			return true;
		} else {
			return false;
		}

	}

}
