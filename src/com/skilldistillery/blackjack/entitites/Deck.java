package com.skilldistillery.blackjack.entitites;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deck = new ArrayList<>();

	public Deck() {
		for (Rank rank : Rank.values()) {
			for (Suit suit : Suit.values()) {
				deck.add(new Card(suit, rank));
			}
		}
	}

	public int checkDeckSize() {
		if (deck != null) {
			return deck.size();
		}
		return -1;
	}

	public Card dealCard() {
		return this.deck.remove(this.deck.size() - 1);
	}

	public void shuffle() {
		Collections.shuffle(deck);
	}

	public int getDeckSize() {
		return deck.size();
	}

}

//We will be simulating a deck of cards.
//Create a class Deck. It will hold a List of Cards.
//In the constructor, initialize the List with all 52 cards.
//Add a method checkDeckSize which returns the number of cards still in the deck.
//Add a method dealCard that removes a Card from the deck.
//Add a method shuffle to shuffle the deck.
