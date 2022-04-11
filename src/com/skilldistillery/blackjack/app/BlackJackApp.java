package com.skilldistillery.blackjack.app;

import java.util.Scanner;

public class BlackJackApp {
	private Scanner sc = new Scanner(System.in);
	private Player player = new Player();
	private Dealer dealer = new Dealer();

	public static void main(String[] args) {
		BlackJackApp app = new BlackJackApp();
		app.startMenu();
	}

	public void run() {
		boolean keepGoing = true;
		while (keepGoing) {
			boolean playerTurn = true;
			boolean dealerTurn = true;
			dealCards();

			if (!player.playerBlackJack()) {
				while (playerTurn && !player.playerBust() && !player.playerTwentyOne()) {
					playerTurn = playerTurn();
				}
				if (player.playerBust()) {
					handValue(player);
					System.out.println("Player is BUST");
				}
				if (player.playerTwentyOne()) {
					handValue(player);
					System.out.println();
				}
			}
			if (!dealer.playerBlackJack()) {
				while (dealerTurn && !player.playerBust() && !dealer.playerTwentyOne()) {
					dealerTurn = dealerTurn();
				}
				if (dealer.playerBust()) {
					handValue(player);
					System.out.println("Dealer is BUST");
				}
			}
			determineWinner(); 
				
			
		}

	}

	public void handValue(Player player) {
		System.out.println("Hand Value " + player.handValue());
		System.out.println();
	}

	private boolean playerTurn() {
		String stringInput = "";
		handValue(player);
		System.out.println("==============================");
		System.out.print("Would you like to hit or stay? ");
		stringInput = sc.nextLine();
		System.out.println();

		if (stringInput.equalsIgnoreCase("hit")) {
			player.addCardToHand(dealer.dealCard());
			player.showHand();
			return true;
		} else if (stringInput.equalsIgnoreCase("Stay")) {
			return false;
		} else {
			System.out.println("Invalid response");
			return true;
		}
	}

	// User Story #5
	private void determineWinner() {
		boolean playerBlackJack = player.playerBlackJack() && !dealer.playerBlackJack();
		boolean equalHands = player.playerBlackJack() && dealer.playerBlackJack()
				|| player.handValue() == dealer.handValue();
		boolean playerWin = dealer.playerBust() && !player.playerBust()
				|| !dealer.playerBlackJack() && (player.handValue() > dealer.handValue() && !player.playerBust());

		if (playerBlackJack) {
			System.out.println("======================");
			System.out.println("===== BLACKJACK! =====");
			System.out.println("======================");
			System.out.println("==== Dealer hand ===== ");
			System.out.println("======================");
			dealer.showHand();
		} else if (playerWin) {
			System.out.println("======================");
			System.out.println("=You Beat the Dealer!=");
			System.out.println("======================");
		} else if (dealer.playerBlackJack()) {
			System.out.println("======================");
			System.out.println("=Dealer Won you Lose!=");
			System.out.println("======================");
		} else if (equalHands) {
			if (player.playerBlackJack() && dealer.playerBlackJack()) {
				System.out.println("======================");
				System.out.println("======== Push ========");
				System.out.println("======================");
			}
			System.out.println("======== Push ========");
		} else {
			System.out.println("======================");
			System.out.println("=Dealer Won you Lose!=");
			System.out.println("======================");
		}
	}

	private boolean dealerTurn() {
		if (dealer.handValue() < 17) {
			dealer.addCardToHand(dealer.dealCard());
			dealer.showHand();
			handValue(dealer);

			if (dealer.handValue() >= 17) {
				return false;
			}
			return true;
		} else {
			System.out.println();
			dealer.showHand();
			handValue(dealer);
			return false;
		}
	}

	public void dealCards() {
		System.out.println("========  BLACKJACK =========");
		int startCards = 2;
		dealer.shuffleDeck();

		while (startCards != 0) {
			player.addCardToHand(dealer.dealCard());
			player.showHand();
			dealer.addCardToHand(dealer.dealCard());
//			dealer.showHand();
			--startCards;
		}
	}

	public void startMenu() {
		System.out.println("========  BLACKJACK =========");
		System.out.println("=========  1.Play  =========");
		System.out.println("=========  2.Quit  =========");
		int option = sc.nextInt();
		sc.nextLine();
		switch (option) {
		case 1:
			run();
			break;
		case 2:
			System.out.println("GoodBye");
			System.exit(0);
		}
	}

}

//Grading
//This is a graded project. You are expected to have your project completed by the start of class on Monday morning.
//You will be given either a pass or fail based on whether your code works given all of the following test conditions:
//Your program must NOT be contained in one procedural main(). You MUST design a OO class structure.
//When the game begins both the player and dealer are dealt two cards.
//If a player or dealer is dealt 21 the game is over. Otherwise the player can choose to 
//hit as many times as they wish until they choose to stay.
//Once the player has completed their turn the dealer will begin their turn, automatically
//hitting or staying according to the Blackjack rules.
//The game is immediately over if either player gets above 21.
//The winner is displayed.

//	User Story #1
//	Create a class structure that mimics a deck of cards. Remember decks as well 
//	as hands are made up of cards. Feel free to create the structure in any way you see fit.
//	Your card and deck implementations should NOT be coupled to Blackjack; you should
//	be able to reuse them to implement a poker or bridge game application.
//	
//	User Story #2
//	Add methods and fields to your classes that mimic the functionality of shuffling 
//	and dealing a deck of cards. Remember that when a card is dealt you have to remove 
//	it from the current deck. You should be able to print out a shuffled deck to the terminal.
//	
//	User Story #3
//	Deal two hands of cards - one to a Dealer and another to a Player. Allow the players 
//	to Hit (add cards to their hand) or Stay (not add cards to their hand) in accordance 
//	to the rules of blackjack shown in the wiki.
//	Do not worry about the multiple values for Ace until your basic game logic is working.
//	Assume they are either 1 or 11 to start.
//	
//	User Story #4
//	The Dealer's decisions are based on game logic in the program.
//	The Dealer must decide to Hit or Stay based on the rules of Blackjack: if the Dealer's
//	hand total is below 17, the Dealer must Hit; if the hand total is 17 or above, the Dealer must Stay.
//	
//	User Story #5
//	Determine the winner of each round by implementing the remaining rules of Blackjack 
//	(such as going over 21) and comparing hand values.