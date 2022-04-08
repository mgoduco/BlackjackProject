package com.skilldistillery.blackjack.app;

import com.skilldistillery.blackjack.entitites.Card;
import com.skilldistillery.blackjack.entitites.Hand;

public class BlackJackHand extends Hand {

	public static final int BLACKJACK = 21;

	public BlackJackHand() {
		super();
	}

	@Override
	public int getHandValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addCard(Card card) {
		// TODO Auto-generated method stub
		super.addCard(card);
	}

	// TODO
	public boolean handIsBust() {
		return false;
	}

	public boolean handIsBlackJack() {
		return false;
	}
}
