package com.skilldistillery.blackjack.cards;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Dealing {

	public static void main(String[] args) {
		Dealing d = new Dealing();
		d.run();
	}

	private void run() {
		Scanner sc = new Scanner(System.in);
		Deck deck = new Deck();
		deck.shuffle();
		System.out.println("How many cards: ");

		try {
			int numCards = sc.nextInt();
			if (numCards > 52 || numCards < 0) {
				System.out.println("Please enter a number 52 or below");
				throw new InputMismatchException();
			} 
			List<Card> hand = new ArrayList<>(numCards);
			int value = 0;
			for (int i = 0; i < numCards; i++) {
				Card c = deck.dealCard();
				value += c.getValue();
				hand.add(c);
			}
			printHandValue(hand, value);
		} catch (InputMismatchException e) {
			System.out.println("Invalid number of cards");
		}
	}

	private void printHandValue(List<Card> hand, int value) {
		for (Card card : hand) {
			System.out.println(card);
		}
		System.out.println("Total value: " + value);
	}

}

//Write a program to ask a user how many cards they want.
//Handle the case where users enter a non-integer or a number greater than 52: print an error message.
//Deal the cards and display them on the screen. Also display the total value of all cards.