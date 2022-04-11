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
		int cardValue = 0;
		for (Card card: super.hand) {
			cardValue += card.getValue();
		}
		return cardValue;
	}

	@Override
	public void addCard(Card card) {
		super.addCard(card);
	}

	public boolean handIsBust() {
		return getHandValue() > BLACKJACK;
	}

	public boolean handIsBlackJack() {
		return getHandValue() == BLACKJACK;
	}
}
